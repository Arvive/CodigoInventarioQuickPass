/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quickpasstesis.logica;

/**
 *
 * @author Usuario
 */
public class Controladora {
    
    
   /* public class ProductoService { algo asi para restriccion en numeros de serie 

    @PersistenceContext
    private EntityManager em;

    public boolean existeNumeroSerie(String numeroSerie) {
        // Verificar si ya existe un producto con ese número de serie
        Long count = em.createQuery("SELECT COUNT(p) FROM Producto p WHERE p.numeroSerie = :numeroSerie", Long.class)
                       .setParameter("numeroSerie", numeroSerie)
                       .getSingleResult();
        return count > 0;
    }

    public void crearProducto(Producto producto) {
        if (existeNumeroSerie(producto.getNumeroSerie())) {
            throw new IllegalArgumentException("El número de serie ya existe.");
        }
        
        em.persist(producto);
    }
}*/

    
    /*UsuarioService usuarioService = new UsuarioService(em);// se CREAN CLASES DE SERVICIOS PARA ESTO
        if (usuarioService.existeCedula(usuario.getCedula())) {
            System.out.println("La cédula ya está registrada.");
        } else if (usuarioService.existeCorreo(usuario.getCorreo())) {
            System.out.println("El correo ya está registrado.");
        } else {
            em.persist(usuario);
            em.getTransaction().commit();
            System.out.println("Usuario creado con éxito: " + usuario);
        }*/
}
