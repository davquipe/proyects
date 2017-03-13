/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.servicio;

import java.util.List;
import pe.edu.upeu.modelo.CpUsuario;
import pe.edu.upeu.utils.IdGenerator;

/**
 *
 * @author David
 */
public interface UsuarioServicioInterface {
    public List<CpUsuario> listarAperturaUsuarioTodo();
    public CpUsuario guardarAperturaUsuario(CpUsuario aperturaUsuario);
    public void eliminarAperturaUsuario(int idAperturaUsuario);
    public CpUsuario actualizarAperturaUsuario(CpUsuario aperturaUsuario);
    public CpUsuario buscarIdAperturaUsuario(int idAperturaUsuario);
    public IdGenerator idGeneradorAperturaUsuario();
}
