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
        <title>Crear Usuario</title>
    </head>
    <body>
        <div id="page">
            <div id="mainarea">
                <div id="contentarea">
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
                                        <input name="userName" type="text" required placeholder="myUserName" >
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        Ingrese su correo:
                                    </td>
                                    <td>
                                        <input name="correoUser" type="email" required placeholder="correo@dominio.com" >
                                    </td>
                                </tr>
                                
                                <tr>
                                    <td>
                                        Ingrese su contraseña:
                                    </td>
                                    <td>
                                        <input name="contra" type="password" placeholder="123456" pattern=".{6,}" required >
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        Reingrese su contraseña:
                                    </td>
                                    <td>
                                        <input  name="rContra" type="password" placeholder="123456" pattern=".{6,}" required>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        
                                    </td>
                                    <td>
                                        <input type="reset" value="Cancelar">
                                        <input type="submit" value="Aceptar" >
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </form>
                    <br>
                    <br>
                    <br>
                    <%
                        Object aux = request.getAttribute("estado");
                        if(aux!=null){
                            String aux2 = aux.toString();
                        %>
                          <p> <%= aux2 +"entro" %>
                        
                        <%}
                    %>
                </div>
            </div>
        </div>
                
    </body>
</html>