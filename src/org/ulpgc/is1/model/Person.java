package org.ulpgc.is1.model;

public class Person extends Contact {
    String firstName;
    String lastName;
    public Person(String firstName, String lastName, String address, String email, String telephone) {
        super(telephone, email, address);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }
}
