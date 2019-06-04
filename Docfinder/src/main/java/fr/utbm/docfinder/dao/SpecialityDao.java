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
        List<Speciality> listSpec = null;
        session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Speciality");
        listSpec = query.list();
        return listSpec;

    }

    public Speciality getSpecialityDao(Integer id) {
        Speciality spec = null;
        session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Speciality where id= :id");
        query.setInteger("id", id);
        spec = (Speciality)query.uniqueResult();
        return spec;

    }

    public void updateSpecialityDao(Speciality newSpec, Integer id) {
        
        try {
	    session.beginTransaction();
            Speciality spec = getSpecialityDao(id);
            spec.setName(newSpec.getName());
            spec.setDescs(newSpec.getDescs());
             session.merge(spec);
	    session.getTransaction().commit();
    } catch (Exception ex) {
            System.err.println(" Error update speciality");
        }

    }

    // DELETE SPECIALITY
    public void deleteSpecialityDao(Long id) {
        try {
            session = HibernateUtil.getSessionFactory().openSession();
             Speciality spec =session.get(Speciality.class, id);
         if(spec!=null){
            session.delete(spec);
            System.out.println("1 Speciality is deleted");
         }
        } catch (Exception ex) {
            System.err.println("error delete speciality");
            ex.printStackTrace();
        }
    }
    // SELECT SPECIALITY

}
