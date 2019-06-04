/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.docfinder.service;

import fr.utbm.docfinder.dao.AdminDao;
import fr.utbm.docfinder.entity.Admin;

/**
 *
 * @author badelh
 */
public class AdminService {
        public Admin getAdminLoginService(String email, String pwd) {
            Admin admin = null;
            AdminDao adminDao = new AdminDao();
            admin = adminDao.getAdminLoginDao(email, pwd);
            
            return admin;
        }
    public void insertAdminService(Admin admin){
        
        AdminDao adminDao = new AdminDao();
        adminDao.insertAdminDao(admin);
    }

    
}
