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
public class Perfil implements Comparar {
    private int edad;
    private String genero;
    private String pais;
    private String estdoC;
    private String correo;
    private String password;
    private String nombre;
    private AVLSeguidores seguidores;
    private ListaEventos eventos;
    private ListaPublicaciones publicacion;
    
    public Perfil(){
        
    }
    
    public Perfil(String correo){
        this.correo = correo;
    }
    
    public Perfil(String correo,String nombre, String password){
        this.correo = correo;
        this.nombre = nombre;
        this.password= password;
        seguidores = new AVLSeguidores();
        eventos = new ListaEventos();
        publicacion = new ListaPublicaciones();
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void addSeguidor(String correo, String nombre){
        seguidores.insertarSeguidor(correo, nombre);
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setEstdoC(String estdoC) {
        this.estdoC = estdoC;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    public String getPais() {
        return pais;
    }

    public String getEstdoC() {
        return estdoC;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setCorreo(String correo){
        this.correo = correo;
    }
    
    public String getCorreo(){
        return correo;
    }

    @Override
    public boolean mayorQue(Comparar dato) {
        Perfil aux1 = (Perfil) dato;
        int aux = this.correo.compareTo(aux1.correo);
        return aux > 0;
    }

    @Override
    public boolean menorQue(Comparar dato) {
        Perfil aux1 = (Perfil) dato;
        int aux = this.correo.compareTo(aux1.correo);
        return aux < 0;
    }

    @Override
    public boolean igualA(Comparar dato) {
        return this.correo.equals(((Perfil)dato).correo);
    }
    
    public void hacerPublicacion(Publicacion pub){
        this.publicacion.insertar(pub);
    }
    
    public void agregarEvento(Evento ev){
        this.eventos.insertar(ev);
    }
    
}
