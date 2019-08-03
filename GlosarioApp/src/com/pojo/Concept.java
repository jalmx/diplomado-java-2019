package com.pojo;

public class Concept {
    
    private String name;
    private String description;
    private int id;

    public Concept() {
    }

    public Concept(String name, String description, int id) {
        this.name = name;
        this.description = description;
        this.id = id;
    }

    public Concept(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public Concept setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Concept setDescription(String description) {
        this.description = description;
        return this;
    }

    public int getId() {
        return id;
    }

    public Concept setId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return "Concept{" + "name=" + name + ", description=" + description + ", id=" + id + '}';
    } 
    
}
