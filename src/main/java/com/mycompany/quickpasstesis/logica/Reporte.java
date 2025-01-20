
package com.mycompany.quickpasstesis.logica;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reporte implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReporte;
    private LocalDateTime fechaGeneracion;
    private String contenido;

    
    public Reporte() {
        
        this.fechaGeneracion = LocalDateTime.now();
    }

    public Reporte( String contenido) {
        this.fechaGeneracion = LocalDateTime.now();
        this.contenido = contenido;
    }

    public Long getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(Long idReporte) {
        this.idReporte = idReporte;
    }

    public LocalDateTime getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(LocalDateTime fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Reporte{" + "idReporte=" + idReporte + ", fechaGeneracion=" + fechaGeneracion + ", contenido=" + contenido + '}';
    }
    
}
