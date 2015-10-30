/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Walter Mendoza
 */
@WebServlet(name = "PublicacionS", urlPatterns = {"/PublicacionS"})
public class PublicacionS extends HttpServlet {

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
        response.sendRedirect("/Facebook/Usuario/publicar_s.jsp");
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
        processRequest(request, response);
        String titulo = request.getParameter("pTitulo");
        String uCorreo = request.getParameter("uCorreo");
        String sCorreo = request.getParameter("sCorreo");
        String contenido = request.getParameter("txtContenido");
        contenido = this.sutituirLN(contenido);
        this.publicarTexto(uCorreo, sCorreo, titulo, contenido);
    }
    
    private String sutituirLN(String contenido){
        String aux = contenido.replace("\n", "<br>");
        return aux;
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

    private void publicarTexto(java.lang.String uCorreo, java.lang.String sCorreo, java.lang.String titulo, java.lang.String contenido) {
        com.webservice.WSFacebook_Service service = new com.webservice.WSFacebook_Service();
        com.webservice.WSFacebook port = service.getWSFacebookPort();
        port.publicarTexto(uCorreo, sCorreo, titulo, contenido);
    }

}
