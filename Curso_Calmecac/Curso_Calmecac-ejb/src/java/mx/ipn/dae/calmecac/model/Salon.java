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
import javax.validation.constraints.Size;

/**
 *
 * @author alumno
 */
@Entity
@Table(name = "tin04_salon")
@NamedQueries({
    @NamedQuery(name = "Salon.findAll", query = "SELECT s FROM Salon s")
    , @NamedQuery(name = "Salon.findByIdSalon", query = "SELECT s FROM Salon s WHERE s.idSalon = :idSalon")
    , @NamedQuery(name = "Salon.findByNbSalon", query = "SELECT s FROM Salon s WHERE s.nbSalon = :nbSalon")
    , @NamedQuery(name = "Salon.findByNuCapacidad", query = "SELECT s FROM Salon s WHERE s.nuCapacidad = :nuCapacidad")
    , @NamedQuery(name = "Salon.findByStDiscapacidad", query = "SELECT s FROM Salon s WHERE s.stDiscapacidad = :stDiscapacidad")
    , @NamedQuery(name = "Salon.findByTxObservacion", query = "SELECT s FROM Salon s WHERE s.txObservacion = :txObservacion")})
public class Salon implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_salon")
    private Integer idSalon;
    @Size(max = 50)
    @Column(name = "nb_salon")
    private String nbSalon;
    @Column(name = "nu_capacidad")
    private Integer nuCapacidad;
    @Column(name = "st_discapacidad")
    private Boolean stDiscapacidad;
    @Size(max = 2000)
    @Column(name = "tx_observacion")
    private String txObservacion;
    @JoinColumn(name = "id_tipo", referencedColumnName = "id_tipo")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private TipoActividad idTipo;
    @JoinColumns({
        @JoinColumn(name = "id_edifcio", referencedColumnName = "id_edifcio")
        , @JoinColumn(name = "id_nivel", referencedColumnName = "id_nivel")})
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Nivel nivel;

    public Salon() {
    }

    public Salon(Integer idSalon) {
        this.idSalon = idSalon;
    }

    public Integer getIdSalon() {
        return idSalon;
    }

    public void setIdSalon(Integer idSalon) {
        this.idSalon = idSalon;
    }

    public String getNbSalon() {
        return nbSalon;
    }

    public void setNbSalon(String nbSalon) {
        this.nbSalon = nbSalon;
    }

    public Integer getNuCapacidad() {
        return nuCapacidad;
    }

    public void setNuCapacidad(Integer nuCapacidad) {
        this.nuCapacidad = nuCapacidad;
    }

    public Boolean getStDiscapacidad() {
        return stDiscapacidad;
    }

    public void setStDiscapacidad(Boolean stDiscapacidad) {
        this.stDiscapacidad = stDiscapacidad;
    }

    public String getTxObservacion() {
        return txObservacion;
    }

    public void setTxObservacion(String txObservacion) {
        this.txObservacion = txObservacion;
    }

    public TipoActividad getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(TipoActividad idTipo) {
        this.idTipo = idTipo;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSalon != null ? idSalon.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Salon)) {
            return false;
        }
        Salon other = (Salon) object;
        if ((this.idSalon == null && other.idSalon != null) || (this.idSalon != null && !this.idSalon.equals(other.idSalon))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.ipn.dae.calmecac.model.Salon[ idSalon=" + idSalon + " ]";
    }
    
}
