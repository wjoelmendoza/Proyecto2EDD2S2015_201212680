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
public class PilaPaginas {
     NodoLD<Pagina> top;
    
    public boolean vacio(){
        return top==null;
    }
    
    public PilaPaginas(){
        top = null;
    }
    
    public void push(Pagina nuevo){
        NodoLD<Pagina> nodo= new NodoLD<>(nuevo);
        if(vacio()){
            top = nodo;
        }else{
            nodo.setSiguiente(top);
            top = nodo;
        }
    }
    
    public Pagina pop(){
        if(vacio()){
            return null;
        }else{
            NodoLD<Pagina> aux = top;
            top = aux.getSiguiente();
            aux.setSiguiente(null);
            return aux.getDato();
        }
    }
    
    public Pagina verTop(){
        if(vacio())
            return null;
        else{
            return top.getDato();
        }
    }
}
