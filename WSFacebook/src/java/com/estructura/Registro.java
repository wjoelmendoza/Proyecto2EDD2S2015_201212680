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
public class Registro {
    private String evento;
    private String descripcion;
    
    public Registro(String evento, String descripcion){
        this.evento = evento;
        this.descripcion = descripcion;
    }
    
    
    public void setEvento(String evento){
        this.evento = evento;
    }
    
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    
    public String getEvento(){ return evento;}
    
    public String getDescripcion(){return descripcion;}
    
}
