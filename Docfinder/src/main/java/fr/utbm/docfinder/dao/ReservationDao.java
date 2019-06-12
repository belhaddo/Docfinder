/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.docfinder.dao;

import fr.utbm.docfinder.entity.Reservation;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

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
        } catch (Exception ex) {
            System.err.println(" Error insert Reservation");
        }
    }

    public List<Reservation> getReservationDao() {
        List<Reservation> listResa = null;
        session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Reservation");
        listResa = query.list();
        return listResa;
    }

    public List<Reservation> getDocReservationDao(long id) {
        List<Reservation> listResa = null;
        session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Reservation WHERE CLIENT_ID= :id");
        query.setParameter("id", id);
        listResa = query.list();
        return listResa;
    }

    public List<Reservation> getCliReservationDao(long id) {
        List<Reservation> listResa = null;
        session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Reservation WHERE DOCTOR_ID= :id");
        query.setParameter("id", id);
        System.out.println(id);

        listResa = query.list();
        return listResa;
    }
}
