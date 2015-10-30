<%-- 
    Document   : EliminarPerfil
    Created on : 20/10/2015, 04:06:36 PM
    Author     : walter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../WEB-INF/jspf/validar_sesion.jspf" %>
<%validarSesion(request.getSession(), response);%>
<!DOCTYPE html>
<html>
    <head>       
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eliminar</title>
        <%@include file="../WEB-INF/jspf/mst_stlu.jspf"%>
    </head>
    <body>
        <div id="page">
           <%@include file="../WEB-INF/jspf/header.jspf"  %>
           <div id="mainarea">
               <%@include file="../WEB-INF/jspf/menu_u.jspf" %>
               <div id="contentarea">
                   <div id="contenido">
                        <h3>Eliminar</h3>
                        Tome en cuenta que toda su información y su perfil seran eliminados totalmente y no podra recuperala de
                        ninguna forma. Si esta seguro de querer Eliminar su perfil por favor ingrese su contraseña
                        <form action="/Facebook/EliminarPerfil" method="post">
                            <table>
                                <tr>
                                    <td>
                                        Ingrese su contraseña:
                                    </td>
                                    <td>
                                        <input id="entrada2" name="uContra" type="password" placeholder="123456" pattern=".{6,}" required>
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
