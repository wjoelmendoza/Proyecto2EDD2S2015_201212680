/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlets;

import com.usuarios.UserF;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.WebServiceRef;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import sun.misc.BASE64Encoder;

/**
 *
 * @author walter
 */
@WebServlet(name = "CargarFoto", urlPatterns = {"/CargarFoto"})
public class CargarFoto extends HttpServlet {

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
        response.sendRedirect("/Facebook/Usuario/Inicio.jsp");
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
        UserF user=(UserF) sesion.getAttribute("usuarioL");
        String absolutePath = "";
        //cambia al pasar a windows
        String tempPath="/home/walter/";
        
        DiskFileItemFactory factor = new DiskFileItemFactory();
        factor.setSizeThreshold(1024);
        factor.setRepository(new File(tempPath));
        ServletFileUpload upload = new ServletFileUpload(factor);
        String ext = "";
        
        try{
            List<FileItem> part = upload.parseRequest(request);
            
            for(FileItem item:part){
                File file =  new File(tempPath, item.getName());
                item.write(file);
                absolutePath = file.getAbsolutePath();
            }
            
            System.out.println(absolutePath);
            
        }catch(FileUploadException ex){
            System.err.println(ex.toString());
        } catch (Exception ex) {
            Logger.getLogger(CargarFoto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        byte[] vector;
        File f = new File(absolutePath);
        String name = f.getName();
        ext = name.substring(name.length()-3);
        System.out.println(ext);
        BufferedImage image = ImageIO.read(f);
        try (
            ByteArrayOutputStream arrayByte = new ByteArrayOutputStream(1000)) {
            ImageIO.write(image, ext, arrayByte);
            arrayByte.flush();
            vector = arrayByte.toByteArray();
        }
        
        BASE64Encoder decode = new BASE64Encoder();
        String code64 = decode.encode(vector);
        user.setFoto(code64);
        user.setExt(ext);
        processRequest(request, response);
        /**
         * aqui deberia de mandar a guardar la foto....
        */
        
        this.cargarFoto(user.getCorreo(), ext,code64);
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

    private void cargarFoto(java.lang.String uCorreo, java.lang.String ext, java.lang.String uFoto) {
        com.webservice.WSFacebook_Service service = new com.webservice.WSFacebook_Service();
        com.webservice.WSFacebook port = service.getWSFacebookPort();
        port.cargarFoto(uCorreo, ext, uFoto);
    }

}
