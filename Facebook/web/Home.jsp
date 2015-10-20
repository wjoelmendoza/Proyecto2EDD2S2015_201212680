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
        <title>Inicio</title>
    </head>
    <body>
        <h1>Bienvenido!</h1>
        <form method="post" action="/Facebook/LoginUser">
            usuario o correo: <input name="pBusqueda" type="text" placeholder="ususario" required><br>
            contraseña: <input name="pContra" type="password" pattern=".{6,}" placeholder="123456" required><br>
            <input type="reset" value="Cancelar"><input type="submit" value="Aceptar">
        </form>
        <a href="crear_usuario.jsp"><h4>Deseas crear tu usuario?</h4></a>
        <br>
        esto es una modificación
        esto tendria que funcionar
    </body>
</html>
