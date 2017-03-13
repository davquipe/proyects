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
@Table(name = "cp_asistencia")
@NamedQueries({
    @NamedQuery(name = "CpAsistencia.findAll", query = "SELECT c FROM CpAsistencia c")})
public class CpAsistencia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_ASISTENCIA")
    private String idAsistencia;
    @Basic(optional = false)
    @Column(name = "FECHA")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "ID_ACTIVIDAD")
    private int idActividad;
    @Basic(optional = false)
    @Column(name = "ID_USUARIO")
    private int idUsuario;
    @Basic(optional = false)
    @Column(name = "ID_ALUMNO")
    private int idAlumno;

    public CpAsistencia() {
    }

    public CpAsistencia(String idAsistencia) {
        this.idAsistencia = idAsistencia;
    }

    public CpAsistencia(String idAsistencia, Date fecha, int idActividad, int idUsuario, int idAlumno) {
        this.idAsistencia = idAsistencia;
        this.fecha = fecha;
        this.idActividad = idActividad;
        this.idUsuario = idUsuario;
        this.idAlumno = idAlumno;
    }

    public String getIdAsistencia() {
        return idAsistencia;
    }

    public void setIdAsistencia(String idAsistencia) {
        this.idAsistencia = idAsistencia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAsistencia != null ? idAsistencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CpAsistencia)) {
            return false;
        }
        CpAsistencia other = (CpAsistencia) object;
        if ((this.idAsistencia == null && other.idAsistencia != null) || (this.idAsistencia != null && !this.idAsistencia.equals(other.idAsistencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.CpAsistencia[ idAsistencia=" + idAsistencia + " ]";
    }
    
}
