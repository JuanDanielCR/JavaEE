/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.ipn.dae.calmecac.dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import mx.ipn.dae.calmecac.model.UnidadAcademica;

/**
 *
 * @author alumno
 */
@Stateless
@LocalBean
public class UnidadAcademicaDAO {

    @PersistenceContext(unitName = "calmecacPU")
    private EntityManager em;

    public List<UnidadAcademica> getUnidadesAcademicas() {
        Query query = em.createNamedQuery("UnidadAcademica.findAll");
        return query.getResultList();
    }

    /*TODO: implementar llamado correcto*/
    public List<UnidadAcademica> getUnidadesAcademicasPorParametroNoNulo(UnidadAcademica unidadAcademica) {
        return getUnidadesAcademicas();
    }
}
