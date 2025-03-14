package com.example.SimpleSurvey.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "survey")
public class Survey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("full_name") // Maps JSON "full_name" to Java "fullName"
    @Column(name = "full_name", nullable = false, length = 255)
    private String fullName;

    @JsonProperty("phone_number")
    @Column(name = "phone_number", nullable = false)
    private Long phoneNumber;

    @Column(name = "email", nullable = false, length = 255)
    private String email;

    @Column(name = "address", nullable = false, length = 255)
    private String address;

    @JsonProperty("current_company")
    @Column(name = "current_company", nullable = false, length = 255)
    private String currentCompany;

    @JsonProperty("years_of_experience")
    @Column(name = "years_of_experience", nullable = false)
    private Integer yearsOfExperience;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCurrentCompany() {
        return currentCompany;
    }

    public void setCurrentCompany(String currentCompany) {
        this.currentCompany = currentCompany;
    }

    public Integer getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(Integer yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}
