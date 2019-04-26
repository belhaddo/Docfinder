/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.docfinder.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author BADELH
 */


public class Reservation implements Serializable {

    private Long id;

    private Client client;

    private Doctor doctor;

    private Date reservDate;

    private Date rdvDate;

    private Date startTime;

    private Date endTime;

    private StatusReservation status  ;

    private Double tarif;

    

    public Long getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Date getReservDate() {
        return reservDate;
    }

    public Date getRdvDate() {
        return rdvDate;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public StatusReservation getStatus() {
        return status;
    }

    public Double getTarif() {
        return tarif;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void setReservDate(Date reservDate) {
        this.reservDate = reservDate;
    }

    public void setRdvDate(Date rdvDate) {
        this.rdvDate = rdvDate;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setStatus(StatusReservation status) {
        this.status = status;
    }

    public void setTarif(Double tarif) {
        this.tarif = tarif;
    }
    
    
    
    
    

}
