package com.example.oblivion.birthdayreminder.beans;

/**
 * Created by Oblivion on 6/6/16.
 */
public class BeanClass {

    private String name;

    private String bDate;
    private String phoneNumber;


    public String getbDate() {
        return bDate;
    }

    public void setbDate(String bDate) {
        this.bDate = bDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "BeanClass{" +
                "bDate='" + bDate + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
