package org.ulpgc.is1.model;

import java.util.Objects;

public class Person extends Contact {
    String firstName;
    String lastName;
    public Person(String firstName, String lastName, String telephone, String email, String street, int number, int floor, String city) {
        super(telephone, email, street, number, floor, city);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person person)) return false;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
    }
}
