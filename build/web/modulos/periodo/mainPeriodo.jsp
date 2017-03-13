<%-- 
    Document   : mainPeriodo
    Created on : nov 28, 2016, 5:17:58 a.m.
    Author     : David
--%>

<%@page import="pe.edu.upeu.modelo.CpPeriodo"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="../../PeriodoControl?opc=B">
            Crear Periodo
        </a>  
        <%
        List<CpPeriodo> listaPeriodo=null; 
        listaPeriodo=(List<CpPeriodo>)request.getSession().getAttribute("reportePeriodo");
        %>
        <br/>        
        <table>
            <tr>
                <td> Reporte de Peridos </td>
            </tr>
            <tr>
                <td>#</td>
                <td>Periodo</td>
                <td>Estado</td>                                
                <td>Multa</td>                                                                           
                <td>Cant. F</td>                                                                           
                <td>Opciones</td>                                
            </tr>
            
                <%  
                int i=0;
                out.print(listaPeriodo.size());
                for(CpPeriodo to: listaPeriodo){
                %>
                <tr>
                <td><%=++i%></td>
                <td><% out.print(to.getPeriodo()); %></td>
                <td><%=to.getEstado() %></td>
                <td><%=to.getMulta() %></td>               
                <td><%=to.getNumFalta() %></td>               
                <td><a href="/UPeUEventoH/PeriodoControl?id=<%=to.getIdPeriodo()%>&opc=D">Delete</a>
                    <a href="/UPeUEventoH/PeriodoControl?id=<%=to.getIdPeriodo()%>&opc=E">Update</a></td>
                </tr>
                <%
                }
               
                %>
            
            
        </table>
    </body>
</html>
