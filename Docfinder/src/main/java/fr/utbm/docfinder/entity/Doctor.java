/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.docfinder.entity;


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


/**
 *
 * @author BADELH
 */


public class Doctor implements Serializable{


    private Long id;
    
    private String firstName;
    
    private String lastName;
    
    private String email;
    
    private String pwd;
    
    private String address;
    
    private String desc;
    
    private Integer phone;
    
    private StatusAccount status;
    
    private Set<Speciality> specialities = new HashSet<>();


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

    public String getDesc() {
        return desc;
    }

    public Integer getPhone() {
        return phone;
    }

    public StatusAccount getStatus() {
        return status;
    }

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setId(Long id) {
        this.id = id;
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

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public void setStatus(StatusAccount status) {
        this.status = status;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
    
    
    
    

}
