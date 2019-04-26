/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.docfinder.dao;

import fr.utbm.docfinder.entity.Reservation;
import org.hibernate.Session;

/**
 *
 * @author BADELH
 */
public class ReservationDao {
      Session session; 

    public void insertReservationDao(Reservation reserv) {
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.persist(reserv);
            session.getTransaction().commit();
        } catch(Exception ex){
            System.err.println(" Error insert Reservation");
        }
        }
    
}
