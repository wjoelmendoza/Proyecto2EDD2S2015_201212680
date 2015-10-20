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
public class Historial {
    private NodoLD<Registro> origen , fin;
    private int size;
    
    public Historial(){
        size=0;
        origen = fin = null;
    }
    
    public boolean vacio(){
        return origen == null;
    }
    
    public void insertar(Registro reg){
        NodoLD<Registro> nh = new NodoLD<>(reg);
        if(!vacio()){
            fin.setSiguiente(nh);
            nh.setAnterior(fin);
            fin = nh;
            size++;
        }else{
            origen = fin = nh;
        }
    }
    
    public int getSize(){return size;}
}
