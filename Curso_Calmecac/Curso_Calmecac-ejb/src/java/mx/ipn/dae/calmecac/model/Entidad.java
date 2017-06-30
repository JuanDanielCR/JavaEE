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
@Table(name = "tsp01_entidad")
@NamedQueries({
    @NamedQuery(name = "Entidad.findAll", query = "SELECT e FROM Entidad e")
    , @NamedQuery(name = "Entidad.findByIdEntidad", query = "SELECT e FROM Entidad e WHERE e.idEntidad = :idEntidad")
    , @NamedQuery(name = "Entidad.findByNbEntidad", query = "SELECT e FROM Entidad e WHERE e.nbEntidad = :nbEntidad")
    , @NamedQuery(name = "Entidad.findByStActivo", query = "SELECT e FROM Entidad e WHERE e.stActivo = :stActivo")})
public class Entidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "id_entidad")
    private String idEntidad;
    @Size(max = 35)
    @Column(name = "nb_entidad")
    private String nbEntidad;
    @Column(name = "st_activo")
    private Boolean stActivo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "entidad", fetch = FetchType.EAGER)
    private List<Municipio> municipioList;

    public Entidad() {
    }

    public Entidad(String idEntidad) {
        this.idEntidad = idEntidad;
    }

    public String getIdEntidad() {
        return idEntidad;
    }

    public void setIdEntidad(String idEntidad) {
        this.idEntidad = idEntidad;
    }

    public String getNbEntidad() {
        return nbEntidad;
    }

    public void setNbEntidad(String nbEntidad) {
        this.nbEntidad = nbEntidad;
    }

    public Boolean getStActivo() {
        return stActivo;
    }

    public void setStActivo(Boolean stActivo) {
        this.stActivo = stActivo;
    }

    public List<Municipio> getMunicipioList() {
        return municipioList;
    }

    public void setMunicipioList(List<Municipio> municipioList) {
        this.municipioList = municipioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEntidad != null ? idEntidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Entidad)) {
            return false;
        }
        Entidad other = (Entidad) object;
        if ((this.idEntidad == null && other.idEntidad != null) || (this.idEntidad != null && !this.idEntidad.equals(other.idEntidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.ipn.dae.calmecac.model.Entidad[ idEntidad=" + idEntidad + " ]";
    }
    
}
