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

public class Client implements Serializable{

   
    private Long id;
    
    private String firstName;
    
    private String lastName;
   
    private String email;
    
    private String pwd;
    
    private String address;
    
    private Integer phone;
   
    private StatusAccount status;

    public Client( String firstName, String lastName, String email, String pwd, String address, Integer phone, StatusAccount status) {
        this.id = null;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.pwd = pwd;
        this.address = address;
        this.phone = phone;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPwd() {
        return pwd;
    }

    public String getAddress() {
        return address;
    }

    public Integer getPhone() {
        return phone;
    }

    public StatusAccount getStatus() {
        return status;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public void setStatus(StatusAccount status) {
        this.status = status;
    }
}
    
    
    
    

