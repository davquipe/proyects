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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "cp_actividad")
@NamedQueries({
    @NamedQuery(name = "CpActividad.findAll", query = "SELECT c FROM CpActividad c")})
public class CpActividad implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_ACTIVIDAD")
    private Integer idActividad;
    @Basic(optional = false)
    @Column(name = "ACTIV_TIPO")
    private String activTipo;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "HORA")
    private String hora;
    @Basic(optional = false)
    @Column(name = "ID_PERIODO")
    private int idPeriodo;

    public CpActividad() {
    }

    public CpActividad(Integer idActividad) {
        this.idActividad = idActividad;
    }

    public CpActividad(Integer idActividad, String activTipo, String descripcion, Date fecha, String hora, int idPeriodo) {
        this.idActividad = idActividad;
        this.activTipo = activTipo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.idPeriodo = idPeriodo;
    }

    public Integer getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(Integer idActividad) {
        this.idActividad = idActividad;
    }

    public String getActivTipo() {
        return activTipo;
    }

    public void setActivTipo(String activTipo) {
        this.activTipo = activTipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(int idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idActividad != null ? idActividad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CpActividad)) {
            return false;
        }
        CpActividad other = (CpActividad) object;
        if ((this.idActividad == null && other.idActividad != null) || (this.idActividad != null && !this.idActividad.equals(other.idActividad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.CpActividad[ idActividad=" + idActividad + " ]";
    }
    
}
