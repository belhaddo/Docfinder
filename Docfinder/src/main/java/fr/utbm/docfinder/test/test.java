/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.docfinder.test;

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
        client.setFirstName("jhsjd");
        client.setLastName("jdsj");
        client.setEmail("dsdds@sfddf.dd");
        client.setPwd("pwd");
        client.setAddress("jhdj");
        client.setPhone("039837383");
        client.setStatus(StatusAccount.Activate);
        System.out.println("--------------------------------------");

        System.out.println(client.toString());
        ClientService cliService = new ClientService();
        System.out.println("1");
        cliService.insertClientService(client);
    }
}
