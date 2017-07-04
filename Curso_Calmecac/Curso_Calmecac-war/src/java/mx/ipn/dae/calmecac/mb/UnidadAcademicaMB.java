/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.ipn.dae.calmecac.mb;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ResourceBundle;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import mx.ipn.dae.calmecac.ejb.UnidadAcademicaEJB;
import mx.ipn.dae.calmecac.model.UnidadAcademica;

/**
 * EL import correcto de SessionScoped es este
 *
 * @author alumno
 */
@Named(value = "unidadAcademica")
@SessionScoped
public class UnidadAcademicaMB implements Serializable {

    @EJB
    UnidadAcademicaEJB unidadAcademicaEJB;
    /**
     * Creates a new instance of UnidadAcademicaMB
     */
    private UnidadAcademica bean = new UnidadAcademica();

    public UnidadAcademicaMB() {
    }

    public String agregar() {
        try {
            if(unidadAcademicaEJB.agregar(bean) == 0){
                agregarMensaje(null, "unidadAcademica.agregar.ok");
            }else{
                 agregarMensaje(null, "unidadAcademica.agregar.error");
            }  
        } catch (Exception e) {
            //en lugar de null podrias usar el id de algun componente
            agregarMensaje(null, "unidadAcademica.agregar.error");
        }
        //Navegacion
        return "unidadAcademicaAgregar";
    }
    public void agregarMensaje(String idComponente, String llaveMensaje){
        FacesContext.getCurrentInstance().addMessage(idComponente, 
                    new FacesMessage("Sucedio un error"));
    }
    public FacesMessage getFacesMessage(String llaveMensaje){
        return new FacesMessage(getMensaje(llaveMensaje));
    }
    public String getMensaje(String llaveMensaje){
        return getResourceBundle().getString(llaveMensaje);
    }
    //Dar de alta en resource bundle
    public ResourceBundle getResourceBundle(){
        ResourceBundle resourceBundle = FacesContext.getCurrentInstance()
                .getApplication()
                .getResourceBundle(FacesContext.getCurrentInstance(), "msjs");
        return resourceBundle;
    }
    public UnidadAcademica getBean() {
        return bean;
    }

    public void setBean(UnidadAcademica bean) {
        this.bean = bean;
    }

}
