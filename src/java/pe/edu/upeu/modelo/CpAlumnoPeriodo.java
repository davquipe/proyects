/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * 
 */
@Entity
@Table(name = "cp_alumno_periodo")
@NamedQueries({
    @NamedQuery(name = "CpAlumnoPeriodo.findAll", query = "SELECT c FROM CpAlumnoPeriodo c")})
public class CpAlumnoPeriodo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_ALUMNO_PERIODO")
    private Integer idAlumnoPeriodo;
    @Basic(optional = false)
    @Column(name = "ID_PERIODO")
    private int idPeriodo;
    @Basic(optional = false)
    @Column(name = "ID_ALUMNO")
    private int idAlumno;

    public CpAlumnoPeriodo() {
    }

    public CpAlumnoPeriodo(Integer idAlumnoPeriodo) {
        this.idAlumnoPeriodo = idAlumnoPeriodo;
    }

    public CpAlumnoPeriodo(Integer idAlumnoPeriodo, int idPeriodo, int idAlumno) {
        this.idAlumnoPeriodo = idAlumnoPeriodo;
        this.idPeriodo = idPeriodo;
        this.idAlumno = idAlumno;
    }

    public Integer getIdAlumnoPeriodo() {
        return idAlumnoPeriodo;
    }

    public void setIdAlumnoPeriodo(Integer idAlumnoPeriodo) {
        this.idAlumnoPeriodo = idAlumnoPeriodo;
    }

    public int getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(int idPeriodo) {
        this.idPeriodo = idPeriodo;
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
        hash += (idAlumnoPeriodo != null ? idAlumnoPeriodo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CpAlumnoPeriodo)) {
            return false;
        }
        CpAlumnoPeriodo other = (CpAlumnoPeriodo) object;
        if ((this.idAlumnoPeriodo == null && other.idAlumnoPeriodo != null) || (this.idAlumnoPeriodo != null && !this.idAlumnoPeriodo.equals(other.idAlumnoPeriodo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.CpAlumnoPeriodo[ idAlumnoPeriodo=" + idAlumnoPeriodo + " ]";
    }
    
}
