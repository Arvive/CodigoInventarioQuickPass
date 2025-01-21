
package com.mycompany.quickpasstesis.logica;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Usuarios")
public class Usuario implements Serializable {
    
    @Id
    @Column(name = "IDUSUARIO", length = 20) 
    private String idUsuario;
    private String nombre;
    @Enumerated(EnumType.STRING)
    private TipoRol tipoRol;
    private String correo;
    private String contrasena;   
    
    public Usuario() {
    }
    
    public enum TipoRol {
    ADMINISTRADOR,
    USUARIO,
    }

    public Usuario(String idUsuario, String nombre, TipoRol tipoRol, String correo, String contrasena) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.tipoRol = tipoRol;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoRol getTipoRol() {
        return tipoRol;
    }

    public void setTipoRol(TipoRol tipoRol) {
        this.tipoRol = tipoRol;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    

    
}
