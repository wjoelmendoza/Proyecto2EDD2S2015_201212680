<%-- 
    Document   : subir_foto
    Created on : 29/10/2015, 01:58:55 AM
    Author     : walter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../WEB-INF/jspf/validar_sesion.jspf" %>
<%validarSesion(request.getSession(), response);%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../WEB-INF/jspf/mst_stlu.jspf" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Subir Foto</title>
    </head>
    <body>
        <div id="page">
            <%@include file="../WEB-INF/jspf/header.jspf"%>
            <div id="mainarea">
                <%@include file="../WEB-INF/jspf/menu_u.jspf"%>
                <div id="contentarea">
                    <div id="contenido">
                        <b>Esta foto se cargara como foto de perfil</b>
                        <form method="post" action="/Facebook/CargarFoto" enctype="multipart/form-data" >
                            <table>
                                <tr>
                                    <td>
                                        Seleccione una fotografía:
                                    </td>
                                    <td>
                                        <input type="file" name="foto" accept=".jpeg,.png,.jpg" required>
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
