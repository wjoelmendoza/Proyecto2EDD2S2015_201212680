/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webservice;

import com.estructura.AVLSeguidores;
import com.estructura.ArbolB;
import com.estructura.ListaPublicaciones;
import com.estructura.Perfil;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author walter
 */
@WebService(serviceName = "WSFacebook")
public class WSFacebook {
    ArbolB usuarios = new ArbolB();
   

    /**
     * Web service operation
     * @param uContra
     * @param uCorreo
     * @param uNombre
     */
    @WebMethod(operationName = "agregarUsuario")
    @Oneway
    public void agregarUsuario(@WebParam(name = "uContra") String uContra, @WebParam(name = "uCorreo") String uCorreo, @WebParam(name = "uNombre") String uNombre) {
        usuarios.insertarClave(new Perfil(uCorreo, uNombre,uContra));
    }

    /**
     * Web service operation
     * @param pBusqueda
     * @return 
     */
    @WebMethod(operationName = "buscarUsuario")
    public Perfil buscarUsuario(@WebParam(name = "pBusqueda") String pBusqueda) {
        //TODO write your implementation code here:
        Perfil aux = usuarios.buscarElemento(new Perfil(pBusqueda));
        return aux;
    }

    /**
     * Web service operation
     * @param uEdad
     * @param uNombre
     * @param uEstCi
     * @param uGenero
     * @param uCorreo
     * @param uPais
     */
    @WebMethod(operationName = "actPerfil")
    @Oneway
    public void actPerfil(@WebParam(name = "uEdad") int uEdad, @WebParam(name = "uNombre") String uNombre,@WebParam(name="estCivil") String uEstCi,
            @WebParam(name="uGenero") String uGenero, @WebParam(name = "uCorreo") String uCorreo, @WebParam(name="uPais") String uPais) {
        if(!uCorreo.isEmpty()){
            
            Perfil aux = usuarios.buscarElemento(new Perfil(uCorreo));
            
            if(aux != null){
                
                if(uEdad!=0)
                    aux.setEdad(uEdad);
            
                if(!uNombre.isEmpty())
                    aux.setNombre(uNombre);
            
                if(!uGenero.isEmpty())
                    aux.setGenero(uGenero);
            
                if(!uEstCi.isEmpty())
                    aux.setEstdoC(uEstCi);
                
                if(!uPais.isEmpty())
                    aux.setPais(uPais);
            }
            
        }
        
    }

    /**
     * Web service operation
     * @param uCorreo
     * @param uContra
     */
    @WebMethod(operationName = "eliminarPerfil")
    @Oneway
    public void eliminarPerfil(@WebParam(name = "uCorreo") String uCorreo, @WebParam(name = "uContra") String uContra) {
        Perfil aux = new Perfil(uCorreo);
        aux = usuarios.buscarElemento(aux);
        if(aux!=null){
            if(aux.getPassword().equals(uContra)){
                usuarios.eliminar(aux);
            }
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "graficarArbolB")
    @Oneway
    public void graficarArbolB() {
        usuarios.graficar1();
    }

    /**
     * Web service operation
     * @param uCorreo
     */
    @WebMethod(operationName = "graficarSeguidores")
    @Oneway
    public void graficarSeguidores(@WebParam(name = "uCorreo") String uCorreo) {
        Perfil aux = usuarios.buscarElemento(new Perfil(uCorreo));
        if(aux!=null){
            aux.graficarSeguidores();
        }
    }

    /**
     * Web service operation
     * @param uCorreo
     * @param sCorreo
     * @param sNombre
     */
    @WebMethod(operationName = "addSeguidor")
    @Oneway
    public void addSeguidor(@WebParam(name = "uCorreo") String uCorreo, @WebParam(name = "sCorreo") String sCorreo, @WebParam(name = "sNombre") String sNombre) {
        Perfil seguidor, seguido;
        seguidor = usuarios.buscarElemento(new Perfil(uCorreo));
        seguido = usuarios.buscarElemento(new Perfil(sCorreo));
        if(seguido!= null && seguido!=null){
            seguido.addSeguidor(seguidor.getCorreo(), seguidor.getNombre());
            seguidor.agregarPSigo(sCorreo, sNombre);
        }
    }

    /**
     * Web service operation
     * @param uCorreo
     * @param nCorreo
     */
    @WebMethod(operationName = "actCorreo")
    @Oneway
    public void actCorreo(@WebParam(name = "uCorreo") String uCorreo, @WebParam(name = "nCorreo") String nCorreo) {
        Perfil aux1 = usuarios.buscarElemento(new Perfil(uCorreo));
        usuarios.eliminar(aux1);
        aux1.setCorreo(nCorreo);
        usuarios.insertarClave(aux1);
    }

    /**
     * Web service operation
     * @param uCorreo
     * @return 
     */
    @WebMethod(operationName = "getPublicacionesP")
    public ListaPublicaciones getPublicacionesP(@WebParam(name = "uCorreo") String uCorreo) {
        //TODO write your implementation code here:
        Perfil aux1 = usuarios.buscarElemento(new Perfil(uCorreo));
        return aux1.getPublicacionesP();
    }

    /**
     * Web service operation
     * @param uCorreo
     * @return 
     */
    @WebMethod(operationName = "getSeguidores")
    public AVLSeguidores getSeguidores(@WebParam(name = "uCorreo") String uCorreo) {
        //TODO write your implementation code here:
        Perfil aux = usuarios.buscarElemento(new Perfil(uCorreo));
        return aux.getSeguidores();
    }

    /**
     * Web service operation
     * @param uCorreo
     * @param sCorreo
     * @param titulo
     * @param contenido
     */
    @WebMethod(operationName = "publicarTexto")
    @Oneway
    public void publicarTexto(@WebParam(name = "uCorreo") String uCorreo, @WebParam(name = "sCorreo") String sCorreo, @WebParam(name = "titulo") String titulo, @WebParam(name = "contenido") String contenido) {
        //TODO write your implementation code here:
        Perfil seguido = usuarios.buscarElemento(new Perfil(sCorreo));
        if(uCorreo.equals(sCorreo)){
            seguido.publicacionPersonal(titulo, contenido);
        }else{
            seguido.publicacionSeguidor(uCorreo, 't', titulo, contenido);
        }
    }

    /**
     * Web service operation
     * @param uCorreo
     * @param sCorreo
     */
    @WebMethod(operationName = "dejarSeguir")
    @Oneway
    public void dejarSeguir(@WebParam(name = "uCorreo") String uCorreo, @WebParam(name = "sCorreo") String sCorreo) {
        Perfil seguido, seguidor;
        seguidor= usuarios.buscarElemento(new Perfil(uCorreo));
        seguidor.dejarSeguir(sCorreo);
        seguido = usuarios.buscarElemento(new Perfil(sCorreo));
        seguido.quitarSeguidor(sCorreo);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminarComentario")
    @Oneway
    public void eliminarComentario(@WebParam(name = "uCorreo") String uCorreo, @WebParam(name = "sCorreo") String sCorreo, @WebParam(name = "pos") int pos) {
    }

    /**
     * Este método es para la comunicación con GroveShark 
     * la cual confirma si un usuario tiene cuenta en Facebook
     * @param uCorreo
     * @return true si y solo si el usuario tiene cuenta en Facebook, false en otro caso
     */
    @WebMethod(operationName = "verificarUsuarioG")
    public boolean verificarUsuarioG(@WebParam(name = "uCorreo") String uCorreo) {
        Perfil aux = usuarios.buscarElemento(new Perfil(uCorreo));
        return aux!=null;
    }

    /**
     * Este método recibe la información de las publicaciones que se hacen vía 
     * GroveShark
     * @param uCorreo
     * @param titulo
     * @param contenido
     */
    @WebMethod(operationName = "publicacionGroveShark")
    @Oneway
    public void publicacionGroveShark(@WebParam(name = "uCorreo") String uCorreo, @WebParam(name = "titulo") String titulo, @WebParam(name = "contenido") String contenido) {
        Perfil aux = usuarios.buscarElemento(new Perfil(uCorreo));
        if (aux!=null){
            aux.publicacionPersonal(titulo, contenido);
        }
    }

    /**
     * Web service operation
     * @param uCorreo
     * @return 
     */
    @WebMethod(operationName = "getPublicacionP")
    public com.estructura.Publicacion[] getPublicacionP(@WebParam(name = "uCorreo") String uCorreo) {
        //TODO write your implementation code here:
        Perfil aux = usuarios.buscarElemento(new Perfil(uCorreo));
        return aux.getPublicaciones();
    }
    
   

    
}
