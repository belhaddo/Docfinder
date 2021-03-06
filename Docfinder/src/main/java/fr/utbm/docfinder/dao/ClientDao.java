/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.docfinder.dao;

import fr.utbm.docfinder.entity.Client;
import java.util.List;
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

        Query query = session.createQuery("from Client where EMAIL = :email and PWD= :pwd  ");
        query.setParameter("email", email);
        query.setParameter("pwd", pwd);
        client = (Client) query.uniqueResult();

        return client;
    }
    
      public Client getClientFromIdDao(double id) {
        Client client = null;
        session = HibernateUtil.getSessionFactory().openSession();

        Query query = session.createQuery("from Client where ID = :id ");
        query.setParameter("id", id);
        client = (Client) query.uniqueResult();

        return client;
    }


    public List<Client> getClientDao() {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Client> client = null;
        Query query = session.createQuery("from Client");
        client = query.list();
        return client;

    }

    public void updateClientDao(Client oldClient, Client newClient) {
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            oldClient.setFirstName(newClient.getFirstName());
            oldClient.setLastName(newClient.getLastName());
            oldClient.setEmail(newClient.getEmail());
            oldClient.setPwd(newClient.getPwd());
            oldClient.setAddress(newClient.getAddress());
            oldClient.setPhone(newClient.getPhone());
            session.merge(oldClient);
            session.getTransaction().commit();
        } catch (Exception ex) {
            System.err.println(" Error update client");
        }
    }

    public void deleteClientDao(Long id) {
        try{
        session = HibernateUtil.getSessionFactory().openSession();

       Client customer1=session.get(Client.class, id);
         if(customer1!=null){
                session.remove(customer1);
            System.out.println("Customer 1 is deleted");
         }

        }catch(Exception ex){
            System.err.println("error delete client");
            ex.printStackTrace();
        }
    }

}
