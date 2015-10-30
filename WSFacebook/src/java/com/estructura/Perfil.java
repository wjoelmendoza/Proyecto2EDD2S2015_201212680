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
    private String foto;
    private String ext;
    private AVLSeguidores seguidores;
    private AVLSeguidores sigo;
    private ListaEventos eventos;
    private ListaPublicaciones publicacion;
    
    public Perfil(){
        
    }
    
    public Perfil(String correo){
        this.correo = correo;
    }
    
    public void dejarSeguir(String correo){
        sigo.eliminar(correo);
    }
    
    public void quitarSeguidor(String correo){
        seguidores.eliminar(correo);
    }
    
    public ListaPublicaciones getPublicacionesP(){
        return publicacion;
    }
    
    public void eliminarPublicacion(String correo, int pos){
       if(correo.equals(this.correo)){
           publicacion.eliminarPublicacion(pos);
       }else{
            Seguidor aux = seguidores.buscar(correo);
            if(aux!=null){
                aux.eliminarPublicacion(pos);
            }
       }
    }
    
    public void agregarPSigo(String correo, String nombre){
        sigo.insertarSeguidor(correo, nombre);
    }
    
    public AVLSeguidores getSeguidores(){
        return seguidores;
    }
    
    public AVLSeguidores getSigo(){
        return sigo;
    }
    
    public void publicacionPersonal(String titulo,String contenido){
        Publicacion aux = new Publicacion('t',titulo,contenido);
        this.publicacion.insertar(aux);
    }
    
    public void publicacionSeguidor(String correo,char t,String titulo,String contenido){
        Seguidor aux = seguidores.buscar(correo);
        if(aux!=null){
            Publicacion np = new Publicacion(t,titulo,contenido);
            aux.hacerPublicacion(np);
        }
    }
    
    public void graficarPublicacion(String correo){
        if(correo.equals(this.correo)){
            publicacion.graficar("publicaciones");
        }else{
            Seguidor aux = seguidores.buscar(correo);
            if(aux!=null)
                aux.graficarPublicacion();
        }
    }
    
    public Perfil(String correo,String nombre, String password){
        this.correo = correo;
        this.nombre = nombre;
        this.password= password;
        foto="";
        ext="";
        seguidores = new AVLSeguidores();
        sigo = new AVLSeguidores();
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
    
    
    public void graficarSeguidores(){
        seguidores.graficar();
    }
    
    public Publicacion[] getPublicaciones(){
        return publicacion.getPublicaciones();
    }
    
  
    public void setFoto(String foto, String ext){
        this.foto = foto;
        this.ext = ext;
    }
    
    public void setFoto(String foto){
        this.foto= foto;
    }
    
    public void setExt(String ext){
        this.ext= ext;
    }
  
    public String getFoto(){
        return foto;
    }

   
    public String getExt(){
        return ext;
    }
}
