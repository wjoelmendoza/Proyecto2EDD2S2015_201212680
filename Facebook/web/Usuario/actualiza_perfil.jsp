<%-- 
    Document   : actualiza_perfil
    Created on : 20/10/2015, 03:35:11 PM
    Author     : walter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../WEB-INF/jspf/validar_sesion.jspf" %>
<%validarSesion(request.getSession(), response);%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="../WEB-INF/jspf/mst_stlu.jspf"%>
        <title>Actualiza</title>
    </head>
    <body>
        <div id="page">
            <%@include file="../WEB-INF/jspf/header.jspf"  %>
            <div id="mainarea">
               <%@include file="../WEB-INF/jspf/menu_u.jspf" %>
               <div id="contentarea">
                   <div id="contenido">
                        <h3>ingrese los datos que desea modificar:</h3>
                        <form method="post" action="/Facebook/ActPerfil">
                            <table>
                                <tr>
                                    <td>
                                        ingrese su edad:
                                    </td>
                                    <td>
                                        <input id='entrada2' name="uEdad" type="number" min="0" >
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        Ingrese su nombre:
                                    </td>
                                    <td>
                                        <input id='entrada2' name="uNombre" type="text"  >
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        Ingrese un país:
                                    </td>
                                    <td>
                                        <input id='entrada2' name="uPais" type="text">
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        Estado Civil:
                                    </td>
                                    <td>
                                        <select id='entrada2' name="uEstCiv">
                                            <option></option>
                                            <option>Casado</option>
                                            <option>Soltero</option>
                                            <option>Otro</option>
                                        </select>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        seleccione su genero:
                                    </td>
                                    <td>
                                        <select id='entrada2' name="uGenero">
                                            <option></option>
                                            <option>Femenino</option>
                                            <option>Masculino</option>
                                            <option>Otro</option>
                                        </select>
                                    </td>
                                </tr>
                                <tr>
                                    <td></td>
                                    <td><input id='boton' type="reset" value="Cancelar"><input id='boton' type="submit" value="Aceptar"></td>
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
