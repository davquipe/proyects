<%@page import="pe.edu.upeu.modelo.CpPeriodo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Periodo</title>
    </head>
    <%

        CpPeriodo to = null;
        to = (CpPeriodo) request.getSession().getAttribute("listaPeriodoById");
    %> 
    <body>
        <form method="post" action="../../PeriodoControl">
            <div>
            <label for="id_periodo">Periodo:</label>
            <input id="id_periodo" name="id_periodo" value="<%=to.getPeriodo()%>">
            </div>
            <div>
            <label for="id_multa">Multa:</label>
            <input id="id_multa" name="id_multa" type="number" value="<%=to.getMulta()%>">
            </div>
            <div>
            <label for="id_estado">Estado:</label>
            <select id="id_estado" name="id_estado" value="<%=to.getEstado()%>">
                <option value="1">Activo</option>
                <option value="0">Desactivo</option>
            </select>            </div>
            <div>
            <label for="id_numfalta">Numero de Falta:</label>
            <input id="id_numfalta" name="id_numfalta" type="number" value="<%=to.getNumFalta()%>">
            </div>
            <input type="hidden" name="id" value="<%=to.getIdPeriodo() %>"/>
            <input type="hidden" name="opc" value="U"/>
            <input type="submit" value="GUARDAR">
        </form>
    </body>
</html>
