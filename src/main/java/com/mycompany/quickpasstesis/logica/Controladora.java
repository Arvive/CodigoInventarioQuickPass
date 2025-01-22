/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quickpasstesis.logica;

import com.mycompany.quickpasstesis.persistencia.ControladoraPersistencia;
import java.math.BigDecimal;
import java.time.LocalDateTime;
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
}
            

    
 
    
    
