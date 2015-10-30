<%-- 
    Document   : cambiar_correo
    Created on : 20/10/2015, 04:17:59 PM
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
        <title>Actualizar Correo</title>
    </head>
    <body>
        <div id="page">
           <%@include file="../WEB-INF/jspf/header.jspf"  %>
           <div id="mainarea">
               <%@include file="../WEB-INF/jspf/menu_u.jspf" %>
               <div id="contentarea">
                   <div id="contenido">
                        <h3>Cambio de correo</h3>
                        <form method="post" action="/Facebook/CambioCorreo">
                             <%
                                HttpSession sesion = request.getSession();
                                UserF user =(UserF) sesion.getAttribute("usuarioL");
                                out.println("<input name='uCorreo' value='"+user.getCorreo()+"' hidden>");
                            %>
                            <table>
                                <tr>
                                    <td>
                                        ingrese el nuevo correo:
                                    </td>
                                    <td>
                                        <input id='entrada2' type="email" placeholder="correo@dominio.com" required>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                        
                                    </td>
                                    <td>
                                        <input id='boton' type="reset" value="Cancelar"><input id="boton" type="submit" value="Aceptar">
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
