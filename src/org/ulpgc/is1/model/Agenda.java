package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Agenda {
    ArrayList<Contact> contacts;
    ArrayList<Group> groups;
    public Agenda() {
        this.contacts = new ArrayList<>();
        this.groups = new ArrayList<>();
    }

    public void addPerson(String firstName, String lastName, String telephone, String email, String street, int number, int floor, String city) {
        Person newperson = new Person(firstName, lastName, telephone, email, street, number, floor, city);
        this.contacts.add(newperson);
    }

    public void addCompany(String name, String description, String telephone, String email, String street, int number, int floor, String city) {
        Company company = new Company(name, description, telephone, email, street, number, floor, city);
        this.contacts.add(company);
    }

    public void addGroup(String name) {
        Group group = new Group(name);
        this.groups.add(group);
    }

    public ArrayList<Contact> getContactList() {
        return contacts;
    }

    public ArrayList<Group> getGroupList() {
        return groups;
    }

    public int contactCount() {
        return contacts.size();
    }
}