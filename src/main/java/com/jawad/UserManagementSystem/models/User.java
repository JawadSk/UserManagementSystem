package com.jawad.UserManagementSystem.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class User {

    private int userId;
    @NotBlank
    private String userName;
    @Pattern(regexp = "[0-9]{2}-[0-9]{2}-[0-9]{4}", message = "Enter a valid date (DD-MM-YYYY)")
    private String dateOfBirth;
   @Email
    private String email;
    @Pattern(regexp = "[0-9]{12}", message = "Phone number must be contains 12 digits!")
    private String phoneNumber;
    @Pattern(regexp = "[0-9]{2}-[0-9]{2}-[0-9]{4}", message = "Enter a valid date (DD-MM-YYYY)")
    private String date;
    @Pattern(regexp = "[0-9]{2}:[0-9]{2}", message = "Enter a valid time (HH:MM)")
    private String time;

    public User() {
        super();
        // TODO Auto-generated constructor stub
    }

    public User(int userId, String userName, String dateOfBirth, String email, String phoneNumber, String date,
                String time) {
        super();
        this.userId = userId;
        this.userName = userName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.date = date;
        this.time = time;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
