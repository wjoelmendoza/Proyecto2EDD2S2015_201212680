/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webservice;

import com.estructura.ArbolB;
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
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "agregarUsuario")
    @Oneway
    public void agregarUsuario(@WebParam(name = "uContra") String uContra, @WebParam(name = "uCorreo") String uCorreo, @WebParam(name = "uNombre") String uNombre) {
        usuarios.insertarClave(new Perfil(uCorreo, uNombre,uContra));
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "buscarUsuario")
    public Perfil buscarUsuario(@WebParam(name = "pBusqueda") String pBusqueda) {
        //TODO write your implementation code here:
        Perfil aux = usuarios.buscarElemento(new Perfil(pBusqueda));
        return aux;
    }

}
