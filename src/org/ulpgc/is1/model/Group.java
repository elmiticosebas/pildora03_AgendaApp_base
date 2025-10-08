package org.ulpgc.is1.model;
import java.util.ArrayList;

public class Group {
    final public String name;
    ArrayList<Member> members;
    public Group(String name) {
        this.name = name;
        this.members = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        if (contact == null) {
            return;
        }
        else {
            Member newMember = new Member(contact, this);
            this.members.add(newMember);
        }
    }

    public void removeContact(int index) {
        if (index < 0 || index >= this.members.size()) {
            return;
        }
        this.members.remove(index);
    }

    public int contactCount() {
        return members.size();
    }

    public Member getMember(int index) {
        if (index < 0 || index >= this.members.size()) {
            return null;
        }
        return (this.members.get(index));
    }
}