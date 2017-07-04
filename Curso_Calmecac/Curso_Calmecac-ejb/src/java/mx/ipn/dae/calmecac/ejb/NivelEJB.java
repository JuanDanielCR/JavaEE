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
import mx.ipn.dae.calmecac.model.Nivel;
import mx.ipn.dae.calmecac.model.NivelPK;

/**
 *
 * @author alumno
 */
@Stateless
@LocalBean
public class NivelEJB {
    @EJB
    GenericDAO genericDAO;
    
    public void agregar(Nivel nivel){
        genericDAO.persist(nivel);
    }
    
    public void actualizar(Nivel nivel){
        genericDAO.merge(nivel);
    }
    
    public void eliminar(NivelPK id){
        Nivel nivel = findNivelById(id);
        if(nivel!=null){
            genericDAO.remove(nivel);
        }
    }
    
    public Nivel findNivelById(NivelPK id){
        Nivel nivel = genericDAO.findById(Nivel.class, id);
        return nivel;
    }
}
