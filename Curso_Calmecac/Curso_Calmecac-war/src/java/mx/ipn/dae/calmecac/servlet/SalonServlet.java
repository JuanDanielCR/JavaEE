/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.ipn.dae.calmecac.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.ipn.dae.calmecac.ejb.NivelEJB;
import mx.ipn.dae.calmecac.ejb.SalonEJB;
import mx.ipn.dae.calmecac.ejb.TipoActividadEJB;
import mx.ipn.dae.calmecac.model.Nivel;
import mx.ipn.dae.calmecac.model.NivelPK;
import mx.ipn.dae.calmecac.model.Salon;
import mx.ipn.dae.calmecac.model.TipoActividad;

/**
 *
 * @author alumno
 */
@WebServlet(name = "SalonServlet", urlPatterns = {"/Salon"})
public class SalonServlet extends HttpServlet {
    @EJB
    SalonEJB salonEJB;
    @EJB
    TipoActividadEJB tipoActividadEJB;
    @EJB
    NivelEJB nivelEJB;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre = request.getParameter("nombre");
        Integer capacidad =  Integer.parseInt(request.getParameter("capacidad"));
        Boolean discapacidad = Boolean.parseBoolean(request.getParameter("disc"));
        String observacion = request.getParameter("observacion");
        
        TipoActividad tipo = tipoActividadEJB.findTipoActividadById(Integer.parseInt(request.getParameter("idTipo")));
        
        NivelPK idNivel = new NivelPK();
        idNivel.setIdEdifcio(Integer.parseInt(request.getParameter("idEd")));
        idNivel.setIdNivel(Integer.parseInt(request.getParameter("idNivel")));
        
        Nivel nivel = nivelEJB.findNivelById(idNivel);
        System.out.println("adiosh: "+nivel);
        Salon salon = new Salon();
        
        salon.setNbSalon(nombre);
        salon.setTxObservacion(observacion);
        salon.setNuCapacidad(capacidad);
        salon.setStDiscapacidad(discapacidad);
        salon.setNivel(nivel);
        salon.setIdTipo(tipo);
        
        salonEJB.agregar(salon);
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SalonServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SalonServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
