/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usuarios;

/**
 *
 * @author walter
 */
public class UserF {
    private String correo;
    private String nombre;
    /**
     * buscar como reputas mantener actualizada la foto
     */
    
    /**
     * buscar como reputas mantener actualizada la foto
     * @param correo
     * @param nombre
     */
    public UserF(String correo, String nombre){
        this.correo = correo ;
        this.nombre = nombre;
    }
    
    
    public void setNombre(String nombre){
        this.nombre =nombre;
    }
    
    public void setCorreo(String correo){
        this.correo = correo;
    }
    
    public String getCorreo(){
        return correo;
    }
    
    public String getNombre(){
        return nombre;
    }
}
