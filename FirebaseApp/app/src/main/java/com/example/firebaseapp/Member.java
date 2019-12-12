package com.example.firebaseapp;

public class Member {
    private String Name;
    private Integer age;

    public Member() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
