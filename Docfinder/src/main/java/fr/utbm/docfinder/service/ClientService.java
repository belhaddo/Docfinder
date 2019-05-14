/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.docfinder.service;

import fr.utbm.docfinder.dao.ClientDao;
import fr.utbm.docfinder.dao.HibernateUtil;
import fr.utbm.docfinder.entity.Client;
import java.util.List;
import org.hibernate.query.Query;

/**
 *
 * @author BADELH
 */
public class ClientService {
    public void insertClientService(Client client){
        ClientDao clientDao = new ClientDao();
        clientDao.insertClientDao(client);
        
    }
    
        public Client getClientLoginService(String email, String pwd) {
            
            ClientDao cliDao = new ClientDao();
            Client client  = cliDao.getClientLoginDao(email, pwd);
            return client;
            
        }
         public List<Client> getClientService() {
        List<Client> client = null;
        ClientDao cliDao = new ClientDao();
        client = cliDao.getClientDao();
        
        return client;

    }

    
}
