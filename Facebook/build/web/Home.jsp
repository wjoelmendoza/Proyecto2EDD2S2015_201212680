<%-- 
    Document   : Home
    Created on : 19/10/2015, 11:55:51 PM
    Author     : walter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="WEB-INF/jspf/mst_stl.jspf"%>
        <title>Inicio</title>
    </head>
    <body>
        <div id="page">
            <%@include file="WEB-INF/jspf/header.jspf"  %>
            <div id="mainarea">
                <%@include file="WEB-INF/jspf/menu_p.jspf" %>
                <div id="contentarea">
                    <div id="contenido">
                        <br>
                        <h2>Bienvenido!</h2>
                        <p>Si ya tienes usuario por favor ingrese sus credenciales para identificarse</p>
                        <form method="post" action="/Facebook/LoginUser" class="formularios">
                            <table >
                                <tr>
                                    <td>
                                        usuario o correo:
                                    </td>
                                    <td>
                                        <input id="entrada2" name="pBusqueda" type="text" placeholder="ususario" required><br>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        contraseña:
                                    </td>
                                    <td>
                                        <input id="entrada2" name="pContra" type="password" pattern=".{6,}" placeholder="123456" required><br>
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
                        <a href="crear_usuario.jsp"><h4>Deseas crear tu usuario?</h4></a>
                        <br>
                        <br>
                        <br>
                        <br>
                    </div>
                </div>
            </div>
            <%@include file="WEB-INF/jspf/footer.jspf" %>
        </div>
    </body>
</html>
