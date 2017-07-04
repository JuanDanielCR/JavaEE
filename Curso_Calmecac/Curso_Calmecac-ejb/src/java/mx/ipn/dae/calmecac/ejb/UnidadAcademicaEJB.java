/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.ipn.dae.calmecac.ejb;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import mx.ipn.dae.calmecac.dao.GenericDAO;
import mx.ipn.dae.calmecac.model.UnidadAcademica;

/**
 *
 * @author alumno
 */
@Stateless
@LocalBean
public class UnidadAcademicaEJB {

    @EJB
    GenericDAO genericDAO;
    
    public Integer agregar(UnidadAcademica unidadAcademica){
        return genericDAO.persist(unidadAcademica);
    }
    
    public void actualizar(UnidadAcademica unidadAcademica){
        genericDAO.merge(unidadAcademica);
    }
    
    public void eliminar(Integer id){
        UnidadAcademica unidadAcademica = genericDAO.findById(UnidadAcademica.class, id);
        if(unidadAcademica != null){
            genericDAO.remove(unidadAcademica);
        }    
    }
    
    public UnidadAcademica findUnidadAcademicaById(Integer id){
        UnidadAcademica unidadAcademica=genericDAO.findById(UnidadAcademica.class, id);
        return unidadAcademica;
    }
}
