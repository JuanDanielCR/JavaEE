/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.ipn.dae.calmecac.ejb;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import mx.ipn.dae.calmecac.dao.GenericDAO;
import mx.ipn.dae.calmecac.model.Salon;

/**
 *
 * @author alumno
 */
@Stateless
@LocalBean
public class SalonEJB {
    @EJB
    GenericDAO genericDAO;
    
    public void agregar(Salon salon){
        genericDAO.persist(salon);
    }
    
    public void actualizar(Salon salon){
        genericDAO.merge(salon);
    }
    
    public void eliminar(Integer id){
        Salon salon = genericDAO.findById(Salon.class, id);
        if(salon != null){
            genericDAO.remove(salon);
        }
    }
    
    public Salon findSalonById(Integer id){
        Salon salon = genericDAO.findById(Salon.class, id);
        return salon;
    }
}
