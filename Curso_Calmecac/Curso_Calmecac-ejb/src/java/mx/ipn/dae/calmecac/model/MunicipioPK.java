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
import javax.validation.constraints.Size;

/**
 *
 * @author alumno
 */
@Embeddable
public class MunicipioPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "id_entidad")
    private String idEntidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "id_municipio")
    private String idMunicipio;

    public MunicipioPK() {
    }

    public MunicipioPK(String idEntidad, String idMunicipio) {
        this.idEntidad = idEntidad;
        this.idMunicipio = idMunicipio;
    }

    public String getIdEntidad() {
        return idEntidad;
    }

    public void setIdEntidad(String idEntidad) {
        this.idEntidad = idEntidad;
    }

    public String getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(String idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEntidad != null ? idEntidad.hashCode() : 0);
        hash += (idMunicipio != null ? idMunicipio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MunicipioPK)) {
            return false;
        }
        MunicipioPK other = (MunicipioPK) object;
        if ((this.idEntidad == null && other.idEntidad != null) || (this.idEntidad != null && !this.idEntidad.equals(other.idEntidad))) {
            return false;
        }
        if ((this.idMunicipio == null && other.idMunicipio != null) || (this.idMunicipio != null && !this.idMunicipio.equals(other.idMunicipio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.ipn.dae.calmecac.model.MunicipioPK[ idEntidad=" + idEntidad + ", idMunicipio=" + idMunicipio + " ]";
    }
    
}
