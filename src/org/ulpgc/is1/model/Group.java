package org.ulpgc.is1.model;
import java.util.ArrayList;

public class Group {
    final public String name;
    ArrayList<Contact> contacts;
    public Group(String name) {
        this.name = name;
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact newcontact) {
        if (newcontact == null) {
            return;
        }
        else {
            this.contacts.add(newcontact);
        }
    }

    public void removeContact(int index) {
        if (index < 0 || index >= this.contacts.size()) {
            return;
        }
        this.contacts.remove(index);
    }

    public int contactCount() {
        return contacts.size();
    }
}