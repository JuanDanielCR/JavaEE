/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.ipn.dae.calmecac.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author alumno
 */
@Entity
@Table(name = "tin03_nivel")
@NamedQueries({
    @NamedQuery(name = "Nivel.findAll", query = "SELECT n FROM Nivel n")
    , @NamedQuery(name = "Nivel.findByIdEdifcio", query = "SELECT n FROM Nivel n WHERE n.nivelPK.idEdifcio = :idEdifcio")
    , @NamedQuery(name = "Nivel.findByIdNivel", query = "SELECT n FROM Nivel n WHERE n.nivelPK.idNivel = :idNivel")})
public class Nivel implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected NivelPK nivelPK;
    @JoinColumn(name = "id_edifcio", referencedColumnName = "id_edifcio", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Edificio edificio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nivel", fetch = FetchType.EAGER)
    private List<Salon> salonList;

    public Nivel() {
    }

    public Nivel(NivelPK nivelPK) {
        this.nivelPK = nivelPK;
    }

    public Nivel(int idEdifcio, int idNivel) {
        this.nivelPK = new NivelPK(idEdifcio, idNivel);
    }

    public NivelPK getNivelPK() {
        return nivelPK;
    }

    public void setNivelPK(NivelPK nivelPK) {
        this.nivelPK = nivelPK;
    }

    public Edificio getEdificio() {
        return edificio;
    }

    public void setEdificio(Edificio edificio) {
        this.edificio = edificio;
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
        hash += (nivelPK != null ? nivelPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nivel)) {
            return false;
        }
        Nivel other = (Nivel) object;
        if ((this.nivelPK == null && other.nivelPK != null) || (this.nivelPK != null && !this.nivelPK.equals(other.nivelPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.ipn.dae.calmecac.model.Nivel[ nivelPK=" + nivelPK + " ]";
    }
    
}
