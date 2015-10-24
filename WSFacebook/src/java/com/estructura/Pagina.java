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
public class Pagina {
    private final int orden=5;
    Perfil[] claves;
    Pagina[] ramas;
    private int cuentas;
    
    public Pagina(){
        claves = new Perfil[orden];
        ramas = new Pagina[orden];
    }
    
    public boolean nodoLLenoa(){
        return cuentas == orden -1;
    }
    
    public boolean nodoSemiVacio(){
        return cuentas < orden/2;
    }
    
    public String graficar(){
        String aux ="n" +  this.hashCode()+"[ label =\""; 
        int i=0;
        for( i =1; i <= cuentas; i++){
            if(i == 1){
                aux += claves[i].getCorreo();
                aux += "\n"+claves[i].getNombre();
            }
            else
                aux +=  "|"+claves[i].getCorreo();
        }
        aux += "\"];\n";
        
        for(i=0; i<=cuentas && ramas[i]!=null; i++){
            aux += ramas[i].graficar();
            aux += "n" + this.hashCode()+"->n" + ramas[i].hashCode()+";\n";
        }
        
        return aux;
    }
    
    
    public boolean nodoLLeno(){
        return cuentas == orden-1;
    }
    
    public int getCuentas(){
        return cuentas;
    }
    
    public void setCuentas (int cuentas){
        this.cuentas += cuentas;
    }
    
    public void actCuentas(int cuentas){
        this.cuentas = cuentas;
    }
}
