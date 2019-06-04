/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.docfinder.dao;

import fr.utbm.docfinder.entity.Client;
import fr.utbm.docfinder.entity.Doctor;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author BADELH
 */
public class DoctorDao {

    Session session;

    public void insertDoctorDao(Doctor doc) {
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.persist(doc);
            session.getTransaction().commit();
        } catch (Exception ex) {
            System.err.println(" Error insert Doctor");
        }
    }

    public Doctor getDoctorLoginDao(String email, String pwd) {
        Doctor doc = null;
        session = HibernateUtil.getSessionFactory().openSession();

        Query query = session.createQuery("from Doctor where EMAIL = :email and PWD= :pwd  ");
        query.setParameter("email", email);
        query.setParameter("pwd", pwd);
        doc = (Doctor) query.uniqueResult();

        return doc;
    }

    public List<Doctor> getDoctorDao() {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Doctor> doc = null;
        Query query = session.createQuery("from Doctor");
        doc = query.list();
        return doc;

    }

    public void updateDoctorDao(Doctor oldDoc, Doctor newDoc) {
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            oldDoc.setFirstName(newDoc.getFirstName());
            oldDoc.setLastName(newDoc.getLastName());
            oldDoc.setEmail(newDoc.getEmail());
            oldDoc.setPwd(newDoc.getPwd());
            oldDoc.setAddress(newDoc.getAddress());
            oldDoc.setPhone(newDoc.getPhone());
            session.merge(oldDoc);
            session.getTransaction().commit();
                            System.out.println("doctor updated");

        } catch (Exception ex) {
            System.err.println(" Error update Doctor");
        }
    }

    public void deleteDoctorDao(Long id) {
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Doctor doc = session.get(Doctor.class, id);
            if (doc != null) {
                session.remove(doc);
                System.out.println("1 Doctor is deleted");
            }
        } catch (Exception ex) {

            System.err.println("error delete doctor");
            ex.printStackTrace();
        }

    }
   

}
