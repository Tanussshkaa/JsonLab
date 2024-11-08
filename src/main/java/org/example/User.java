package org.example;

import lombok.Getter;

import java.util.List;

@Getter
public class User {
    private String name;
    private String surname;
    private String phone;
    private Boolean subscribed;
    private List<Book> favoriteBooks;

    public User() {}

    public User(String name, String surname, String phone, Boolean subscribed) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.subscribed = subscribed;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + phone + " " + subscribed + " " + favoriteBooks;
    }
}

