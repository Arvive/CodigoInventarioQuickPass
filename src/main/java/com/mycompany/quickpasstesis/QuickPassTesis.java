/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quickpasstesis;

import com.mycompany.quickpasstesis.logica.Producto;
import com.mycompany.quickpasstesis.logica.Usuario;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class QuickPassTesis {

    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("QuickPassPU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
       /* Producto producto = new Producto();
        System.out.println("Producto creado: " + producto);
        producto.setCantidad(1);
        producto.setCategoria(Producto.Categoria.QUICKPASS);
        producto.setEstado(Producto.Estado.ACTIVO);
        producto.setFechaRegistro(LocalDateTime.now());
        producto.setNumeroCaja("1A");
        producto.setNumeroSerie("A123");
        producto.setOficina(Producto.Oficina.OFICINA_CENTRAL);
        producto.setPrecioDisp(new BigDecimal("4500"));
        producto.calcularFechaVencimiento();  
        
        em.persist(producto);
        
        em.getTransaction().commit();*/ //CREACION TABLA PRODUCTOS BASE DE DATOS 
        
       
        Usuario usuario = new Usuario();
        usuario.setNombre("Ariana Vives");
        usuario.setIdUsuario("1234");
        usuario.setCorreo("avives@bncr.fi.cr");
        usuario.setContrasena("1234");
        usuario.setTipoRol(Usuario.TipoRol.USUARIO);
       
        em.persist(usuario);
        em.getTransaction().commit();
        
        em.close();
        emf.close();
        
        
        
        
    }
}
