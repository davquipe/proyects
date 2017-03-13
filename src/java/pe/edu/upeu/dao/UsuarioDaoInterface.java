/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.dao;

import pe.edu.upeu.modelo.CpUsuario;
import pe.edu.upeu.utils.IdGenerator;
import syscenterlife.dmp.core.data.IDataAccess;

/**
 *
 * @author David
 */
public interface UsuarioDaoInterface extends IDataAccess<CpUsuario> {
    public IdGenerator idAperturaUsuarioGenerator();
    public CpUsuario extraeAperturaUsuario(String estado);
}
