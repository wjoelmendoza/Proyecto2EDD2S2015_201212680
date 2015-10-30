<%-- 
    Document   : AddBus
    Created on : 08/09/2015, 23:33:43
    Author     : walter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="focusblur.js" type="text/javascript"></script>
        <%@include file="WEB-INF/jspf/mst_stl.jspf"%>
        <title>Crear Usuario</title>
    </head>
    <body>
        <div id="page">
            <%@include file="WEB-INF/jspf/header.jspf"  %>
            <div id="mainarea">
                <%@include file="WEB-INF/jspf/menu_p.jspf" %>
                <div id="contentarea">
                    <div id="contenido">
                        <br>
                        <br>
                        <br>
                        <h2>Ingrese los datos para su usuario:</h2>
                        <form method="post" action="/Facebook/AgregarUsuario">
                            <table border="0" cellpadding="5">
                                <thead>
                                    <tr>
                                        <th></th>
                                        <th></th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td>
                                            Ingrese su nombre de usuario:
                                        </td>
                                        <td>
                                            <input  id="nombre" name="userName" type="text" required placeholder="myUserName" >
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            Ingrese su correo:
                                        </td>
                                        <td>
                                            <input id="email" name="correoUser" type="email" required placeholder="correo@dominio.com" >
                                        </td>
                                    </tr>
                                
                                    <tr>
                                        <td>
                                            Ingrese su contraseña:
                                        </td>
                                        <td>
                                            <input id="password" name="contra" type="password" placeholder="123456" pattern=".{6,}" required >
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            Reingrese su contraseña:
                                        </td>
                                        <td>
                                            <input id ="rPassword" name="rContra" type="password" placeholder="123456" pattern=".{6,}" required>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            
                                        </td>
                                        <td>
                                            <input id="boton"type="reset" value="Cancelar">
                                            <input id="btnAceptar"type="submit" value="Aceptar" >
                                        </td>
                                    </tr>
                                </tbody>
                            </table>
                            <p id="textoAyuda"></p>
                        </form>
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