/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.docfinder.controller;

import fr.utbm.docfinder.entity.Admin;
import fr.utbm.docfinder.entity.Client;
import fr.utbm.docfinder.entity.Doctor;
import fr.utbm.docfinder.service.AdminService;
import fr.utbm.docfinder.service.ClientService;
import fr.utbm.docfinder.service.DoctorService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author badelh
 */
public class Login extends HttpServlet {

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

        String person = request.getParameter("person");
        String getEmail = request.getParameter("email");
        String getPwd = request.getParameter("pwd");
        HttpSession session = request.getSession();

        if (person.equals("client")) {

            ClientService cliService = new ClientService();
            Client client = cliService.getClientLoginService(getEmail, getPwd);

            if (client != null) {
                session.setAttribute("user", client);

                this.getServletContext().getRequestDispatcher("/userspace").forward(request, response);
            } else {
                response.sendRedirect(request.getContextPath() + "/pages/Login.jsp");
                System.err.println("no match person");
            }

        }
        if (person.equals("doctor")) {

            DoctorService docService = new DoctorService();
            Doctor doc = docService.getDoctorLoginDao(getEmail, getPwd);
            if (doc != null) {
                session.setAttribute("user", doc);
                this.getServletContext().getRequestDispatcher("/userspace").forward(request, response);

            } else {
                response.sendRedirect(request.getContextPath() + "/pages/Login.jsp");
                System.err.println("no match person");
            }

        }
        if (person.equals("admin")) {

            AdminService adminService = new AdminService();
            Admin admin = adminService.getAdminLoginService(getEmail, getPwd);
            if (admin != null) {
                session.setAttribute("user", admin);
                this.getServletContext().getRequestDispatcher("/DispDoc").forward(request, response);
            }
            else{
                response.sendRedirect(request.getContextPath() + "/pages/Login.jsp");
                System.err.println("no match person");
            }

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
