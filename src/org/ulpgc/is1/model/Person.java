package org.ulpgc.is1.model;

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
}
