package com.demo.representation;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

public class User {
    private Integer id;
    private String firstName;
    private String lastName;
    private String dob;
    private String email;
    
    public User() {}
    
    public User(Integer id, String firstName, String lastName, String dob, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.dob = dob;
        this.email = email;
    }
    
    public String getFirstName() {return firstName;}
    
    public void setFirstName(String firstName) {this.firstName = firstName;}
    
    public String getLastName() {return lastName;}
    
    public void setLastName(String lastName) {this.lastName = lastName;}
    
    public Integer getId() {return id;}
    
    public void setId(Integer id) { this.id = id; }
    
    public String getDob() { return dob; }
    
    public void setDob(String dob) {this.dob = dob;}
    
    public String getEmail() {return email;}
    
    public void setEmail(String email) {this.email = email;}
    
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob='" + dob + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
