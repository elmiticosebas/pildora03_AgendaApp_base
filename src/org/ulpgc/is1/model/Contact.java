package org.ulpgc.is1.model;

import java.util.ArrayList;

public abstract class Contact {
    String telephone;
    String email;
    Address address;
    ArrayList<Group> groups;
    public Contact(String telephone, String email, Address address) {
        this.telephone = telephone;
        this.email = email;
        this.address = address;
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