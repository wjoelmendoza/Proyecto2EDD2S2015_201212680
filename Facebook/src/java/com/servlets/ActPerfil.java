/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlets;

import com.usuarios.UserF;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author walter
 */
@WebServlet(name = "ActPerfil", urlPatterns = {"/ActPerfil"})
public class ActPerfil extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sesion = request.getSession();
        UserF user =(UserF) sesion.getAttribute("usuarioL");
        String edad = request.getParameter("uEdad");
        String nombre = request.getParameter("uNombre");
        String eCivil = request.getParameter("uEstCiv");
        String uGen = request.getParameter("uGenero");
        String uPais = request.getParameter("uPais");
        int uEdad=0;
        if(!edad.isEmpty())
            uEdad= Integer.parseInt(edad);
        this.actPerfil(uEdad, nombre, eCivil, uGen, user.getCorreo(), uPais);
        response.sendRedirect("/Facebook/Usuario/actualiza_perfil.jsp");
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private  void actPerfil(int uEdad, java.lang.String uNombre, java.lang.String estCivil, java.lang.String uGenero, java.lang.String uCorreo, java.lang.String uPais) {
        com.webservice.WSFacebook_Service service = new com.webservice.WSFacebook_Service();
        com.webservice.WSFacebook port = service.getWSFacebookPort();
        port.actPerfil(uEdad, uNombre, estCivil, uGenero, uCorreo, uPais);
    }

    

}
