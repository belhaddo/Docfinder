/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.docfinder.service;

import fr.utbm.docfinder.dao.ReservationDao;
import fr.utbm.docfinder.dao.SpecialityDao;
import fr.utbm.docfinder.entity.Reservation;
import java.util.List;

/**
 *
 * @author BADELH
 */
public class ReservationService {
    public void insertReservationService(Reservation reserv){
        ReservationDao reservDao = new ReservationDao();
        reservDao.insertReservationDao(reserv);
    }


 public List<Reservation> getReservationsService() {

        ReservationDao resaDao = new ReservationDao();
        List<Reservation> listResa = resaDao.getReservationDao();
        return listResa;
    }

 public  List<Reservation> getCliReservationDao(long id) {
        ReservationDao resaDao = new ReservationDao();
        List<Reservation> listResa = resaDao.getCliReservationDao(id);
        System.out.println("resa dao");
        System.out.println(listResa);
        return listResa;
    }
 
 
 public  List<Reservation> getDocReservationDao(long id) {
        ReservationDao resaDao = new ReservationDao();
        List<Reservation> listResa = resaDao.getDocReservationDao(id);
        return listResa;
    }
}