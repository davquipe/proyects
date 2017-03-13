/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.dao;


import org.hibernate.Session;
import org.hibernate.Transaction;
import pe.edu.upeu.modelo.CpUsuario;
import pe.edu.upeu.utils.IdGenerator;
import syscenterlife.dmp.core.data.DataAccess;

/**
 *
 * @author David
 */
public class UsuarioDaoImpl extends DataAccess<CpUsuario> implements UsuarioDaoInterface{
 
    @Override
    public IdGenerator idAperturaUsuarioGenerator() {
        IdGenerator to = null;
        Session sesion = getSessionFactory().openSession();
        Transaction t = sesion.beginTransaction();
        try {
            to = (IdGenerator) sesion
                    .createSQLQuery("SELECT CONCAT(EXTRACT(YEAR_MONTH FROM NOW()), LPAD(EXTRACT(DAY FROM NOW()),2,'0'),LPAD((CASE WHEN MAX(CONVERT(NULLIF(SUBSTR(id_apertura_usuario,9,16), 0),UNSIGNED INTEGER)) IS NULL THEN 0 ELSE MAX(CONVERT(NULLIF(SUBSTR(id_apertura_usuario,9,16), 0),UNSIGNED INTEGER)) END)+1,8,'0')) AS id FROM glo_apertura_usuario a ")
                    .addEntity(IdGenerator.class).uniqueResult();
        } catch (Exception e) {
           // logger.info("Mensage de Error en idAperturaPeriodoGenerator() " + e.getMessage());
        } finally {
            t.commit();
        }
        return to;
    } 
    
    @Override
    public CpUsuario extraeAperturaUsuario(String estado) {
        Session session = getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        CpUsuario lista =(CpUsuario) session.createQuery("SELECT a from CpUsuario a WHERE a.estado=? and  ")
                .setParameter(0, estado)
                .uniqueResult();
        t.commit();
        return lista;
    }    
}
