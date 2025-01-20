/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quickpasstesis.logica;

import com.mycompany.quickpasstesis.persistencia.ReporteJpaController;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ReporteService {
    

    private ReporteJpaController reporteJpaController;


    public void generarReporte(String contenido) {
        // Crear un nuevo reporte con contenido
        Reporte reporte = new Reporte(contenido);
        try {
            reporteJpaController.create(reporte);
        } catch (Exception e) {
            // Manejo de errores
            e.printStackTrace();
        }
    }

    // Método para obtener todos los reportes (si los necesitas)
    public List<Reporte> obtenerReportes() {
        try {
            return reporteJpaController.findReporteEntities();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // Método para obtener un reporte por su ID
    public Reporte obtenerReportePorId(Long id) {
        try {
            return reporteJpaController.findReporte(id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
    
