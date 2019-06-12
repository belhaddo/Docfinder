/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.docfinder.controller;

import fr.utbm.docfinder.entity.Client;
import fr.utbm.docfinder.entity.Doctor;
import fr.utbm.docfinder.entity.Speciality;
import fr.utbm.docfinder.service.DoctorService;
import fr.utbm.docfinder.service.ReservationService;
import fr.utbm.docfinder.service.SpecialityService;
import fr.utbm.docfinder.entity.Reservation;
import fr.utbm.docfinder.entity.StatusReservation;
import fr.utbm.docfinder.service.ClientService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 33616
 */
public class Reservations extends HttpServlet {

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
        
            /* TODO output your page here. You may use following sample code. */
             HttpSession session = request.getSession();
             // todo: remplacer doctor par client 

        if (session.getAttribute("user") instanceof Client) {
            Client client = (Client) session.getAttribute("user");
            Reservation resa = new Reservation();
            DoctorService docService = new DoctorService();
            ClientService cliService = new ClientService();

            ReservationService resaService = new ReservationService();

            String id=request.getParameter("DOCTOR_ID");
            String endTime = request.getParameter("ENDTIME");
            String startTime = request.getParameter("STARTTIME");
            String tarif = request.getParameter("TARIF");
            String RDVDATE = request.getParameter("RDVDATE");
            resa.setEndTime(endTime);
            resa.setStartTime(startTime);

            resa.setTarif(Double.valueOf(tarif));
            resa.setDoctor(docService.getDoctorFromIdService(Double.valueOf(id)));
            resa.setClient(cliService.getClientFromIdService(client.getId()));
            resa.setStatus(StatusReservation.Wait);
            resa.setRdvDate(RDVDATE);
            resa.setReservDate(RDVDATE);
            resaService.insertReservationService(resa);
            List<Reservation> listResa = resaService.getCliReservationDao(client.getId());
            System.out.println("resa:");
            System.out.println(listResa);
            request.setAttribute("reservationOk", resa);

            this.getServletContext().getRequestDispatcher( "/MapsDoc" ).forward( request, response );
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
