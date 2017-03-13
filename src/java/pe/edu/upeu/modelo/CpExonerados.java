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
 * @author David
 */
@Entity
@Table(name = "cp_exonerados")
@NamedQueries({
    @NamedQuery(name = "CpExonerados.findAll", query = "SELECT c FROM CpExonerados c")})
public class CpExonerados implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_EXONERADOS")
    private Integer idExonerados;
    @Basic(optional = false)
    @Column(name = "MOTIVO")
    private String motivo;
    @Basic(optional = false)
    @Column(name = "ID_ALUMNO_PERIODO")
    private int idAlumnoPeriodo;
    @Basic(optional = false)
    @Column(name = "ID_USUARIO")
    private int idUsuario;

    public CpExonerados() {
    }

    public CpExonerados(Integer idExonerados) {
        this.idExonerados = idExonerados;
    }

    public CpExonerados(Integer idExonerados, String motivo, int idAlumnoPeriodo, int idUsuario) {
        this.idExonerados = idExonerados;
        this.motivo = motivo;
        this.idAlumnoPeriodo = idAlumnoPeriodo;
        this.idUsuario = idUsuario;
    }

    public Integer getIdExonerados() {
        return idExonerados;
    }

    public void setIdExonerados(Integer idExonerados) {
        this.idExonerados = idExonerados;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public int getIdAlumnoPeriodo() {
        return idAlumnoPeriodo;
    }

    public void setIdAlumnoPeriodo(int idAlumnoPeriodo) {
        this.idAlumnoPeriodo = idAlumnoPeriodo;
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
        hash += (idExonerados != null ? idExonerados.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CpExonerados)) {
            return false;
        }
        CpExonerados other = (CpExonerados) object;
        if ((this.idExonerados == null && other.idExonerados != null) || (this.idExonerados != null && !this.idExonerados.equals(other.idExonerados))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.CpExonerados[ idExonerados=" + idExonerados + " ]";
    }
    
}
