<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <a href="/UPeUEventoH/UsuarioControl?opc=A">Home</a>
        
    </head>
    <body>
        <form name="formUsuario" method="get" action="../../PeriodoControl">
            <h1>Formulario</h1>
            <div>
            <label for="id_usuario">Usuario:</label>
            <input id="id_usuario" name="id_periodo">
            </div>
            <div>
            <label for="id_Nombre">Nombre:</label>
            <input id="id_Nombre" name="id_multa" type="text">
            </div>
            <div>
            <label for="id_estado">Estado:</label>
            <select id="id_estado" name="id_estado">
                <option value="1">Activo</option>
                <option value="0">Desactivo</option>
            </select>            </div>
            <div>
            <label for="id_numfalta">Numero de Falta:</label>
            <input id="id_numfalta" name="id_numfalta" type="number">
            </div>
            <input type="hidden" name="opc" value="I"/>
            <input type="submit" value="GUARDAR">
        </form>
    </body>
</html>
