/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.docfinder.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.*;




/**
 *
 * @author BADELH
 */
@Entity
@Table(name = "CLIENT", uniqueConstraints = {
@UniqueConstraint(columnNames = "ID"),
@UniqueConstraint(columnNames = "EMAIL"),
@UniqueConstraint(columnNames = "PHONE")

})
public class Client implements Serializable{

   @Id
   @GeneratedValue
    private long id;
    
    private String firstName;
    
    private String lastName;
   
    private String email;
    
    private String pwd;
    
    private String address;
    
    private String phone;
   @Enumerated(EnumType.ORDINAL) 
    private StatusAccount status;

   
    public long getId() {
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

    public String getPhone() {
        return phone;
    }

    public StatusAccount getStatus() {
        return status;
    }

    public void setId(long id) {
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

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setStatus(StatusAccount status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Client{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", pwd=" + pwd + ", address=" + address + ", phone=" + phone + ", status=" + status + '}';
    }
    
    
}
    
    
    
    

