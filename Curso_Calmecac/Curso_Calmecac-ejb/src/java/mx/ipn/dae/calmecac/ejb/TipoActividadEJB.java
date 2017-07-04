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
import mx.ipn.dae.calmecac.dao.TipoActividadDAO;
import mx.ipn.dae.calmecac.model.TipoActividad;
/**
 *
 * @author alumno
 */
@Stateless
@LocalBean
public class TipoActividadEJB {
    @EJB
    GenericDAO genericDAO;
    
    public void agregar(TipoActividad tipoActividad){
        genericDAO.persist(tipoActividad);
    }
    
    public void actualizar(TipoActividad tipoActividad){
        genericDAO.merge(tipoActividad);
    }
    
    public void eliminar(Integer id){
        TipoActividad tipoActividad = genericDAO.findById(TipoActividad.class, id);
        if(tipoActividad != null){
            genericDAO.remove(tipoActividad);
        }
    }
    
    public TipoActividad findTipoActividadById(Integer id){
        return genericDAO.findById(TipoActividad.class, id);
    }
}
