package com.softserve.edu06f;

public abstract class Figure {
    protected int i = 567;

    protected Figure() {
        System.out.println("    Constructor Figure");
    }

    /* because this is an abstract method the body will be blank */
    public abstract double getArea();
}
