/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.servicio;

import java.util.List;
import pe.edu.upeu.dao.PeriodoDaoImpl;
import pe.edu.upeu.dao.PeriodoDaoInterface;
import pe.edu.upeu.modelo.CpPeriodo;
import pe.edu.upeu.utils.IdGenerator;

/**
 *
 * @author David
 */
public class PeriodoServicioImpl implements  PeriodoServicioInterface{
    PeriodoDaoInterface periododao;

    public PeriodoServicioImpl() {
        periododao=new PeriodoDaoImpl();
    }
    
    @Override
    public List<CpPeriodo> listarAperturaPeriodoTodo() {
        return periododao.getListAll();
    }

    @Override
    public CpPeriodo guardarAperturaPeriodo(CpPeriodo aperturaPeriodo) {
        return periododao.save(aperturaPeriodo);
    }

    @Override
    public void eliminarAperturaPeriodo(int idAperturaPeriodo) {
        periododao.delete(idAperturaPeriodo);
    }

    @Override
    public CpPeriodo actualizarAperturaPeriodo(CpPeriodo aperturaPeriodo) {
        return periododao.update(aperturaPeriodo);
    }

    @Override
    public CpPeriodo buscarIdAperturaPeriodo(int idAperturaPeriodo) {
        return (CpPeriodo)periododao.getById(idAperturaPeriodo);

    }

    @Override
    public IdGenerator idGeneradorAperturaPeriodo() {
        return periododao.idAperturaPeriodoGenerator();
    }    
    
}
