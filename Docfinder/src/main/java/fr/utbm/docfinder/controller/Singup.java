/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.docfinder.controller;

import fr.utbm.docfinder.entity.Client;
import fr.utbm.docfinder.entity.Doctor;
import fr.utbm.docfinder.entity.StatusAccount;
import fr.utbm.docfinder.service.ClientService;
import fr.utbm.docfinder.service.DoctorService;
import java.io.IOException;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author BADELH
 */
public class Singup extends HttpServlet {

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
        
        String getFname = request.getParameter("fname");
        String getLname = request.getParameter("lname");
        String getEmail = request.getParameter("email");
        String getPwd = request.getParameter("pwd");
        String getCpwd = request.getParameter("cpwd");
        String getAdrs = request.getParameter("adrs");
        String getLat = request.getParameter("lat");
        String getLng = request.getParameter("lng");
        String getPhone = request.getParameter("phone");
        
        String person = request.getParameter("person");
        
        if (getPwd.equals(getCpwd)) {
            if (person.equals("client")) {
                
                Client client = new Client();
                client.setFirstName(getFname);
                client.setLastName(getLname);
                client.setEmail(getEmail);
                client.setPwd(getPwd);
                client.setAddress(getAdrs);
                client.setLat(getLat);
                client.setLng(getLng);
                client.setPhone(getPhone);
                client.setStatus(StatusAccount.Activate);
                System.out.println(client);
                ClientService cliService = new ClientService();
                cliService.insertClientService(client);
            }
            if (person.equals("doctor")) {
                Doctor doc = new Doctor();
                doc.setFirstName(getFname);
                doc.setLastName(getLname);
                doc.setEmail(getEmail);
                doc.setPwd(getPwd);
                doc.setAddress(getAdrs);
                doc.setLat(getLat);
                doc.setLng(getLng);
                doc.setPhone(getPhone);
                doc.setStatus(StatusAccount.Activate);
                
                DoctorService docService = new DoctorService();
                docService.insertDoctorService(doc);
            }
            
            response.sendRedirect(request.getContextPath() + "/pages/Login.jsp");
            
        } else {
            response.sendRedirect(request.getContextPath() + "/pages/Singup.jsp");
            
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
