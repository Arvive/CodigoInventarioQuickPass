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
    
    UsuarioJpaController usuarioJpaController = new UsuarioJpaController();// se cambia del codigo anterior
    
     // Verificar si el usuario en sesión tiene el rol de ADMINISTRADOR
    private void verificarAccesoAdministrador(Usuario usuarioSesion) {
        if (usuarioSesion.getTipoRol() != Usuario.TipoRol.ADMINISTRADOR) {// aca si cambio a usuario deja crear usuarios
            throw new SecurityException("Acceso denegado: Solo los administradores pueden realizar esta operación.");
        }
    }
        
    // Método para verificar si ya existe un administrador
    public boolean existeAdministrador() {
        List<Usuario> usuarios = usuarioJpaController.findUsuarioEntities();
        for (Usuario usuario : usuarios) {
            if (usuario.getTipoRol() == Usuario.TipoRol.ADMINISTRADOR) {
                return true;  // Si encontramos un administrador, retornamos true
            }
        }
        return false;  // Si no encontramos un administrador
    }
     // Método para crear un administrador si no existe
    public void crearAdministradorSiNoExiste() throws PreexistingEntityException, Exception {
        if (!existeAdministrador()) {
            // Crear un nuevo administrador
            Usuario admin = new Usuario("admin123", "Administrador", Usuario.TipoRol.ADMINISTRADOR, "admin@uia.com", "123");
            usuarioJpaController.create(admin);  // Guardar el administrador en la base de datos
            System.out.println("Administrador creado con éxito.");
        } else {
            System.out.println("El administrador ya existe.");
        }
    }
    
    public Usuario autenticarUsuario(String idUsuario, String contrasena) {
        // Buscar usuario por su ID
        Usuario usuario = usuarioJpaController.findUsuario(idUsuario);
        
        if (usuario != null && usuario.getContrasena().equals(contrasena)) {
            return usuario;  // Retorna el usuario si las credenciales son válidas
        }
        return null;  // Si no se encuentra el usuario o la contraseña no coincide
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
    
   
}


    

