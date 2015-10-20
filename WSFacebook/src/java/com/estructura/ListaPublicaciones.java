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
public class ListaPublicaciones {
    private NodoLD<Publicacion> inicio,fin;
    private int size;
    
    public ListaPublicaciones(){
        inicio = fin = null;
        size =0;
    }
    
    public boolean vacia(){
        return inicio==null;
    }
    
    public void insertar(Publicacion pu){
        NodoLD<Publicacion> aux = new NodoLD<>(pu);
        size ++;
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
     * pendiente de implementar
     */
    public void eliminarPublicacion(){}
    
}
