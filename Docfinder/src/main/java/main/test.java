/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import fr.utbm.docfinder.entity.Client;
import fr.utbm.docfinder.entity.StatusAccount;
import fr.utbm.docfinder.service.ClientService;
import java.util.List;

/**
 *
 * @author BADELH
 */
public class test {
    
    public static void main(String Args[]){
       ClientService cliService = new ClientService();
       List<Client> client = cliService.getClientService();
       
        for (Client client1 : client) {
            System.out.println(client1.toString());
            
        }
            
        }
    }
    

