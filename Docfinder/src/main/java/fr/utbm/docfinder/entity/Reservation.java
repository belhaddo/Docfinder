/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.docfinder.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Builder;
import lombok.Data;

/**
 *
 * @author BADELH
 */
@Data
@Builder
@Entity
public class Reservation {
   @Id
   private Long id ;
   private Long idClient; 
   private Long idDoctor;
   private Date startTime;
   private Date endTime;
   private Date reservationDate;
   private Date rdvDate;
   private Boolean status; 
   private Double Tarif; 
    
}
