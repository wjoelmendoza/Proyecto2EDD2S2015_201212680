<%-- 
    Document   : BuscarPersona
    Created on : 20/10/2015, 03:18:48 PM
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
        <title>Busqueda</title>
    </head>
    <body>
        <div id="page">
            <%@include file="../WEB-INF/jspf/header.jspf"  %>
            <div id="mainarea">
                <%@include file="../WEB-INF/jspf/menu_u.jspf" %>
                <div id="contentarea">
                   <div id="contenido">
                        <h2>Buscar Persona</h2>
                        <form  method="post">
                            <table>
                                <tr>
                                    <td>Ingrese el correo de la<br>persona que busca</td>
                                    <td><input id='entrada2' name="eBusqueda" type="email"  placeholder="correo@dominio.com"required></td>
                                </tr>
                                <tr>
                                    <td></td>
                                    <td><input id='boton' type="submit" value="Aceptar"><input id='boton' type="reset" value="Cancelar"></td>
                                </tr>
                            </table>
                        </form>
                        <%
                            String parametro = request.getParameter("eBusqueda");
                            if (parametro!=null){
                                try {
                                    com.webservice.WSFacebook_Service service = new com.webservice.WSFacebook_Service();
                                    com.webservice.WSFacebook port = service.getWSFacebookPort();
                                    // TODO initialize WS operation arguments here
                                    java.lang.String pBusqueda = parametro;
                                    // TODO process result here
                                    com.webservice.Perfil result = port.buscarUsuario(pBusqueda);
                                    if(result!=null){
                                        HttpSession sesion = request.getSession();
                                        UserF user = (UserF)sesion.getAttribute("usuarioL");
                                        out.println("<div id='resultado'>");
                                        out.println("se encontro al usuario:<br>");
                                        out.println("Nombre = "+result.getNombre());
                                        out.println("<form method='post' action='/Facebook/AddSeguidor'>");
                                        out.println("<input name='uCorreo' value='"+user.getCorreo()+"' hidden>");
                                        out.println("<input name='sCorreo' value='"+parametro+"' hidden>");
                                        out.println("<input name='sNombre' value='"+result.getNombre()+"' hidden >");
                                        out.println("<input type='submit' value='Seguir'>");
                                        out.println("</form>");
                                        out.println("</div>");
                                    }else{
                                        out.println("<font color='red' style='font-weight:bold'>Sin coincidencias</font>");
                                    }
                                } catch (Exception ex) {
                                    // TODO handle custom exceptions here
                                }
                            }
                        %>
                   </div>
               </div>
            </div>
            <%@include file="../WEB-INF/jspf/footer.jspf" %>
        </div>
    
    </body>
</html>
