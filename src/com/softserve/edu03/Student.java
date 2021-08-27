package com.softserve.edu03;

public class Student { // extends Object {
    private String name; // name = null;
    public static int count; // = 0;
    
    static {
        count = 0;
        System.out.println("static block done");
    }

    public Student(String name) {
        this();
        this.name = name;
        System.out.println("constructor Student(String name) done");
    }
    
    public Student() {
        name = "";
        count++;
        System.out.println("constructor Student() done");
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
    
//    public int getCount() {
//        return count;
//    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Student [name=" + name 
                + " count=" + count 
                + "]";
    }

}
