/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.dao;


import org.hibernate.Session;
import org.hibernate.Transaction;
import pe.edu.upeu.modelo.CpPeriodo;
import pe.edu.upeu.utils.IdGenerator;
import syscenterlife.dmp.core.data.DataAccess;

/**
 *
 * @author David
 */
public class PeriodoDaoImpl extends DataAccess<CpPeriodo> implements PeriodoDaoInterface{
 
    @Override
    public IdGenerator idAperturaPeriodoGenerator() {
        IdGenerator to = null;
        Session sesion = getSessionFactory().openSession();
        Transaction t = sesion.beginTransaction();
        try {
            to = (IdGenerator) sesion
                    .createSQLQuery("SELECT CONCAT(EXTRACT(YEAR_MONTH FROM NOW()), LPAD(EXTRACT(DAY FROM NOW()),2,'0'),LPAD((CASE WHEN MAX(CONVERT(NULLIF(SUBSTR(id_apertura_periodo,9,16), 0),UNSIGNED INTEGER)) IS NULL THEN 0 ELSE MAX(CONVERT(NULLIF(SUBSTR(id_apertura_periodo,9,16), 0),UNSIGNED INTEGER)) END)+1,8,'0')) AS id FROM glo_apertura_periodo a ")
                    .addEntity(IdGenerator.class).uniqueResult();
        } catch (Exception e) {
           // logger.info("Mensage de Error en idAperturaPeriodoGenerator() " + e.getMessage());
        } finally {
            t.commit();
        }
        return to;
    } 
    
    @Override
    public CpPeriodo extraeAperturaPeriodo(String estado) {
        Session session = getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        CpPeriodo lista =(CpPeriodo) session.createQuery("SELECT a from CpPeriodo a WHERE a.estado=? ")
                .setParameter(0, estado)
                .uniqueResult();
        t.commit();
        return lista;
    }    
}
