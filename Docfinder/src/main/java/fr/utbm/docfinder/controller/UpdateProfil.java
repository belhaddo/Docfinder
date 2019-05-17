/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.docfinder.controller;

import fr.utbm.docfinder.entity.Client;
import fr.utbm.docfinder.entity.Doctor;
import fr.utbm.docfinder.service.ClientService;
import fr.utbm.docfinder.service.DoctorService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author badelh
 */
@WebServlet(name = "UpdateProfil", urlPatterns = {"/UpdateProfil"})
public class UpdateProfil extends HttpServlet {

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
        HttpSession session = request.getSession();
        String getFname = request.getParameter("fname");
        String getLname = request.getParameter("lname");
        String getEmail = request.getParameter("email");
        String getPwd = request.getParameter("pwd");
        String getCpwd = request.getParameter("cpwd");
        String getAdrs = request.getParameter("adrs");
        String getPhone = request.getParameter("phone");

        if (session.getAttribute("type").equals("client")) {
            Client user = (Client) session.getAttribute("user");
            Client client = new Client();
            client.setFirstName(getFname);
            client.setLastName(getLname);
            client.setEmail(getEmail);
            client.setPwd(getPwd);
            client.setAddress(getAdrs);
            client.setPhone(getPhone);
            client.setId(user.getId());
            ClientService cliService = new ClientService();
            cliService.UpdateClientServiceClient(user, client);
        } else if (session.getAttribute("type").equals("doctor")) {
            Doctor user = (Doctor) session.getAttribute("user");

            Doctor doc = new Doctor();
            doc.setFirstName(getFname);
            doc.setLastName(getLname);
            doc.setEmail(getEmail);
            doc.setPwd(getPwd);
            doc.setAddress(getAdrs);
            doc.setPhone(getPhone);
            doc.setId(user.getId());

            DoctorService docService = new DoctorService();
            docService.UpdateDoctorService(user, doc);

        }

        this.getServletContext().getRequestDispatcher("/userspace").forward(request, response);

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
