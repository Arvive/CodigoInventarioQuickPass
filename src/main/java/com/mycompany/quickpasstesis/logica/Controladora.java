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
}
            

    
 
    
    
