/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.ipn.dae.calmecac.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author alumno
 */
@Entity
@Table(name = "tin05_direccion")
@NamedQueries({
    @NamedQuery(name = "Direccion.findAll", query = "SELECT d FROM Direccion d")
    , @NamedQuery(name = "Direccion.findByIdDireccion", query = "SELECT d FROM Direccion d WHERE d.idDireccion = :idDireccion")
    , @NamedQuery(name = "Direccion.findByTxCp", query = "SELECT d FROM Direccion d WHERE d.txCp = :txCp")
    , @NamedQuery(name = "Direccion.findByTxColonia", query = "SELECT d FROM Direccion d WHERE d.txColonia = :txColonia")
    , @NamedQuery(name = "Direccion.findByTxLocalidad", query = "SELECT d FROM Direccion d WHERE d.txLocalidad = :txLocalidad")
    , @NamedQuery(name = "Direccion.findByTxCalle", query = "SELECT d FROM Direccion d WHERE d.txCalle = :txCalle")
    , @NamedQuery(name = "Direccion.findByTxNumeroExt", query = "SELECT d FROM Direccion d WHERE d.txNumeroExt = :txNumeroExt")
    , @NamedQuery(name = "Direccion.findByTxNumeroInt", query = "SELECT d FROM Direccion d WHERE d.txNumeroInt = :txNumeroInt")})
public class Direccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_direccion")
    private Integer idDireccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "tx_cp")
    private String txCp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "tx_colonia")
    private String txColonia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "tx_localidad")
    private String txLocalidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "tx_calle")
    private String txCalle;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "tx_numero_ext")
    private String txNumeroExt;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "tx_numero_int")
    private String txNumeroInt;
    @JoinColumns({
        @JoinColumn(name = "id_entidad", referencedColumnName = "id_entidad")
        , @JoinColumn(name = "id_municipio", referencedColumnName = "id_municipio")})
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Municipio municipio;

    public Direccion() {
    }

    public Direccion(Integer idDireccion) {
        this.idDireccion = idDireccion;
    }

    public Direccion(Integer idDireccion, String txCp, String txColonia, String txLocalidad, String txCalle, String txNumeroExt, String txNumeroInt) {
        this.idDireccion = idDireccion;
        this.txCp = txCp;
        this.txColonia = txColonia;
        this.txLocalidad = txLocalidad;
        this.txCalle = txCalle;
        this.txNumeroExt = txNumeroExt;
        this.txNumeroInt = txNumeroInt;
    }

    public Integer getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(Integer idDireccion) {
        this.idDireccion = idDireccion;
    }

    public String getTxCp() {
        return txCp;
    }

    public void setTxCp(String txCp) {
        this.txCp = txCp;
    }

    public String getTxColonia() {
        return txColonia;
    }

    public void setTxColonia(String txColonia) {
        this.txColonia = txColonia;
    }

    public String getTxLocalidad() {
        return txLocalidad;
    }

    public void setTxLocalidad(String txLocalidad) {
        this.txLocalidad = txLocalidad;
    }

    public String getTxCalle() {
        return txCalle;
    }

    public void setTxCalle(String txCalle) {
        this.txCalle = txCalle;
    }

    public String getTxNumeroExt() {
        return txNumeroExt;
    }

    public void setTxNumeroExt(String txNumeroExt) {
        this.txNumeroExt = txNumeroExt;
    }

    public String getTxNumeroInt() {
        return txNumeroInt;
    }

    public void setTxNumeroInt(String txNumeroInt) {
        this.txNumeroInt = txNumeroInt;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDireccion != null ? idDireccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Direccion)) {
            return false;
        }
        Direccion other = (Direccion) object;
        if ((this.idDireccion == null && other.idDireccion != null) || (this.idDireccion != null && !this.idDireccion.equals(other.idDireccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.ipn.dae.calmecac.model.Direccion[ idDireccion=" + idDireccion + " ]";
    }
    
}
