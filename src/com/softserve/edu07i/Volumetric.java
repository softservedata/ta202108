package com.softserve.edu07i;

public interface Volumetric {
    double PI = 3.14; // static final

    static double getPI() {
        return Volumetric.PI;
    }

    double getVolume();
}
