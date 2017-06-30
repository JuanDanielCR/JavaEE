/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.ipn.dae.calmecac.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author alumno
 */
@Entity
@Table(name = "tin01_unidad_academica")
@NamedQueries({
    @NamedQuery(name = "UnidadAcademica.findAll", query = "SELECT u FROM UnidadAcademica u")
    , @NamedQuery(name = "UnidadAcademica.findByIdUnidad", query = "SELECT u FROM UnidadAcademica u WHERE u.idUnidad = :idUnidad")
    , @NamedQuery(name = "UnidadAcademica.findByNbUnidad", query = "SELECT u FROM UnidadAcademica u WHERE u.nombre = :nombre")
    , @NamedQuery(name = "UnidadAcademica.findByTxClave", query = "SELECT u FROM UnidadAcademica u WHERE u.txClave = :txClave")
    , @NamedQuery(name = "UnidadAcademica.findByTxAcronimo", query = "SELECT u FROM UnidadAcademica u WHERE u.txAcronimo = :txAcronimo")})
public class UnidadAcademica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_unidad")
    private Integer idUnidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "nb_unidad")
    private String nombre;
    @Size(max = 10)
    @Column(name = "tx_clave")
    private String txClave;
    @Size(max = 50)
    @Column(name = "tx_acronimo")
    private String txAcronimo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUnidad", fetch = FetchType.EAGER)
    private List<Edificio> edificioList;

    public UnidadAcademica() {
    }

    public UnidadAcademica(Integer idUnidad) {
        this.idUnidad = idUnidad;
    }

    public UnidadAcademica(Integer idUnidad, String nbUnidad) {
        this.idUnidad = idUnidad;
        this.nombre = nbUnidad;
    }

    public Integer getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(Integer idUnidad) {
        this.idUnidad = idUnidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTxClave() {
        return txClave;
    }

    public void setTxClave(String txClave) {
        this.txClave = txClave;
    }

    public String getTxAcronimo() {
        return txAcronimo;
    }

    public void setTxAcronimo(String txAcronimo) {
        this.txAcronimo = txAcronimo;
    }

    public List<Edificio> getEdificioList() {
        return edificioList;
    }

    public void setEdificioList(List<Edificio> edificioList) {
        this.edificioList = edificioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUnidad != null ? idUnidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnidadAcademica)) {
            return false;
        }
        UnidadAcademica other = (UnidadAcademica) object;
        if ((this.idUnidad == null && other.idUnidad != null) || (this.idUnidad != null && !this.idUnidad.equals(other.idUnidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.ipn.dae.calmecac.model.UnidadAcademica[ idUnidad=" + idUnidad + " ]";
    }
    
}
