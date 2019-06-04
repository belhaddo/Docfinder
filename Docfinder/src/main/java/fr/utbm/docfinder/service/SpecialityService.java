/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.docfinder.service;

import fr.utbm.docfinder.dao.SpecialityDao;
import fr.utbm.docfinder.entity.Speciality;
import java.util.List;

/**
 *
 * @author BADELH
 */
public class SpecialityService {

    public void insertSpecialityService(Speciality spec) {
        SpecialityDao specDao = new SpecialityDao();
        specDao.insertSpecialityDao(spec);

    }

    public List<Speciality> getSpecialityService() {

        SpecialityDao specDao = new SpecialityDao();
        List<Speciality> listSpec = specDao.getSpecialityDao();
        return listSpec;
    }

    public Speciality getSpecialityService(Integer id) {
        SpecialityDao specDao = new SpecialityDao();
        return specDao.getSpecialityDao(id);
    }

    public void deleteSpecialityDao(Long id) {
        SpecialityDao specDao = new SpecialityDao();
        specDao.deleteSpecialityDao(id);

    }

}
