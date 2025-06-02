package com.workintech.fswebs17d1.entity;

public class Animal {
    private String name;
    private Integer id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Animal(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
