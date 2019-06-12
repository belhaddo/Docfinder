/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.docfinder.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.persistence.Id;

/**
 *
 * @author BADELH
 */

@Entity
public class Reservation implements Serializable {
@Id
@GeneratedValue
    private Long id;
@ManyToOne
    private Client client;
@ManyToOne
    private Doctor doctor;

    private String reservDate;

    private String rdvDate;

    private String startTime;

    private String endTime;

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

    public String getReservDate() {
        return reservDate;
    }

    public String getRdvDate() {
        return rdvDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
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

    public void setReservDate(String reservDate) {
        this.reservDate = reservDate;
    }

    public void setRdvDate(String rdvDate) {
        this.rdvDate = rdvDate;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setStatus(StatusReservation status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Reservation{" + "id=" + id + ", client=" + client + ", doctor=" + doctor + ", reservDate=" + reservDate + ", rdvDate=" + rdvDate + ", startTime=" + startTime + ", endTime=" + endTime + ", status=" + status + ", tarif=" + tarif + '}';
    }

    public Reservation() {
    }

    public Reservation(Long id, Client client, Doctor doctor, String reservDate, String rdvDate, String startTime, String endTime, StatusReservation status, Double tarif) {
        this.id = id;
        this.client = client;
        this.doctor = doctor;
        this.reservDate = reservDate;
        this.rdvDate = rdvDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
        this.tarif = tarif;
    }

    public void setTarif(Double tarif) {
        this.tarif = tarif;
    }

    
    
    
    
    
    

}
