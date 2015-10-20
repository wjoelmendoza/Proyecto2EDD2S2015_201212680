/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estructura.generica;

/**
 *
 * @author walter
 */
public class NodoLD <T> {
    private T dato;
    private NodoLD siguiente, anterior;
    
    public NodoLD(T dato){
        this.dato = dato;
        siguiente = anterior = null;
    }
    
    public T getDato(){
        return dato;
    }
    
    public void setDato(T dato){
        this.dato = dato;
    }
    
    public void setSiguiente(NodoLD<T> siguiente){
        this.siguiente = siguiente;
    }
    
    public void setAnterior(NodoLD<T> anterior){
        this.anterior = anterior;
    }
    
    public NodoLD<T> getAnterior(){
        return anterior;
    }
    
    public NodoLD<T> getSiguiente(){
        return siguiente;
    }
    
}
