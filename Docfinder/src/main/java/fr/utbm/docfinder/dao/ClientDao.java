/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.docfinder.dao;

import fr.utbm.docfinder.entity.Client;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author BADELH
 */
public class ClientDao {

    Session session;

    public void insertClientDao(Client client) {
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.persist(client);
            session.getTransaction().commit();
        } catch (Exception ex) {
            System.err.println(" Error insert Client");
        }
    }

    public Client getClientLoginDao(String email, String pwd) {
        Client client = null;
        session = HibernateUtil.getSessionFactory().openSession();

        Query query = session.createQuery("from Client where EMAIL_CLIENT = :email and PWD_CLIENT= :pwd  ");
        query.setParameter("email", email);
        query.setParameter("pwd", pwd);
        client =  (Client) query.uniqueResult();

        return client;
    }

}
