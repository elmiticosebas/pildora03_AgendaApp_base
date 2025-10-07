package org.ulpgc.is1.model;

import java.util.ArrayList;

public abstract class Contact {
    String telephone;
    String email;
    Address address;
    public Contact(String telephone, String email, String street, int number, int floor, String city) {
        this.telephone = telephone;
        this.email = email;
        this.address = new Address(street, number, floor, city);
    }

    public String getTelephone() {
        return this.telephone;
    }
    public void setTelephone(String telephone) {};
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {};
    public Address getAddress() {
        return this.address;
    }
}