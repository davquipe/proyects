/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author David
 */
@Entity
@Table(name = "cp_justificacion")
@NamedQueries({
    @NamedQuery(name = "CpJustificacion.findAll", query = "SELECT c FROM CpJustificacion c")})
public class CpJustificacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_JUSTIFICACION")
    private Integer idJustificacion;
    @Basic(optional = false)
    @Column(name = "FECHA")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "JUSTIFICACION")
    private String justificacion;
    @Basic(optional = false)
    @Column(name = "ID_ACTIVIDAD")
    private int idActividad;
    @Basic(optional = false)
    @Column(name = "ID_USUARIO")
    private int idUsuario;

    public CpJustificacion() {
    }

    public CpJustificacion(Integer idJustificacion) {
        this.idJustificacion = idJustificacion;
    }

    public CpJustificacion(Integer idJustificacion, Date fecha, String justificacion, int idActividad, int idUsuario) {
        this.idJustificacion = idJustificacion;
        this.fecha = fecha;
        this.justificacion = justificacion;
        this.idActividad = idActividad;
        this.idUsuario = idUsuario;
    }

    public Integer getIdJustificacion() {
        return idJustificacion;
    }

    public void setIdJustificacion(Integer idJustificacion) {
        this.idJustificacion = idJustificacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getJustificacion() {
        return justificacion;
    }

    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
    }

    public int getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(int idActividad) {
        this.idActividad = idActividad;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idJustificacion != null ? idJustificacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CpJustificacion)) {
            return false;
        }
        CpJustificacion other = (CpJustificacion) object;
        if ((this.idJustificacion == null && other.idJustificacion != null) || (this.idJustificacion != null && !this.idJustificacion.equals(other.idJustificacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.CpJustificacion[ idJustificacion=" + idJustificacion + " ]";
    }
    
}
