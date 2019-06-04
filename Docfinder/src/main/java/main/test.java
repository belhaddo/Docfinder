/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import fr.utbm.docfinder.entity.Admin;
import fr.utbm.docfinder.entity.Speciality;
import fr.utbm.docfinder.service.AdminService;
import fr.utbm.docfinder.service.SpecialityService;

/**
 *
 * @author BADELH
 */
public class test {
    
    public static void main(String Args[]){
        
        Admin admin = new Admin();
        admin.setEmail("admin@admin.com");
        admin.setPwd("admin");
        admin.setPhone("09999999");
        
        AdminService adminService = new AdminService();
        adminService.insertAdminService(admin);
        }
    }
    

