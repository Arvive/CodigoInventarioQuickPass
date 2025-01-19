
package com.mycompany.quickpasstesis.logica;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Producto implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProducto;
    @Enumerated(EnumType.STRING)
    private Categoria categoria;
    private String numeroSerie;
    private String numeroCaja;
    @Enumerated(EnumType.STRING)
    private Oficina oficina;
    private int cantidad; // para poder contar cantidad de productos 
    private BigDecimal precioDisp;// de momento todos tienen el mismo costo
    @Enumerated(EnumType.STRING)
    private Estado estado;//danado, activo, inactivo
    @Enumerated(EnumType.STRING)
    private Tipo tipoDisp; //prepago,postpago
    private String numSobreValor; // con lo que se envia
    private String observaciones; 
    private String personRecibe;
    private LocalDateTime fechaRegistro;
    private LocalDate fechaVencimiento;// cada dispositivo se vence 4 anos despues del registro
    private LocalDateTime fechaDevolucion; // no siempre sucede, solo en casos especificos
    
    public enum Categoria {
    QuickPass,
    }
    
    public enum Estado {
    Activo, 
    Dañado,
    Inactivo,
    Devuelto,
    }
    
    public enum Tipo{
    Prepago,
    Postpago,
    }
    
    public enum Oficina{
    Oficina_Central,
    San_Pedro,
    Curridabat,
    }

    public Producto() {
    }

    public Producto(int idProducto, Categoria categoria, String numeroSerie, String numeroCaja, Oficina oficina, int cantidad, BigDecimal precioDisp, Estado estado, Tipo tipoDisp, String numSobreValor, String observaciones, String personRecibe, LocalDateTime fechaRegistro, LocalDate fechaVencimiento, LocalDateTime fechaDevolucion) {
        this.idProducto = idProducto;
        this.categoria = categoria;
        this.numeroSerie = numeroSerie;
        this.numeroCaja = numeroCaja;
        this.oficina = oficina;
        this.cantidad = cantidad;
        this.precioDisp = precioDisp;
        this.estado = estado;
        this.tipoDisp = tipoDisp;
        this.numSobreValor = numSobreValor;
        this.observaciones = observaciones;
        this.personRecibe = personRecibe;
        this.fechaRegistro = LocalDateTime.now();// para que la fecha de registro se la del dia en el que se registrar
        this.fechaVencimiento = fechaVencimiento;// sume los 4 anos de vencimiento auto al crear objeto
        calcularFechaVencimiento();// si algo falla revisar aca
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getNumeroCaja() {
        return numeroCaja;
    }

    public void setNumeroCaja(String numeroCaja) {
        this.numeroCaja = numeroCaja;
    }

    public Oficina getOficina() {
        return oficina;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPrecioDisp() {
        return precioDisp;
    }

    public void setPrecioDisp(BigDecimal precioDisp) {
        this.precioDisp = precioDisp;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Tipo getTipoDisp() {
        return tipoDisp;
    }

    public void setTipoDisp(Tipo tipoDisp) {
        this.tipoDisp = tipoDisp;
    }

    public String getNumSobreValor() {
        return numSobreValor;
    }

    public void setNumSobreValor(String numSobreValor) {
        this.numSobreValor = numSobreValor;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getPersonRecibe() {
        return personRecibe;
    }

    public void setPersonRecibe(String personRecibe) {
        this.personRecibe = personRecibe;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public LocalDateTime getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDateTime fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
    
    public void calcularFechaVencimiento() {// calculo de fecha auto 
    if (fechaRegistro != null) {
        this.fechaVencimiento = fechaRegistro.plusYears(4).toLocalDate();
    }
}

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", categoria=" + categoria + ", numeroSerie=" + numeroSerie + ", numeroCaja=" + numeroCaja + ", oficina=" + oficina + ", cantidad=" + cantidad + ", precioDisp=" + precioDisp + ", estado=" + estado + ", tipoDisp=" + tipoDisp + ", numSobreValor=" + numSobreValor + ", observaciones=" + observaciones + ", personRecibe=" + personRecibe + ", fechaRegistro=" + fechaRegistro + ", fechaVencimiento=" + fechaVencimiento + ", fechaDevolucion=" + fechaDevolucion + '}';
    }
  
}
