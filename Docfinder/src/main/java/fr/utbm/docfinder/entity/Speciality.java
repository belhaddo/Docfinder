/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.docfinder.entity;

import java.io.Serializable;
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

public class Speciality implements Serializable {
    @Id
    private Long idSpec;
    private String nameSpec;
    private String descSpec;
    
}
