<%-- 
    Document   : Inicio
    Created on : 21/10/2015, 11:58:14 PM
    Author     : walter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../WEB-INF/jspf/validar_sesion.jspf" %>
<%validarSesion(request.getSession(), response);%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio-FalseBook</title>
        <%@include file="../WEB-INF/jspf/mst_stlu.jspf"%>
    </head>
    <body>
        <div id="page">
           <%@include file="../WEB-INF/jspf/header.jspf"  %>
           <div id="mainarea">
              
               <%@include file="../WEB-INF/jspf/menu_u.jspf" %>
               <div id="contentarea">
                   <div id="contenido">
                       <p>Acá se visualizaran las publicaciones<br>
                       estar atentos a la actualización ya<br>
                       tendrá soporte para la visualización de las<br>
                       publicaciones</p>
                        <%
                            try {
                                    HttpSession sesion = request.getSession();
                                   // out.println();
                                    UserF user = (UserF) sesion.getAttribute("usuarioL");
                                    com.webservice.WSFacebook_Service service = new com.webservice.WSFacebook_Service();
                                    com.webservice.WSFacebook port = service.getWSFacebookPort();
                                
                                    java.lang.String uCorreo = user.getCorreo();
                                    java.util.List<com.webservice.Publicacion> result = port.getPublicacionP(uCorreo);
                                    //out.println("Result = "+result);
                                    if(result!=null){
                                        for(int i =0; i< result.size(); i++){
                                            out.println("<div id ='publicaciones'>");
                                            out.println("<div id='eliminar'>");
                                            out.println("<form method='post' action='/Facebook/EliminarComentario'>");
                                            out.println("<input name='uCorreo' value='" + user.getCorreo()+"' hidden >");
                                            out.println("<input name='sCorreo' value='" +user.getCorreo()+"' hidden>");
                                            out.println("<input name='index' value='" +i+"' hidden>");
                                            out.println("<input id='btne' type='submit' value='x'>");
                                            out.println("</form>");
                                            out.println("</div>");
                                            out.println("<h4>titulo:</h4>" + result.get(i).getTitulo()+"<br>");
                                            out.println("<h4>comentario:</h4> " + result.get(i).getContenido()+"<br>");  
                                            out.println("</div>");
                                        }
                                    }else
                                        out.println("no entro");
                                
                                } catch (Exception ex) {
                                    out.println("algo salio mal...<br>");
                                    out.println(ex.toString());
                                }
                        %>
                   </div>
               </div>
           </div>
        <%@include file="../WEB-INF/jspf/footer.jspf" %>       
        </div>

    
    </body>
</html>
