/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estructura.generica;

import com.estructura.interfaces.Comparar;

/**
 *
 * @author walter
 */
public class NodoA{
    private int fe;
    private Comparar valor;
    private NodoA nDer;
    private NodoA nIzq;
    
    public NodoA(Comparar valor){
        this.valor = valor;
        nDer = nIzq = null;
        fe = 0;
    }
    
    /**
     * 
     * @return el valor representativo del nodo
     */
    public Comparar getValor(){
        return valor;
    }
    
    /**
     * 
     * @return  el hijo derecho del nodo
     */
    public NodoA getNDer(){
        return nDer;
    }
    
    /**
     * 
     * @return  el hijo izquierdo del nodo
     * 
     */
    public NodoA getNIzq(){
        return nIzq;
    }
    /**
     * 
     * @param valor 
     * agrega el valor representativo del nodo
     */
    public void setValor(Comparar valor){
        this.valor = valor;
    }
    
    /**
     * 
     * @param nDer 
     * modifica el hijo derecho del nodo
     */
    public void setNDer(NodoA nDer){
        this.nDer = nDer;
    }
    
    /**
     * 
     * @param nIzq 
     * modifica el hijo izquierdo del nodo
     */
    public void setNIzq(NodoA nIzq){
        this.nIzq = nIzq;
    }
    
    /**
     * 
     * @return  el valor actual del factor de equilibrio
     */
    public int getFactor(){
        return fe;
    }
    
    /**
     * 
     * @param fe 
     * fija el nuevo factor de equilibrio
     */
    public void setFactor(int fe){
        this.fe = fe;
    }
}
