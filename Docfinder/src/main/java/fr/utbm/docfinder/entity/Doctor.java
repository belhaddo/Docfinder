/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.docfinder.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Builder;
import lombok.Data;

/**
 *
 * @author BADELH
 */
@Entity
@Data
@Builder
public class Doctor {
    @Id
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String pwd;
    private String adress;
    private String descDoctor;
    private Integer phone;
    private Integer statusCompte;
    
}
