package com.softserve.edu03;

public class Student { // extends Object {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        // if access
        return name;
    }

    public void setName(String name) {
        if (name.length() > 1) {
            this.name = name;
        }
    }

}
