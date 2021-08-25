package com.softserve.edu;

public class Example {
    private int k = 123;
    public String text;

    public Example(int k1) {
        k = k1;
        text = "";
    }
    
    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public static void myPrint(Example ex) {
        System.out.println("k= " + ex.k);
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        //
        Example ex = new Example(222);
        System.out.println("k = " + ex.k);
        //myPrint(ex);
        //
        Example ex2 = new Example(3333);
        myPrint(ex2);
    }
}
