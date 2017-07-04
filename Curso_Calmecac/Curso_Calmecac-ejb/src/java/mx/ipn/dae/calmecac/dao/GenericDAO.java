/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.ipn.dae.calmecac.dao;

import java.io.Serializable;
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

    public Integer persist(Object object) {
        try{
            em.persist(object);
            em.flush();
            return 0;
        }catch(Exception e){
            return -1;
        }
        
    }
    
    public void merge(Object object){
        em.merge(object);
        em.flush();
    }
    
    public void remove(Object object){
        em.remove(object);
        em.flush();
    }
    /*Usar el getAttributes, getAnnotations, ver el atributo que tenga el @Id y
      usar su getter para ahora solo pasar una instancia */
    public <T>T findById(Class <T> clazz, Serializable id){
        return (T)em.find(clazz, id);
    }
}
