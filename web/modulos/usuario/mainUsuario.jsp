<%-- 
    Document   : mainPeriodo
    Created on : nov 28, 2016, 5:17:58 a.m.
 
--%>

<%@page import="pe.edu.upeu.modelo.CpUsuario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="../../UsuarioControl?opc=B">
            Crear Usuario
        </a>  
        <%
        List<CpUsuario> listaUsuario=null; 
        listaUsuario=(List<CpUsuario>)request.getSession().getAttribute("reporteUsuario");
        %>
        <br/>        
        <table>
            <tr>
                <td> Reporte de usuarios </td>
            </tr>
            <tr>
                <td>#</td>
                <td>Usuario</td>
                <td>nombre</td>                                
                <td>apellidos</td>                                                                           
                <td>estado</td>                                                                           
                <td>Opciones</td>                                
            </tr>
            
                <%  
                int i=0;
                out.print(listaUsuario.size());
                for(CpUsuario to: listaUsuario){
                %>
                <tr>
                <td><%=++i%></td>
                <td><% out.print(to.getUsuario()); %></td>
                <td><%=to.getEstado() %></td>
                <td><%=to.getNombre() %></td>               
                <td><%=to.getApellidos() %></td>               
                <td><a href="/UPeUEventoH/UsuarioControl?id=<%=to.getIdUsuario()%>&opc=D">Delete</a>
                    <a href="/UPeUEventoH/UsuarioControl?id=<%=to.getIdUsuario()%>&opc=E">Update</a></td>
                </tr>
                <%
                }
               
                %>
            
            
        </table>
    </body>
</html>
