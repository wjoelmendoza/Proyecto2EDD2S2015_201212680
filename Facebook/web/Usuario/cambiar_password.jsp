<%-- 
    Document   : cambiar_password
    Created on : 20/10/2015, 04:22:19 PM
    Author     : walter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../WEB-INF/jspf/validar_sesion.jspf" %>
<%validarSesion(request.getSession(), response);%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cambiar Correo</title>
        <%@include file="../WEB-INF/jspf/mst_stlu.jspf"%>
    </head>
    <body>
        <div id="page">
           <%@include file="../WEB-INF/jspf/header.jspf"  %>
           <div id="mainarea">
               <%@include file="../WEB-INF/jspf/menu_u.jspf" %>
               <div id="contentarea">
                   <div id="contenido">
                       <h3>Cambiar Contraseña:</h3>
                       <p>por su seguridad nos debe de proporcionar su contraseña actual<br>y debe de ingresar 2 veces su nueva contraseña.</p>
                        <form>
                            <table>
                                <tr>
                                    <td>
                                        ingrese su contraseña actual:
                                    </td>
                                    <td>
                                        <input id="entrada2" type="password" placeholder="123456" required>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        ingrese su nueva contraseña:
                                    </td>
                                    <td>
                                        <input id="entrada2" type="password" placeholder="123456" required>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        Reingrese su nueva contraseña:
                                    </td>
                                    <td>
                                        <input id="entrada2" type="password" placeholder="123456" required>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                        
                                    </td>
                                    <td>
                                        <input id="boton" type="reset" value="Cancelar"><input id="boton" type="submit" value="Aceptar">
                                        </td>
                                    </tr>
                            </table>
                        </form>
                   </div>
               </div>
           </div>
        <%@include file="../WEB-INF/jspf/footer.jspf" %>       
        </div>
        
    </body>
</html>
