package com.iconnect.springbootautoreload.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class UserIyf {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    private String stuName;

    private String mobileNumber;

    private String email;

    private String permanentAddress;

    private String currentAddress;

    private String institueName;

    private Date createdDate;

    private Date updatedDate;

    private String city;

    private String facilitatorName;


    private String nameOfFormFiller;

    private int age;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public String getInstitueName() {
        return institueName;
    }

    public void setInstitueName(String institueName) {
        this.institueName = institueName;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getFacilitatorName() {
        return facilitatorName;
    }

    public void setFacilitatorName(String facilitatorName) {
        this.facilitatorName = facilitatorName;
    }

    public String getNameOfFormFiller() {
        return nameOfFormFiller;
    }

    public void setNameOfFormFiller(String nameOfFormFiller) {
        this.nameOfFormFiller = nameOfFormFiller;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserIyf{" +
                "id=" + id +
                ", stuName='" + stuName + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", email='" + email + '\'' +
                ", permanentAddress='" + permanentAddress + '\'' +
                ", currentAddress='" + currentAddress + '\'' +
                ", institueName='" + institueName + '\'' +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                ", city='" + city + '\'' +
                ", facilitatorName='" + facilitatorName + '\'' +
                '}';
    }
}
