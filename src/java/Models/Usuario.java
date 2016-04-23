/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Felipe.Diaz
 */
public class Usuario implements Fuente {
    private String nombre;
    private String correo;
    private String contrasena;
    
    public Usuario(String nombre, String correo, String contrasena){
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.correo = correo;
    }
   
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the contraseña
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * @param contraseña the contraseña to set
     */
    public void setContraseña(String contraseña) {
        this.contrasena = contrasena;
    }
    
    
}
