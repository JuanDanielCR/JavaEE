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
import mx.ipn.dae.calmecac.model.Edificio;

/**
 *
 * @author alumno
 */
@Stateless
@LocalBean
public class EdificioEJB {
    @EJB
    GenericDAO genericDAO;
    
    public void agregar(Edificio edificio){
        genericDAO.persist(edificio);
    }
    
    public void actualizar(Edificio edificio){
        genericDAO.merge(edificio);
    }
    
    public void eliminar(Integer id){
        Edificio salon = genericDAO.findById(Edificio.class, id);
        if(salon != null){
            genericDAO.remove(salon);
        }
    }
    
    public Edificio findEdificioById(Integer id){
        Edificio edificio =  genericDAO.findById(Edificio.class, id);
        return edificio;        
    }
}
