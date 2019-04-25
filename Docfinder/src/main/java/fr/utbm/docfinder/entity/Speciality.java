/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.docfinder.entity;

import java.io.Serializable;




/**
 *
 * @author BADELH
 */


public class Speciality implements Serializable{

    
    private Long id;
    
    private String name;
    
    private String desc;

    public Speciality(String name, String desc) {
        this.id = null;
        this.name = name;
        this.desc = desc;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    

    
}
