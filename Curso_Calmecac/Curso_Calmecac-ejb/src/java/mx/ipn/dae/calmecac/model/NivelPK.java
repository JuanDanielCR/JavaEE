/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.ipn.dae.calmecac.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author alumno
 */
@Embeddable
public class NivelPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "id_edifcio")
    private int idEdifcio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_nivel")
    private int idNivel;

    public NivelPK() {
    }

    public NivelPK(int idEdifcio, int idNivel) {
        this.idEdifcio = idEdifcio;
        this.idNivel = idNivel;
    }

    public int getIdEdifcio() {
        return idEdifcio;
    }

    public void setIdEdifcio(int idEdifcio) {
        this.idEdifcio = idEdifcio;
    }

    public int getIdNivel() {
        return idNivel;
    }

    public void setIdNivel(int idNivel) {
        this.idNivel = idNivel;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idEdifcio;
        hash += (int) idNivel;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NivelPK)) {
            return false;
        }
        NivelPK other = (NivelPK) object;
        if (this.idEdifcio != other.idEdifcio) {
            return false;
        }
        if (this.idNivel != other.idNivel) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.ipn.dae.calmecac.model.NivelPK[ idEdifcio=" + idEdifcio + ", idNivel=" + idNivel + " ]";
    }
    
}
