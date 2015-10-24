<%-- 
    Document   : ver_perfil
    Created on : 22/10/2015, 01:37:15 AM
    Author     : walter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../WEB-INF/jspf/validar_sesion.jspf" %>
<%validarSesion(request.getSession(), response);%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Perfil-FalseBook</title>
        <%@include file="../WEB-INF/jspf/mst_stlu.jspf"%>
    </head>
    <body>
        <div id="page">
           <%@include file="../WEB-INF/jspf/header.jspf"  %>
           <div id="mainarea">
               <%@include file="../WEB-INF/jspf/menu_u.jspf" %>
               <div id="contentarea">
                   <div id="contenido">
                          <%
                            try {
                                com.webservice.WSFacebook_Service service = new com.webservice.WSFacebook_Service();
                                com.webservice.WSFacebook port = service.getWSFacebookPort();
                                // TODO initialize WS operation arguments here
                                javax.servlet.http.HttpSession sesion = request.getSession();
                                com.usuarios.UserF usef =(com.usuarios.UserF) session.getAttribute("usuarioL");
                                java.lang.String pBusqueda = usef.getCorreo();
                                // TODO process result here
                                com.webservice.Perfil result = port.buscarUsuario(pBusqueda);
                                out.println("<br>Nombre: "+result.getNombre());
                                out.println("<br>Correo:" + result.getCorreo());
                                out.println("<br>Edad: " + result.getEdad());
                                out.println("<br>Estado civil: " +result.getEstdoC());
                                out.println("<br>Genero: " + result.getGenero());
                                out.println("<br>Pais: " + result.getPais());
                            } catch (Exception ex) {
                                // TODO handle custom exceptions here
                            }
                          %>
                   </div>
               </div>
           </div>
        <%@include file="../WEB-INF/jspf/footer.jspf" %>       
        </div>

    </body>
</html>
