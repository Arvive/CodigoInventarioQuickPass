
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
    private String idReporte;
    private LocalDateTime fechaGeneracion;
    private String tipoReporte;
    private String contenido;

    
    public Reporte() {
        
        this.fechaGeneracion = LocalDateTime.now();
    }

    public Reporte(String idReporte, LocalDateTime fechaGeneracion, String tipoReporte, String contenido) {
        this.idReporte = idReporte;
        this.fechaGeneracion = fechaGeneracion;
        this.tipoReporte = tipoReporte;
        this.contenido = contenido;
    }

    public String getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(String idReporte) {
        this.idReporte = idReporte;
    }

    public LocalDateTime getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(LocalDateTime fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

    public String getTipoReporte() {
        return tipoReporte;
    }

    public void setTipoReporte(String tipoReporte) {
        this.tipoReporte = tipoReporte;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Reporte{" + "idReporte=" + idReporte + ", fechaGeneracion=" + fechaGeneracion + ", tipoReporte=" + tipoReporte + ", contenido=" + contenido + '}';
    }
    
}
