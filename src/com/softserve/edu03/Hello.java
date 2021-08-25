package com.softserve.edu03;

public final class Hello {
    private static String message;
    
    static {
        message = "";
        System.out.println("class Hello: static block done");
    }

    private Hello() {
    }

    public static void setMessage(String message) {
        Hello.message = message;
    }

    public static void print() {
        System.out.println(message);
    }

}
