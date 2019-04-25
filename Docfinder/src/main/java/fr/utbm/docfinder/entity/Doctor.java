/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.docfinder.entity;


import java.io.Serializable;
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
    
    private Set<Speciality> specialities;

    public Doctor( String firstName, String lastName, String email, String pwd, String address, String desc, Integer phone, StatusAccount status, Set<Speciality> specialities) {
        this.id = null;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.pwd = pwd;
        this.address = address;
        this.desc = desc;
        this.phone = phone;
        this.status = status;
        this.specialities = specialities;
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
