/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.docfinder.main;

import fr.utbm.docfinder.entity.Speciality;
import fr.utbm.docfinder.service.SpecialityService;


/**
 *
 * @author BADELH
 */


public class Test {
    
    public static void main(String Args[]){
        System.out.println("!!!!!!!!!!!!!!!!!!! main !!!!!!!!!!!!!!");
        Speciality spec =new Speciality();
        spec.setName("cardiologue");
        spec.setDesc("cest un carrdio");
        SpecialityService specService = new SpecialityService();
        specService.insertSpecialityService(spec);
        
    }
    
}
