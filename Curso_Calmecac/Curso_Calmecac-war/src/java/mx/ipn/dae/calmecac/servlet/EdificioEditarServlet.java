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
import mx.ipn.dae.calmecac.ejb.EdificioEJB;
import mx.ipn.dae.calmecac.ejb.UnidadAcademicaEJB;
import mx.ipn.dae.calmecac.model.Edificio;

/**
 *
 * @author alumno
 */
@WebServlet(name = "EdificioEditarServlet", urlPatterns = {"/EdificioEditar"})
public class EdificioEditarServlet extends HttpServlet {
    @EJB
    UnidadAcademicaEJB unidadAcademicaEJB;
    @EJB
    EdificioEJB edificioEJB;
    
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
        response.setContentType("text/html;charset=UTF-8");
        
        //Integer idUnidad = Integer.parseInt(request.getParameter("idUnidad"));
        Integer idEdificio =  Integer.parseInt(request.getParameter("idEdificio"));
        //String nombre =  request.getParameter("nombre");
        //Integer nivel = Integer.parseInt(request.getParameter("nivel"));
        String observacion =  request.getParameter("observacion");    
        
        //Edificio edificio = new Edificio();
        Edificio edificio = edificioEJB.findEdificioById(idEdificio);
        //edificio.setIdEdifcio(idEdificio);
        //edificio.setIdUnidad(unidadAcademicaEJB.findUnidadAcademicaById(idUnidad));
        
        //edificio.setNbEdificio(nombre);
        //edificio.setNuNivel(nivel);
        edificio.setTxObservacion(observacion);
        
        edificioEJB.actualizar(edificio);
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EdificioEditarServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Editar Edificio</h1>");
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
