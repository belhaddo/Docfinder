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
    
    private String descs;

    

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescs() {
        return descs;
    }

    public void setId(long id) {
        this.id = id;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setDescs(String descs) {
        this.descs = descs;
    }

    public Speciality() {
    }

    public Speciality(long id, String name, String descs) {
        this.id = id;
        this.name = name;
        this.descs = descs;
    }

    @Override
    public String toString() {
        return "Speciality{" + "id=" + id + ", name=" + name + ", descs=" + descs + '}';
    }
    

    
}
