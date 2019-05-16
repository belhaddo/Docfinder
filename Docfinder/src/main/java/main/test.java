/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import fr.utbm.docfinder.entity.Client;
import fr.utbm.docfinder.entity.Doctor;
import fr.utbm.docfinder.entity.Speciality;
import fr.utbm.docfinder.entity.StatusAccount;
import fr.utbm.docfinder.service.ClientService;
import fr.utbm.docfinder.service.DoctorService;
import java.util.List;

/**
 *
 * @author BADELH
 */
public class test {
    
    public static void main(String Args[]){
        DoctorService docService = new DoctorService();
        Doctor doc = new Doctor();
        doc.setFirstName("louis");
        doc.setLastName("rafael");
        doc.setAddress("rue 2 Hospital 89000");
        doc.setPwd("doctor");
        doc.setEmail("doc1@utbm.fr");doc.setStatus(StatusAccount.Activate);
       // doc.setSpecialities(new Speciality());
        
        docService.insertDoctorService(doc);
       
        }
    }
    

