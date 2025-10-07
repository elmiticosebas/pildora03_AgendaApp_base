package org.ulpgc.is1.model;

import java.util.Objects;

public class Company extends Contact {
    String name;
    String description;

    public Company(String name, String description, String telephone, String email, String street, int number, int floor, String city) {
        super(telephone, email, street, number, floor, city);
        this.name = name;
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Company company)) return false;
        return Objects.equals(name, company.name) && Objects.equals(description, company.description);
    }

    public String getName() {
        return name;
    }
}
