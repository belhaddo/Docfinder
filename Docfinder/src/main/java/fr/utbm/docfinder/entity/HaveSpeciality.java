/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.docfinder.entity;

import javax.persistence.Entity;
import lombok.Builder;
import lombok.Data;

/**
 *
 * @author BADELH
 */
@Data
@Builder
//@Entity
public class HaveSpeciality {
    
    private Long idDoctor;
    private Long idSpeLongciality;
    
}
