/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estructura;

import com.estructura.interfaces.Comparar;

/**
 *
 * @author walter
 */
public class Seguidor implements Comparar{
    private String correo;
    private String nombre;
    private ListaPublicaciones publicaciones;
    private ListaEventos eventos;
    
    
    public Seguidor(String correo, String nombre){
        this.correo = correo;
        this.nombre = nombre;
        eventos = new ListaEventos();
        publicaciones = new ListaPublicaciones();
    }

    Seguidor(String correo) {
        this.correo= correo;
    }

    public String getCorreo(){
        return correo;
    }
    
    
    @Override
    public boolean mayorQue(Comparar dato) {
        return this.correo.compareTo(((Seguidor)dato).correo)>0;
    }

    @Override
    public boolean menorQue(Comparar dato) {
        return this.correo.compareTo(((Seguidor)dato).correo)<0;
    }

    @Override
    public boolean igualA(Comparar dato) {
        return ((Seguidor)dato).getCorreo().equals(nombre);
    }
    
    public String getNombre(){
        return correo;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setCorreo(String correo){
        this.correo = correo;
    }
    
    public void hacerPublicacion(Publicacion np){
        publicaciones.insertar(np);
    }
    
    public void agregarEvento(Evento ev){
        eventos.insertar(ev);
    }
    
    /**
     * pendiente de implementación
     */
    public void cancelarEvento(){
        eventos.cancelarEvento();
    }

    
    
    /**
     * pendiente de implementar
     */
    public void eliminarPublicacion(int pos){
        publicaciones.eliminarPublicacion(pos);
    }
}
