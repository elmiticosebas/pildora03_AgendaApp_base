package org.ulpgc.is1.model;

public class Company extends Contact {
    String name;
    String description;

    public Company(String name, String description, String telephone, String email, String street, int number, int floor, String city) {
        super(telephone, email, street, number, floor, city);
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }
}
