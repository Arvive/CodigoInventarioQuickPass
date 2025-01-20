/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quickpasstesis.logica;

import com.mycompany.quickpasstesis.persistencia.UsuarioJpaController;
import com.mycompany.quickpasstesis.persistencia.exceptions.NonexistentEntityException;
import com.mycompany.quickpasstesis.persistencia.exceptions.PreexistingEntityException;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class UsuarioService {
    
    private final UsuarioJpaController usuarioJpaController;

    public UsuarioService(UsuarioJpaController usuarioJpaController) {
        this.usuarioJpaController = usuarioJpaController;
    }
    
     // Verificar si el usuario en sesión tiene el rol de ADMINISTRADOR
    private void verificarAccesoAdministrador(Usuario usuarioSesion) {
        if (usuarioSesion.getTipoRol() != Usuario.TipoRol.ADMINISTRADOR) {
            throw new SecurityException("Acceso denegado: Solo los administradores pueden realizar esta operación.");
        }
    }

    // Método para crear un usuario
    public void crearUsuario(Usuario usuario, Usuario usuarioSesion) throws PreexistingEntityException, Exception {
        // Verificar si el usuario en sesión es un administrador
        verificarAccesoAdministrador(usuarioSesion);
        usuarioJpaController.create(usuario);
    }

    // Método para editar un usuario
    public void editarUsuario(Usuario usuario, Usuario usuarioSesion) throws NonexistentEntityException, Exception {
        // Verificar si el usuario en sesión es un administrador
        verificarAccesoAdministrador(usuarioSesion);
        usuarioJpaController.edit(usuario);
    }

    // Método para eliminar un usuario
    public void eliminarUsuario(String idUsuario, Usuario usuarioSesion) throws NonexistentEntityException {
        // Verificar si el usuario en sesión es un administrador
        verificarAccesoAdministrador(usuarioSesion);
        usuarioJpaController.destroy(idUsuario);
    }

    // Método para obtener todos los usuarios
    public List<Usuario> obtenerUsuarios() {
        return usuarioJpaController.findUsuarioEntities();
    }

    // Método para obtener un usuario por su ID
    public Usuario obtenerUsuarioPorId(String id) {
        return usuarioJpaController.findUsuario(id);
    }
    
   /* public void registrarUsuario(String idUsuario, String nombre, String correo, String password) {
    // Verifica si ya existe un administrador
    Usuario admin = usuarioJpaController.findUsuario("admin123");
    
    // Si no existe, este usuario será el primer administrador
    if (admin == null) {
        admin = new Usuario();
        admin.setIdUsuario(idUsuario);
        admin.setNombre(nombre);
        admin.setCorreo(correo);
        admin.setPassword(password); // Asegúrate de cifrar la contraseña
        admin.setRol("ADMIN"); // Este es el primer administrador
        try {
            usuarioJpaController.create(admin);
        } catch (Exception e) {
            // Manejo de errores
        }
    } else {
        // Si ya hay un administrador, se registra como usuario normal
        Usuario usuario = new Usuario();
        usuario.setIdUsuario(idUsuario);
        usuario.setNombre(nombre);
        usuario.setCorreo(correo);
        usuario.setPassword(password); // Asegúrate de cifrar la contraseña
        usuario.setRol("USER");
        try {
            usuarioJpaController.create(usuario);
        } catch (Exception e) {
            // Manejo de errores
        }
    }*/
}


    

