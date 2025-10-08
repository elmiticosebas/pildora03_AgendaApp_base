package org.ulpgc.is1.model;

import java.time.LocalDateTime;

/**
 * Association Class linking a Contact to a Group,
 * recording the date the contact was added.
 */
public class Member {
    Contact contact;
    Group group;
    LocalDateTime date;
    public Member(Contact contact, Group group) {
        this.contact = contact;
        this.group = group;
        this.date = LocalDateTime.now();
    }

    public LocalDateTime getDate() {
        return(this.date);
    }
}