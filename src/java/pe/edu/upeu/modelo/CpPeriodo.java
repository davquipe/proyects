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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author David
 */
@Entity
@Table(name = "cp_periodo")
@NamedQueries({
    @NamedQuery(name = "CpPeriodo.findAll", query = "SELECT c FROM CpPeriodo c")})
public class CpPeriodo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_PERIODO")
    private Integer idPeriodo;
    @Basic(optional = false)
    @Column(name = "PERIODO")
    private String periodo;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private String estado;
    @Basic(optional = false)
    @Column(name = "MULTA")
    private String multa;
    @Basic(optional = false)
    @Column(name = "NUM_FALTA")
    private int numFalta;

    public CpPeriodo() {
    }

    public CpPeriodo(Integer idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public CpPeriodo(Integer idPeriodo, String periodo, String estado, String multa, int numFalta) {
        this.idPeriodo = idPeriodo;
        this.periodo = periodo;
        this.estado = estado;
        this.multa = multa;
        this.numFalta = numFalta;
    }

    public Integer getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(Integer idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMulta() {
        return multa;
    }

    public void setMulta(String multa) {
        this.multa = multa;
    }

    public int getNumFalta() {
        return numFalta;
    }

    public void setNumFalta(int numFalta) {
        this.numFalta = numFalta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPeriodo != null ? idPeriodo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CpPeriodo)) {
            return false;
        }
        CpPeriodo other = (CpPeriodo) object;
        if ((this.idPeriodo == null && other.idPeriodo != null) || (this.idPeriodo != null && !this.idPeriodo.equals(other.idPeriodo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.CpPeriodo[ idPeriodo=" + idPeriodo + " ]";
    }
    
}
