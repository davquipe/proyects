/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.servicio;

import java.util.List;
import pe.edu.upeu.modelo.CpPeriodo;
import pe.edu.upeu.utils.IdGenerator;

/**
 *
 * @author David
 */
public interface PeriodoServicioInterface {
    public List<CpPeriodo> listarAperturaPeriodoTodo();
    public CpPeriodo guardarAperturaPeriodo(CpPeriodo aperturaPeriodo);
    public void eliminarAperturaPeriodo(int idAperturaPeriodo);
    public CpPeriodo actualizarAperturaPeriodo(CpPeriodo aperturaPeriodo);
    public CpPeriodo buscarIdAperturaPeriodo(int idAperturaPeriodo);
    public IdGenerator idGeneradorAperturaPeriodo();
}
