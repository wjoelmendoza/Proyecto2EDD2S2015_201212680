/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estructura;

import com.estructura.generica.NodoLD;

/**
 *
 * @author walter
 */
public class ListaEventos {
    private NodoLD<Evento> inicio, fin;
    private int size;
    
    public ListaEventos(){
        size=0;
        inicio = fin = null;
    }
    
    public boolean vacia(){
        return inicio == null;
    }
    
    public void insertar(Evento ne){
        NodoLD<Evento> aux = new NodoLD<>(ne);
        size++;
        if(!vacia()){
            fin.setSiguiente(aux);
            aux.setAnterior(fin);
            fin = aux;
        }else{
            inicio = fin = aux;
        }
    }
    
    public int tamaño(){
        return size;
    }
    
    /**
     * pendiente de implementación
     */
    
    public void cancelarEvento(){}
}
