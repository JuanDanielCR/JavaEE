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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "tin02_edificio")
@NamedQueries({
    @NamedQuery(name = "Edificio.findAll", query = "SELECT e FROM Edificio e")
    , @NamedQuery(name = "Edificio.findByIdEdifcio", query = "SELECT e FROM Edificio e WHERE e.idEdifcio = :idEdifcio")
    , @NamedQuery(name = "Edificio.findByNbEdificio", query = "SELECT e FROM Edificio e WHERE e.nbEdificio = :nbEdificio")
    , @NamedQuery(name = "Edificio.findByNuNivel", query = "SELECT e FROM Edificio e WHERE e.nuNivel = :nuNivel")
    , @NamedQuery(name = "Edificio.findByTxObservacion", query = "SELECT e FROM Edificio e WHERE e.txObservacion = :txObservacion")})
public class Edificio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_edifcio")
    private Integer idEdifcio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nb_edificio")
    private String nbEdificio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nu_nivel")
    private int nuNivel;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2000)
    @Column(name = "tx_observacion")
    private String txObservacion;
    @JoinColumn(name = "id_unidad", referencedColumnName = "id_unidad")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private UnidadAcademica idUnidad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "edificio", fetch = FetchType.EAGER)
    private List<Nivel> nivelList;

    public Edificio() {
    }

    public Edificio(Integer idEdifcio) {
        this.idEdifcio = idEdifcio;
    }

    public Edificio(Integer idEdifcio, String nbEdificio, int nuNivel, String txObservacion) {
        this.idEdifcio = idEdifcio;
        this.nbEdificio = nbEdificio;
        this.nuNivel = nuNivel;
        this.txObservacion = txObservacion;
    }

    public Integer getIdEdifcio() {
        return idEdifcio;
    }

    public void setIdEdifcio(Integer idEdifcio) {
        this.idEdifcio = idEdifcio;
    }

    public String getNbEdificio() {
        return nbEdificio;
    }

    public void setNbEdificio(String nbEdificio) {
        this.nbEdificio = nbEdificio;
    }

    public int getNuNivel() {
        return nuNivel;
    }

    public void setNuNivel(int nuNivel) {
        this.nuNivel = nuNivel;
    }

    public String getTxObservacion() {
        return txObservacion;
    }

    public void setTxObservacion(String txObservacion) {
        this.txObservacion = txObservacion;
    }

    public UnidadAcademica getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(UnidadAcademica idUnidad) {
        this.idUnidad = idUnidad;
    }

    public List<Nivel> getNivelList() {
        return nivelList;
    }

    public void setNivelList(List<Nivel> nivelList) {
        this.nivelList = nivelList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEdifcio != null ? idEdifcio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Edificio)) {
            return false;
        }
        Edificio other = (Edificio) object;
        if ((this.idEdifcio == null && other.idEdifcio != null) || (this.idEdifcio != null && !this.idEdifcio.equals(other.idEdifcio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.ipn.dae.calmecac.model.Edificio[ idEdifcio=" + idEdifcio + " ]";
    }
    
}
