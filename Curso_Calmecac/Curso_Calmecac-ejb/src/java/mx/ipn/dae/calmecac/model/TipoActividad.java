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
@Table(name = "tin07_tipo_actividad")
@NamedQueries({
    @NamedQuery(name = "TipoActividad.findAll", query = "SELECT t FROM TipoActividad t")
    , @NamedQuery(name = "TipoActividad.findByIdTipo", query = "SELECT t FROM TipoActividad t WHERE t.idTipo = :idTipo")
    , @NamedQuery(name = "TipoActividad.findByNbTipo", query = "SELECT t FROM TipoActividad t WHERE t.nbTipo = :nbTipo")
    , @NamedQuery(name = "TipoActividad.findByDsTipo", query = "SELECT t FROM TipoActividad t WHERE t.dsTipo = :dsTipo")
    , @NamedQuery(name = "TipoActividad.findByStActivo", query = "SELECT t FROM TipoActividad t WHERE t.stActivo = :stActivo")})
public class TipoActividad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipo")
    private Integer idTipo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nb_tipo")
    private String nbTipo;
    @Size(max = 50)
    @Column(name = "ds_tipo")
    private String dsTipo;
    @Column(name = "st_activo")
    private Boolean stActivo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipo", fetch = FetchType.EAGER)
    private List<Salon> salonList;

    public TipoActividad() {
    }

    public TipoActividad(Integer idTipo) {
        this.idTipo = idTipo;
    }

    public TipoActividad(Integer idTipo, String nbTipo) {
        this.idTipo = idTipo;
        this.nbTipo = nbTipo;
    }

    public Integer getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(Integer idTipo) {
        this.idTipo = idTipo;
    }

    public String getNbTipo() {
        return nbTipo;
    }

    public void setNbTipo(String nbTipo) {
        this.nbTipo = nbTipo;
    }

    public String getDsTipo() {
        return dsTipo;
    }

    public void setDsTipo(String dsTipo) {
        this.dsTipo = dsTipo;
    }

    public Boolean getStActivo() {
        return stActivo;
    }

    public void setStActivo(Boolean stActivo) {
        this.stActivo = stActivo;
    }

    public List<Salon> getSalonList() {
        return salonList;
    }

    public void setSalonList(List<Salon> salonList) {
        this.salonList = salonList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipo != null ? idTipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoActividad)) {
            return false;
        }
        TipoActividad other = (TipoActividad) object;
        if ((this.idTipo == null && other.idTipo != null) || (this.idTipo != null && !this.idTipo.equals(other.idTipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.ipn.dae.calmecac.model.TipoActividad[ idTipo=" + idTipo + " ]";
    }
    
}
