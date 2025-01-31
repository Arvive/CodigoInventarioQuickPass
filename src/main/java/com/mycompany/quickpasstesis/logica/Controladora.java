/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quickpasstesis.logica;

import com.mycompany.quickpasstesis.persistencia.ControladoraPersistencia;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();


    public void guardar(String numeroSerie, String numeroCaja, int cantidad, BigDecimal precio, String categoria, String estado, String oficina, String observaciones) {
        
        Producto producto = new Producto();
        
        producto.setCategoria(categoria);
        producto.setNumeroSerie(numeroSerie);
        producto.setNumeroCaja(numeroCaja);
        producto.setCantidad(cantidad);
        producto.setPrecioDisp(precio);
        producto.setEstado(estado);
        producto.setOficina(oficina);
        producto.setObservaciones(observaciones);
        producto.setFechaRegistro(LocalDateTime.now());//ver aca si pasa algo porque no este dentro del metodo
        producto.calcularFechaVencimiento();
        
        controlPersis.guardar(producto);
        
    }

    public List<Producto> traerProductos() {
        
        
       return controlPersis.traerProductos ();
    }

    public void borrarProducto(int idProducto) {
    controlPersis.borrarProducto (idProducto);  
    }


    public Producto traerProducto(int idProducto) {
       return controlPersis.traerProducto (idProducto);
    }

    public void modificarProducto(Producto producto, String numeroSerie, String numeroCaja, 
            String sobreValor, String persoRecibe, String fechaDevol, String categoria, 
            String estado, String oficina, String tipo, String observaciones) {
        
      producto.setNumeroSerie(numeroSerie);
      producto.setNumeroCaja(numeroCaja);
      producto.setNumSobreValor(sobreValor);
      producto.setPersonRecibe(persoRecibe);
      
      if (fechaDevol != null && !fechaDevol.isEmpty()) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Ajustar al formato usado
            LocalDate fechaEditada = LocalDate.parse(fechaDevol, formatter);
            producto.setFechaDevolucion(fechaEditada);
        } catch (DateTimeParseException e) {
            System.err.println("Error al parsear la fecha de devolución: " + e.getMessage());
            producto.setFechaDevolucion(null); // Si falla la conversión, asignar null
        }
    } else {
        producto.setFechaDevolucion(null); // Si no hay fecha ingresada, asignar null
    }
      
      
      
      
      producto.setCategoria(categoria);
      producto.setEstado(estado);
      producto.setOficina(oficina);
      producto.setTipoDisp(tipo);
      producto.setObservaciones(observaciones);
      
      controlPersis.modificarProducto(producto);
      
    }

    public List<Producto> buscarProductosPorFiltros(LocalDateTime fechaDesde, LocalDateTime fechaHasta, String oficina, String estado, String numSerie) {
       return controlPersis.buscarProductosPorFiltros(fechaDesde, fechaHasta, oficina, estado, numSerie);
    }

    public void exportarProductosAPDF(List<Producto> productos, String reportepdf) {
        PDFExporter.exportarProductosAPDF(productos, reportepdf);
      
    }
    
     // Verificar si el usuario en sesión tiene el rol de ADMINISTRADOR
    private void verificarAccesoAdministrador(Usuario usuarioSesion) {
        if (usuarioSesion == null || usuarioSesion.getTipoRol() != Usuario.TipoRol.ADMINISTRADOR) {
            throw new SecurityException("Acceso denegado: Solo los administradores pueden realizar esta operación.");
        }
    }

    // Método para crear un administrador si no existe
    public void crearAdministradorSiNoExiste() throws Exception {
        if (!controlPersis.existeAdministrador()) {
            Usuario admin = new Usuario("admin123", "Administrador", Usuario.TipoRol.ADMINISTRADOR, "admin@uia.com", "123");
            controlPersis.crearUsuario(admin);
            System.out.println("Administrador creado con éxito.");
        } else {
            System.out.println("El administrador ya existe.");
        }
    }

    // Método para autenticar un usuario
    public Usuario autenticarUsuario(String idUsuario, String contrasena) {
        Usuario usuario = controlPersis.obtenerUsuarioPorId(idUsuario);
        if (usuario != null && usuario.getContrasena().equals(contrasena)) {
            return usuario;
        }
        return null;
    }

    // Método para crear un usuario
    public void crearUsuario(Usuario usuario, Usuario usuarioSesion) throws Exception {
        verificarAccesoAdministrador(usuarioSesion);
        controlPersis.crearUsuario(usuario);
    }

    // Método para editar un usuario
    public void editarUsuario(Usuario usuario, Usuario usuarioSesion) throws Exception {
        verificarAccesoAdministrador(usuarioSesion);
        controlPersis.editarUsuario(usuario);
    }

    // Método para eliminar un usuario
    public void eliminarUsuario(String idUsuario, Usuario usuarioSesion) throws Exception {
        verificarAccesoAdministrador(usuarioSesion);
        controlPersis.eliminarUsuario(idUsuario);
    }

    // Método para obtener todos los usuarios
    public List<Usuario> obtenerUsuarios() {
        return controlPersis.obtenerUsuarios();
    }

    // Método para obtener un usuario por su ID
    public Usuario obtenerUsuarioPorId(String id) {
        return controlPersis.obtenerUsuarioPorId(id);
    }
    
    
    
    
}
            

    
 
    
    
