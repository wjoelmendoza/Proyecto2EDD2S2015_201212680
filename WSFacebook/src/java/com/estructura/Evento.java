/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estructura;

/**
 *
 * @author walter
 */
public class Evento {
    private String nombre;
    private String fecha;
    private String direccion;
    private String estado ;
    
    public Evento(){
    }
    
    public Evento(String nombre,String fecha, String direccion, String estado){
        this.nombre = nombre;
        this.fecha = fecha;
        this.direccion = direccion;
        this.estado = estado;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setFecha(String fecha){
        this.fecha = fecha;
    }
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
    public void setEstado(String estado){
        this.estado = estado;
    }
    
    public String getNombre(){
        return nombre;
    }
    public String getFecha(){
        return fecha;
    }
    public String getDireccion(){
        return direccion;
    }
    
    public String getEstado(){
        return estado;
    }
}
