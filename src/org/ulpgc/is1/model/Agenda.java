package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Agenda {
    ArrayList<Contact> contacts;
    ArrayList<Group> groups;
    ArrayList<Member> members;
    public Agenda() {
        this.contacts = new ArrayList<>();
        this.groups = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addPerson(String firstName, String lastName, String telephone, String email, String street, int number, int floor, String city) {
        Person newperson = new Person(firstName, lastName, telephone, email, street, number, floor, city);
        for (Contact contact : contacts) {
            if(contact.equals(newperson)) return;
        }
        this.contacts.add(newperson);
    }

    public void addCompany(String name, String description, String telephone, String email, String street, int number, int floor, String city) {
        Company newcompany = new Company(name, description, telephone, email, street, number, floor, city);
        for (Contact contact : contacts) {
            if (contact.equals(newcompany)) return;
        }
        this.contacts.add(newcompany);
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

    public void addMember2Group(Contact contact, Group group) {
        Member newMember = new Member(contact, group);
        this.members.add(newMember);
    }
}