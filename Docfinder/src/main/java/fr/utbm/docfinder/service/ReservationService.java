/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.docfinder.service;

import fr.utbm.docfinder.dao.ReservationDao;
import fr.utbm.docfinder.dao.SpecialityDao;
import fr.utbm.docfinder.entity.Reservation;

/**
 *
 * @author BADELH
 */
public class ReservationService {
    public void insertReservationService(Reservation reserv){
        ReservationDao reservDao = new ReservationDao();
        reservDao.insertReservationDao(reserv);
        
    }
    
}
