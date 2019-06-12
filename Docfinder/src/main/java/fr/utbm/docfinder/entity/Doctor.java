/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.docfinder.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author BADELH
 */
@Entity
@Table(name = "DOCTOR", uniqueConstraints = {
    @UniqueConstraint(columnNames = "ID")
    ,
@UniqueConstraint(columnNames = "EMAIL")
    ,
@UniqueConstraint(columnNames = "PHONE")

})
public class Doctor implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String pwd;

    private String address;

     private String lat;
    
    private String lng;
    
    private String descs;

    private String phone;

    @Enumerated(EnumType.ORDINAL)
    private StatusAccount status;

    @OneToMany
    private Set<Speciality> specialities;

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public Doctor() {
        this.specialities = new HashSet<>();
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

    public String getDescs() {
        return descs;
    }

    public String getPhone() {
        return phone;
    }

    public StatusAccount getStatus() {
        return status;
    }

    public List<Speciality> getSpecialities() {
        return new ArrayList<>(specialities);
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

    public void setDescs(String descs) {
        this.descs = descs;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setStatus(StatusAccount status) {
        this.status = status;
    }

    public void setSpecialities(Speciality specialities) {
        this.specialities.add(specialities);
    }

    public Doctor(Long id, String firstName, String lastName, String email, String pwd, String address, String lat, String lng, String descs, String phone, StatusAccount status, Set<Speciality> specialities) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.pwd = pwd;
        this.address = address;
        this.lat = lat;
        this.lng = lng;
        this.descs = descs;
        this.phone = phone;
        this.status = status;
        this.specialities = specialities;
    }

    @Override
    public String toString() {
        return "Doctor{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", pwd=" + pwd + ", address=" + address + ", lat=" + lat + ", lng=" + lng + ", descs=" + descs + ", phone=" + phone + ", status=" + status + ", specialities=" + specialities + '}';
    }
    
public boolean ListTester(Speciality spec){
         for(Speciality myspec : this.getSpecialities()) { 
            if(myspec.getId() == spec.getId()) return false;
            }
         return true;   
    }
    
    

}
