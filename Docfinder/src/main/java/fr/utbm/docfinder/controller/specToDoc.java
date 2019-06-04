/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.docfinder.controller;

import fr.utbm.docfinder.entity.Admin;
import fr.utbm.docfinder.entity.Doctor;
import fr.utbm.docfinder.entity.Speciality;
import fr.utbm.docfinder.service.DoctorService;
import fr.utbm.docfinder.service.SpecialityService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author badelh
 */
public class specToDoc extends HttpServlet {

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
        HttpSession session = request.getSession();
        if (session.getAttribute("user") instanceof Doctor) {
            Doctor doc = (Doctor) session.getAttribute("user");
            Integer idspec = Integer.parseInt(request.getParameter("allspecs"));
            String desc = request.getParameter("desc");

            SpecialityService specService = new SpecialityService();
            DoctorService docService = new DoctorService();
            Speciality spec = specService.getSpecialityService(idspec);

            if (doc.ListTester(spec)) {
                doc.setSpecialities(spec);
            }
            if (!((Doctor) session.getAttribute("user")).getDescs().equals(desc)) {
                doc.setDescs(desc);
            }
            docService.UpdateDoctorService(((Doctor) session.getAttribute("user")), doc);
            System.err.println(doc.toString());
            this.getServletContext().getRequestDispatcher("/DocSpec").forward(request, response);

        } else {
            response.sendRedirect(request.getContextPath() + "/pages/Login.jsp");

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
