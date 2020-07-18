package com.challenge.rest.models;

/**
 * Es la clase que representa los datos del feature y devuelve un String con formato Json.
 *
 * @author Carlos Garcia
 */
public class UserModel {
    private String first_name;
    private String last_name;
    private String gender;
    private String dob;
    private String email;
    private String phone;

    public UserModel(String first_name, String last_name, String gender, String dob, String email, String phone) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.dob = dob;
        this.email = email;
        this.phone = phone;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "{" +
                "\"first_name\":" + '\"' + first_name + '\"' +
                ", \"last_name\":" + '\"' + last_name + '\"' +
                ", \"gender\":" + '\"' + gender + '\"' +
                ", \"dob\":" + '\"' + dob + '\"' +
                ", \"email\":" + '\"' + email + '\"' +
                ", \"phone\":" + '\"' + phone + '\"' +
                '}';
    }
}
