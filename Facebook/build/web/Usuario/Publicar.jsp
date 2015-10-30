<%-- 
    Document   : Publicar
    Created on : 22/10/2015, 01:01:26 AM
    Author     : walter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../WEB-INF/jspf/validar_sesion.jspf" %>
<%validarSesion(request.getSession(), response);%>
<!DOCTYPE html>
<html>
    <head>
        
        <%@include file="../WEB-INF/jspf/mst_stlu.jspf"%>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Publicar-FalseBook</title>
    </head>
    <body>
        <div id="page">
           <%@include file="../WEB-INF/jspf/header.jspf"  %>
           <div id="mainarea">
               <%@include file="../WEB-INF/jspf/menu_u.jspf" %>
               <div id="contentarea">
                   <div id="contenido">
                        <br>
                        <br>
                        <br>
                        <br>
                        <h2>Publicación</h2>
                        <h3>Esta publicación aparecerá en tu muro</h3>
                        <form method="post" action="/Facebook/publicarPersonal">
                           <table>
                               <tr>
                                   <td></td>
                                   <td>
                                       <%
                                            HttpSession sesion = request.getSession();
                                            UserF user =(UserF) sesion.getAttribute("usuarioL");
                                            if(user!= null){
                                                out.println("<input name='uCorreo' value='"+ user.getCorreo()+"' hidden >");
                                            }
                                       %>
                                   </td>
                               </tr>
                               <tr>
                                   <td>Ingrese el titulo de la publicación:</td>
                                   <td><input id='entrada1' type="text" name="pTitulo" placeholder="Titulo" required></td>
                               </tr>
                               <tr>
                                   <td>Ingrese el contenido de la publicación:</td>
                                   <td><textarea placeholder="Mi publicación" id ='txtpublicacion' required name="txtContenido" ></textarea></td>
                               </tr>
                               <tr>
                                   <td></td>
                                   <td><input id='boton' type='reset' value="Borrar"><input id='boton' type='submit' value="Aceptar"></td>
                               </tr>
                           </table>
                       </form>
                           <br>
                           <br>
                           <br>
                           <br>
                   </div>
               </div>
           </div>
        <%@include file="../WEB-INF/jspf/footer.jspf" %>       
        </div>
    </body>
</html>
