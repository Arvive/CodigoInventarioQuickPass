/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quickpasstesis.persistencia;

import com.mycompany.quickpasstesis.logica.Producto;
import com.mycompany.quickpasstesis.persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Usuario
 */
public class ProductoJpaController implements Serializable {

    public ProductoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    
    public ProductoJpaController() {//creado constructor
        emf = Persistence.createEntityManagerFactory("QuickPassPU");
       }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Producto producto) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(producto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Producto producto) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            producto = em.merge(producto);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = producto.getIdProducto();
                if (findProducto(id) == null) {
                    throw new NonexistentEntityException("The producto with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Producto producto;
            try {
                producto = em.getReference(Producto.class, id);
                producto.getIdProducto();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The producto with id " + id + " no longer exists.", enfe);
            }
            em.remove(producto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Producto> findProductoEntities() {
        return findProductoEntities(true, -1, -1);
    }

    public List<Producto> findProductoEntities(int maxResults, int firstResult) {
        return findProductoEntities(false, maxResults, firstResult);
    }

    private List<Producto> findProductoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Producto.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Producto findProducto(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Producto.class, id);
        } finally {
            em.close();
        }
    }

    public int getProductoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Producto> rt = cq.from(Producto.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    public List<Producto> findProductosPorFiltros(//agregado fecha opcional 
    LocalDateTime fechaDesde, LocalDateTime fechaHasta,
    String oficina, String estado, String numSerie
) {
    EntityManager em = getEntityManager();
    try {
        String jpql = "SELECT p FROM Producto p WHERE 1 = 1"; // Condición siempre verdadera

        // Agregar condiciones solo si los filtros no son nulos o vacíos
        if (fechaDesde != null && fechaHasta != null) {
            jpql += " AND p.fechaRegistro BETWEEN :fechaDesde AND :fechaHasta";
        }
        if (oficina != null && !oficina.isEmpty()) {
            jpql += " AND p.oficina = :oficina";
        }
        if (estado != null && !estado.isEmpty()) {
            jpql += " AND p.estado = :estado";
        }
        if (numSerie != null && !numSerie.isEmpty()) {
            jpql += " AND p.numeroSerie = :numSerie";
        }

        TypedQuery<Producto> query = em.createQuery(jpql, Producto.class);

        // Agregar parámetros solo si los filtros no son nulos o vacíos
        if (fechaDesde != null && fechaHasta != null) {
            query.setParameter("fechaDesde", fechaDesde);
            query.setParameter("fechaHasta", fechaHasta);
        }
        if (oficina != null && !oficina.isEmpty()) {
            query.setParameter("oficina", oficina);
        }
        if (estado != null && !estado.isEmpty()) {
            query.setParameter("estado", estado);
        }
        if (numSerie != null && !numSerie.isEmpty()) {
            query.setParameter("numSerie", numSerie);
        }

        return query.getResultList();
    } finally {
        em.close();
    }
}
    
    
}
