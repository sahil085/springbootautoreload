package com.iconnect.springbootautoreload.domain;

import java.util.Date;

public class Student {

    String userName;
    String description;
    String roundschant;
    Date date;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRoundschant() {
        return roundschant;
    }

    public void setRoundschant(String roundschant) {
        this.roundschant = roundschant;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Student{" +
                "userName='" + userName + '\'' +
                ", description='" + description + '\'' +
                ", roundschant='" + roundschant + '\'' +
                ", date=" + date +
                '}';
    }
}
