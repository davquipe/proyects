/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.servicio;

import java.util.List;
import pe.edu.upeu.dao.UsuarioDaoImpl;
import pe.edu.upeu.dao.UsuarioDaoInterface;
import pe.edu.upeu.modelo.CpUsuario;
import pe.edu.upeu.utils.IdGenerator;

/**
 *
 * @author David
 */
public class UsuarioServicioImpl implements  UsuarioServicioInterface{
    UsuarioDaoInterface usuariodao;

    public UsuarioServicioImpl() {
        usuariodao=new UsuarioDaoImpl();
    }
    
    @Override
    public List<CpUsuario> listarAperturaUsuarioTodo() {
        return usuariodao.getListAll();
    }

    @Override
    public CpUsuario guardarAperturaUsuario(CpUsuario aperturaUsuario) {
        return usuariodao.save(aperturaUsuario);
    }

    @Override
    public void eliminarAperturaUsuario(int idAperturaUsuario) {
        usuariodao.delete(idAperturaUsuario);
    }

    @Override
    public CpUsuario actualizarAperturaUsuario(CpUsuario aperturaUsuario) {
        return usuariodao.update(aperturaUsuario);
    }

    @Override
    public CpUsuario buscarIdAperturaUsuario(int idAperturaUsuario) {
        return (CpUsuario)usuariodao.getById(idAperturaUsuario);

    }

    @Override
    public IdGenerator idGeneradorAperturaUsuario() {
        return usuariodao.idAperturaUsuarioGenerator();
    }    
    
}
