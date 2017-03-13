/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.dao;

import pe.edu.upeu.modelo.CpPeriodo;
import pe.edu.upeu.utils.IdGenerator;
import syscenterlife.dmp.core.data.IDataAccess;

/**
 *
 * @author David
 */
public interface PeriodoDaoInterface extends IDataAccess<CpPeriodo> {
    public IdGenerator idAperturaPeriodoGenerator();
    public CpPeriodo extraeAperturaPeriodo(String estado);
}
