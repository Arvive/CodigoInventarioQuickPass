/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quickpasstesis.persistencia;

import com.mycompany.quickpasstesis.logica.Producto;
import com.mycompany.quickpasstesis.logica.Usuario;
import com.mycompany.quickpasstesis.persistencia.exceptions.NonexistentEntityException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class ControladoraPersistencia {
    
    ProductoJpaController productoJpa = new ProductoJpaController();
    UsuarioJpaController usuarioJpa= new UsuarioJpaController();

    public void guardar(Producto producto) {
        
        //crear base de datos el product
        productoJpa.create(producto);
        
    }
//busca todos los registros y asigna lo que yo diga
    public List<Producto> traerProductos() {
        
        return productoJpa.findProductoEntities();
    }

    public void borrarProducto(int idProducto) {
        try {
            productoJpa.destroy(idProducto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Producto traerProducto(int idProducto) {
         return productoJpa.findProducto(idProducto);
    }

    public void modificarProducto(Producto producto) {
        try {
            productoJpa.edit(producto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public List<Producto> buscarProductosPorFiltros(LocalDateTime fechaDesde, LocalDateTime fechaHasta, String oficina, String estado, String numSerie) {
       return productoJpa.findProductosPorFiltros(fechaDesde, fechaHasta, oficina, estado, numSerie);
    }

    
     public void crearUsuario(Usuario usuario) throws Exception {
        usuarioJpa.create(usuario);
    }

    public void editarUsuario(Usuario usuario) throws Exception {
        usuarioJpa.edit(usuario);
    }

    public void eliminarUsuario(String idUsuario) throws Exception {
        usuarioJpa.destroy(idUsuario);
    }

    public List<Usuario> obtenerUsuarios() {
        return usuarioJpa.findUsuarioEntities();
    }

    public Usuario obtenerUsuarioPorId(String id) {
        return usuarioJpa.findUsuario(id);
    }

    public boolean existeAdministrador() {
        List<Usuario> usuarios = usuarioJpa.findUsuarioEntities();
        for (Usuario usuario : usuarios) {
            if (usuario.getTipoRol() == Usuario.TipoRol.ADMINISTRADOR) {
                return true;
            }
        }
        return false;
    }
    
    
}
