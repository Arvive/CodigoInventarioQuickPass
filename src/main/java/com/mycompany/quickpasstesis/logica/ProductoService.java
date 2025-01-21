
package com.mycompany.quickpasstesis.logica;

import com.mycompany.quickpasstesis.persistencia.ProductoJpaController;
import com.mycompany.quickpasstesis.persistencia.exceptions.NonexistentEntityException;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class ProductoService {
    
    ProductoJpaController productoController = new ProductoJpaController();
    

    // Registrar un producto
    public void registrarProducto(Producto producto) throws Exception {
        validarProducto(producto);
        producto.setFechaRegistro(LocalDateTime.now());
        producto.calcularFechaVencimiento();
        productoController.create(producto);
    }

    // Actualizar un producto existente
    public void actualizarProducto(Producto producto) throws Exception {
        validarProducto(producto);
        if (productoController.findProducto(producto.getIdProducto()) == null) {
            throw new NonexistentEntityException("El producto no existe en la base de datos.");
        }
        productoController.edit(producto);
    }

    // Eliminar un producto
    public void eliminarProducto(int idProducto) throws Exception {
        if (productoController.findProducto(idProducto) == null) {
            throw new NonexistentEntityException("El producto no existe en la base de datos.");
        }
        productoController.destroy(idProducto);
    }

    // Buscar producto por ID
    public Producto buscarProductoPorId(int idProducto) {
        return productoController.findProducto(idProducto);
    }

    // Obtener todos los productos
    public List<Producto> obtenerTodosLosProductos() {
        return productoController.findProductoEntities();
    }

    // Validación de un producto antes de persistir
    private void validarProducto(Producto producto) throws Exception {
        // Verificar si el número de serie está vacío
        if (producto.getNumeroSerie() == null || producto.getNumeroSerie().isEmpty()) {
            throw new Exception("El número de serie no puede estar vacío.");
        }

        /*/ Verificar si ya existe un producto con el mismo número de serie
        Producto productoExistente = productoController.findProductoByNumeroSerie(producto.getNumeroSerie());
        if (productoExistente != null) {
            throw new Exception("Ya existe un producto con el mismo número de serie.");
        }*/ //AVERIGUAR COMO HACERLO, ERROR EN ENTITY MANAGER

        // Validaciones adicionales
        if (producto.getCantidad() <= 0) {
            throw new Exception("La cantidad debe ser mayor a 0.");
        }
        if (producto.getPrecioDisp() == null || producto.getPrecioDisp().compareTo(BigDecimal.ZERO) <= 0) {
            throw new Exception("El precio del producto debe ser mayor a 0.");
        }
        if (producto.getEstado() == null) {
            throw new Exception("El estado del producto no puede ser nulo.");
        }
        if (producto.getCategoria() == null) {
            throw new Exception("La categoría del producto no puede ser nula.");
        }
        if (producto.getTipoDisp() == null) {
            throw new Exception("El tipo de dispositivo no puede ser nulo.");
        }
        if (producto.getOficina() == null) {
            throw new Exception("La oficina debe ser especificada.");
        }
    }

    // Buscar productos por estado
    public List<Producto> buscarProductosPorEstado(Producto.Estado estado) {
        return obtenerTodosLosProductos().stream()
                .filter(producto -> producto.getEstado() == estado)
                .toList();
    }

    // Buscar productos que están próximos a vencerse
    public List<Producto> buscarProductosProximosAVencerse(int diasAnticipacion) {
        LocalDateTime ahora = LocalDateTime.now();
        return obtenerTodosLosProductos().stream()
                .filter(producto -> producto.getFechaVencimiento() != null
                        && producto.getFechaVencimiento().minusDays(diasAnticipacion).isBefore(ahora.toLocalDate()))
                .toList();
    }
}
    

    
    


