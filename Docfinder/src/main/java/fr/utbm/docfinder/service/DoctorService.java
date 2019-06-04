/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.docfinder.service;

import fr.utbm.docfinder.dao.ClientDao;
import fr.utbm.docfinder.dao.DoctorDao;
import fr.utbm.docfinder.entity.Client;
import fr.utbm.docfinder.entity.Doctor;
import java.util.List;

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

    public List<Doctor> getDoctorService() {
        List<Doctor> doc = null;
        DoctorDao cliDao = new DoctorDao();
        doc = cliDao.getDoctorDao();

        return doc;

    }

    public void UpdateDoctorService(Doctor oldDoc, Doctor newDoc) {
        DoctorDao docDao = new DoctorDao();
        docDao.updateDoctorDao(oldDoc, newDoc);
    }
    
        public void deleteDoctorService(Long id) {
            
                    DoctorDao docDao = new DoctorDao();
                    docDao.deleteDoctorDao(id);

            
        }

}
