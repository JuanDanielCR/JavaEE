/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.ipn.dae.calmecac.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author alumno
 */
@Entity
@Table(name = "tsp02_municipio")
@NamedQueries({
    @NamedQuery(name = "Municipio.findAll", query = "SELECT m FROM Municipio m")
    , @NamedQuery(name = "Municipio.findByIdEntidad", query = "SELECT m FROM Municipio m WHERE m.municipioPK.idEntidad = :idEntidad")
    , @NamedQuery(name = "Municipio.findByIdMunicipio", query = "SELECT m FROM Municipio m WHERE m.municipioPK.idMunicipio = :idMunicipio")
    , @NamedQuery(name = "Municipio.findByNbMunicipio", query = "SELECT m FROM Municipio m WHERE m.nbMunicipio = :nbMunicipio")
    , @NamedQuery(name = "Municipio.findByStActivo", query = "SELECT m FROM Municipio m WHERE m.stActivo = :stActivo")})
public class Municipio implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MunicipioPK municipioPK;
    @Size(max = 100)
    @Column(name = "nb_municipio")
    private String nbMunicipio;
    @Column(name = "st_activo")
    private Boolean stActivo;
    @JoinColumn(name = "id_entidad", referencedColumnName = "id_entidad", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Entidad entidad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "municipio", fetch = FetchType.EAGER)
    private List<Direccion> direccionList;

    public Municipio() {
    }

    public Municipio(MunicipioPK municipioPK) {
        this.municipioPK = municipioPK;
    }

    public Municipio(String idEntidad, String idMunicipio) {
        this.municipioPK = new MunicipioPK(idEntidad, idMunicipio);
    }

    public MunicipioPK getMunicipioPK() {
        return municipioPK;
    }

    public void setMunicipioPK(MunicipioPK municipioPK) {
        this.municipioPK = municipioPK;
    }

    public String getNbMunicipio() {
        return nbMunicipio;
    }

    public void setNbMunicipio(String nbMunicipio) {
        this.nbMunicipio = nbMunicipio;
    }

    public Boolean getStActivo() {
        return stActivo;
    }

    public void setStActivo(Boolean stActivo) {
        this.stActivo = stActivo;
    }

    public Entidad getEntidad() {
        return entidad;
    }

    public void setEntidad(Entidad entidad) {
        this.entidad = entidad;
    }

    public List<Direccion> getDireccionList() {
        return direccionList;
    }

    public void setDireccionList(List<Direccion> direccionList) {
        this.direccionList = direccionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (municipioPK != null ? municipioPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Municipio)) {
            return false;
        }
        Municipio other = (Municipio) object;
        if ((this.municipioPK == null && other.municipioPK != null) || (this.municipioPK != null && !this.municipioPK.equals(other.municipioPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.ipn.dae.calmecac.model.Municipio[ municipioPK=" + municipioPK + " ]";
    }
    
}
