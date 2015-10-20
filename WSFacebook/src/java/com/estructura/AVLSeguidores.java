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
public class AVLSeguidores {
    private ArbolAVL seguidores;
    
    public AVLSeguidores(){
        seguidores = new ArbolAVL();
    }
    
    public void insertarSeguidor(String correo, String nombre){
        seguidores.insertar(new Seguidor(correo, nombre));
    }
    
    public Seguidor buscar(String correo){
        Seguidor aux, aux2 =null;
        aux = new Seguidor(correo,"");
        Comparar com = seguidores.buscar(aux);
        if(com!=null)
            aux2 = (Seguidor) com;
        return aux2;
    }
}
