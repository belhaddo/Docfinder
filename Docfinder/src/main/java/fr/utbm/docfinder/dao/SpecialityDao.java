/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.docfinder.dao;

import fr.utbm.docfinder.entity.Speciality;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author BADELH
 */
public class SpecialityDao {

    Session session;
// INSERT SPECIALITY

    public void insertSpecialityDao(Speciality spec) {
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.persist(spec);
            session.getTransaction().commit();
        } catch (Exception ex) {
            System.err.println(" Error insert Speciality");
        }
    }

    public List<Speciality> getSpecialityDao() {

        session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from speciality");
        List<Speciality> list = query.list();

        return list;

    }

    // SELECT SPECIALITY
    public void updateSpecialityDao(Speciality spec) {

    }

    // DELETE SPECIALITY

    public void deleteSpecialityDao(Speciality spec) {

    }
    // SELECT SPECIALITY

}
