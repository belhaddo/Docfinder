/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.docfinder.dao;

import fr.utbm.docfinder.entity.Client;
import fr.utbm.docfinder.entity.Speciality;
import org.hibernate.Session;

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
        } catch(Exception ex){
            System.err.println(" Error insert Client");
        }
        }
    
}
