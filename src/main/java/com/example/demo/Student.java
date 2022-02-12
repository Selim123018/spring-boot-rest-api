package com.example.demo;

public class Student {
    private Integer Id;
    private String title;
    private  String name;
    private String email;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Student(Integer id, String title, String name, String email) {
        Id = id;
        this.title = title;
        this.name = name;
        this.email = email;
    }
}
