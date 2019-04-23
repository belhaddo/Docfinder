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

@Data
@Builder
@Entity
public class Client {
    @Id
    private Long idClient;
    private String firstname;
    private String lastname;
    private String email;
    private String pwd;
    private String adress;
    private Integer phone;
    private Integer statusCompte;
    
    
} 
