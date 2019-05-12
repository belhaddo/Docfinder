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
public class Admin implements Serializable{

    
@Id
@GeneratedValue
    private long id;
    
    private String email;
    
    private String pwd;
    
    private Integer phone;

   

    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPwd() {
        return pwd;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setId(long id) {
        this.id = id;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }
    
    

    
}
