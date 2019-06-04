/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.docfinder.dao;

import fr.utbm.docfinder.entity.Admin;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author badelh
 */
public class AdminDao {
    public Admin getAdminLoginDao(String email, String pwd) {
        Admin admin = null;
        Session session = HibernateUtil.getSessionFactory().openSession();

        Query query = session.createQuery("from Admin where EMAIL = :email and PWD= :pwd  ");
        query.setParameter("email", email);
        query.setParameter("pwd", pwd);
        admin = (Admin) query.uniqueResult();

        return admin;
    }
    
    public void insertAdminDao(Admin admin){
         Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.persist(admin);
            session.getTransaction().commit();
        } catch (Exception ex) {
            System.err.println(" Error insert Admin");
        }
        
    }
}
