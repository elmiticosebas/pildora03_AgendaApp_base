package org.ulpgc.is1.model;

public class Company extends Contact {
    String name;
    String description;

    public Company(String name, String description, String telephone, String email) {
        super(telephone, email);
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }
}
