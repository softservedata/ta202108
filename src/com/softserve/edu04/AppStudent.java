package com.softserve.edu04;

public class AppStudent {

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 25);
        Student st2 = new Student("Ivan", 25);
        //
        //if (st1 == st2) {
        if ( st1.equals(st2) ) {
            System.out.println("st1 == st2");
        } else {
            System.out.println("st1 != st2");
        }
        // Assert.assertEquals(st1, st2);
    }
}
