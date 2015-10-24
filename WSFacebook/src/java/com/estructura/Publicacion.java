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
public class Publicacion {
    private char tipo;
    private String titulo;
    private String contenido;
    //esperando por implementar el tipo para ver como cargar a memoria y no a disco
    private String img;
    public Publicacion(char tipo,String titulo, String contenido){
        this.tipo = tipo;
        this.titulo = titulo;
        this.contenido = contenido;
    }
    
    public Publicacion(){
        tipo ='t';
        titulo="";
        contenido="";
        img = "";
    }
    
    
    public void setTipo(char tipo){
        this.tipo = tipo;
    }
    
    public char getTipo(){
        return tipo;
    }
    
    public String getContenido(){
        return contenido;
    }
    
    public void setContenido(String contenido){
        this.contenido = contenido;
    }
    
    public void setImagen(String img){
        this.img = img;
    }
    
    public String getImagen(){
        return img;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo= titulo;
    }
    
}
