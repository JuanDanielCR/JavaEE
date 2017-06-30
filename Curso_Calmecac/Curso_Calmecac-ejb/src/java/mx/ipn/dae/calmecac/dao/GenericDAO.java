/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.ipn.dae.calmecac.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author alumno
 */
@Stateless
public class GenericDAO {

    @PersistenceContext(unitName = "calmecacPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
        em.flush();
    }
    
    public void merge(Object object){
        em.merge(object);
        em.flush();
    }
    
    public void remove(Object object){
        em.remove(object);
        em.flush();
    }
}
