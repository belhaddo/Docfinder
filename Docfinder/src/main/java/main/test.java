/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import fr.utbm.docfinder.entity.Client;
import fr.utbm.docfinder.entity.StatusAccount;
import fr.utbm.docfinder.service.ClientService;

/**
 *
 * @author BADELH
 */
public class test {
    
    public static void main(String Args[]){
        Client client = new Client();
        client.setFirstName("baa");
        client.setLastName("annotation");
        client.setEmail("email@emeil@ke");
        client.setPwd("pwdpwd");
        client.setAddress("kdnfknddfndsnf");
        client.setPhone("0938884949");
        client.setStatus(StatusAccount.Activate);
        System.out.println("--------------------------------------");
        System.out.println(client.toString());
        ClientService cliService = new ClientService();
        System.out.println("1");
        cliService.insertClientService(client);
        System.out.println("2");
    }
    
}
