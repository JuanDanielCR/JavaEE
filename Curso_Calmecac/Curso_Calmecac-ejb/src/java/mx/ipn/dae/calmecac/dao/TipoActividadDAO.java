/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.ipn.dae.calmecac.dao;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import mx.ipn.dae.calmecac.model.TipoActividad;

/**
 *
 * @author alumno
 */
@Stateless
@LocalBean
public class TipoActividadDAO {

    @PersistenceContext(unitName = "calmecacPU")
    private EntityManager em;

    public List<TipoActividad> getTipoActividades(){
        Query query = em.createNamedQuery("TipoActividad.findAll");
        return query.getResultList();
    }
    
}