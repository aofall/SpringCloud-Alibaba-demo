package org.example.model.entity;

import lombok.Data;

@Data
public class User {

    private String name;

    private Integer age;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public User(Integer age) {
        this.age = age;
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
