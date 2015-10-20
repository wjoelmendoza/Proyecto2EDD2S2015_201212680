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
public class PilaInsercion {
    NodoLD<Perfil> top;
    
    public boolean vacio(){
        return top==null;
    }
    
    public PilaInsercion(){
        top = null;
    }
    
    public void push(Perfil nuevo){
        NodoLD<Perfil> nodo= new NodoLD<>(nuevo);
        if(vacio()){
            top = nodo;
        }else{
            nodo.setSiguiente(top);
            top = nodo;
        }
    }
    
    public Perfil pop(){
        if(vacio()){
            return null;
        }else{
            NodoLD<Perfil> aux = top;
            top = aux.getSiguiente();
            aux.setSiguiente(null);
            return aux.getDato();
        }
    }
}
