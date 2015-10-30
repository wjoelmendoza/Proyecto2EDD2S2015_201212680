<%-- 
    Document   : dejar_seguir
    Created on : Oct 28, 2015, 10:53:40 AM
    Author     : Walter Mendoza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../WEB-INF/jspf/validar_sesion.jspf" %>
<%validarSesion(request.getSession(),response);%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../WEB-INF/jspf/mst_stlu.jspf" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dejar de seguir</title>
    </head>
    <body>
        <div id="page">
            <%@include file="../WEB-INF/jspf/header.jspf"%>
            <div id="mainarea">
                <%@include file="../WEB-INF/jspf/menu_u.jspf" %>
                <div id="contentarea" >
                    <div id="contenido">
                        <form>
                            <table>
                            <tr>
                                <td>
                                    Ingrese el correo de la<br>
                                    persona que desea eliminar:
                                </td>
                                <td>
                                    <input id="entrada2" type="email" name="sCorreo" required>
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
        </div>
    </body>
</html>
