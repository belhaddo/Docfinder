/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.docfinder.service;

import fr.utbm.docfinder.dao.DoctorDao;
import fr.utbm.docfinder.entity.Doctor;

/**
 *
 * @author BADELH
 */
public class DoctorService {

    public void insertDoctorService(Doctor doc) {
        DoctorDao doctorDao = new DoctorDao();
        doctorDao.insertDoctorDao(doc);

    }

    public Doctor getDoctorLoginDao(String email, String pwd) {
        DoctorDao docService = new DoctorDao();
        Doctor doc = docService.getDoctorLoginDao(email, pwd);
        return doc;

    }

}
