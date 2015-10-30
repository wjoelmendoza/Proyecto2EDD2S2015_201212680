<%-- 
    Document   : about
    Created on : 29/10/2015, 05:09:36 PM
    Author     : walter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="WEB-INF/jspf/mst_stl.jspf" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Acerca de</title>
    </head>
    <body>
        <div id="page">
            <%@include file="WEB-INF/jspf/header.jspf" %>
            <div id="mainarea">
                <%@include file="WEB-INF/jspf/menu_p.jspf" %>
                <div id="contentarea">
                    <div id="contenido">
                        <h2>Acerca de:</h2>
                        Esta aplicacion es un clon de la red Social Facebook, la cual se
                        propone como solucion al proyecto del Curso <b>Estructura de Datos</b>
                        de la Universidad de San Carlos Facultad de ingenieria.
                        <br> Esta aplicacion se divide en:
                        <br><br><b> WebService:</b> esta parte de la aplicacion contiene todas las estructuras para llevar
                        el control de los datos de los usuarios de la aplicacion
                        <br><br><b>Sitio Web:</b> es el front-end con el cual el usuario interactua, este servicio consume
                        los datos almacenados en el WebService de igual manera es capaz de modificarlos y guardar nuevos datos
                        <br><br><b>Aplicacion android:</b> Este es un front-end tiene la misma funcionalidad que el sitio web 
                        con la diferencia que es una aplicacion nativa para el sistema operativo android.
                    </div>
                </div>
            </div>
            <%@include file="WEB-INF/jspf/footer.jspf" %>
           
        </div>
    </body>
</html>
