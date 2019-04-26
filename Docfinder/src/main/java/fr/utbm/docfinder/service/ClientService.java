/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.docfinder.service;

import fr.utbm.docfinder.dao.ClientDao;
import fr.utbm.docfinder.entity.Client;

/**
 *
 * @author BADELH
 */
public class ClientService {
    public void insertClientService(Client client){
        ClientDao clientDao = new ClientDao();
        clientDao.insertClientDao(client);
        
    }
    
}
