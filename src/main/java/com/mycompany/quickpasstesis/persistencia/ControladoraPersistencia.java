/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quickpasstesis.persistencia;

import com.mycompany.quickpasstesis.logica.Producto;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ControladoraPersistencia {
    
    ProductoJpaController productoJpa = new ProductoJpaController();

    public void guardar(Producto producto) {
        
        //crear base de datos el product
        productoJpa.create(producto);
        
    }
//busca todos los registros y asigna lo que yo diga
    public List<Producto> traerProductos() {
        
        return productoJpa.findProductoEntities();
    }
    
    
}
