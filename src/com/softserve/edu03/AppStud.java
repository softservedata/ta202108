package com.softserve.edu03;

public class AppStud {

    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student("Ivan");
        //System.out.println("Count = " + st2.getCount());
        System.out.println("Count = " + Student.getCount());
        //
        System.out.println("st1 = " + st1.toString()); // st1.toString();
        System.out.println("st2 = " + st2); // st1.toString();
    }
}
