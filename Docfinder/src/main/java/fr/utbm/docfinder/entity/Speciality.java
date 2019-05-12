/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.docfinder.entity;

import java.io.Serializable;
import javax.persistence.*;




/**
 *
 * @author BADELH
 */

@Entity
public class Speciality implements Serializable{

    @Id
    @GeneratedValue
    private long id ;
    
    private String name;
    
    private String desc;

    

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public void setId(long id) {
        this.id = id;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    

    
}
