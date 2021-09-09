package com.softserve.edu.hw7;

public class Triangle {

    private double firstEdge;
    private double secondEdge;
    private double thirdEdge;

    public Triangle() {
    }

    public Triangle(double firstEdge, double secondEdge, double thirdEdge) {
        this.firstEdge = firstEdge;
        this.secondEdge = secondEdge;
        this.thirdEdge = thirdEdge;
    }

    public double getFirstEdge() {
        return firstEdge;
    }

    public void setFirstEdge(double firstEdge) {
        this.firstEdge = firstEdge;
    }

    public double getSecondEdge() {
        return secondEdge;
    }

    public void setSecondEdge(double secondEdge) {
        this.secondEdge = secondEdge;
    }

    public double getThirdEdge() {
        return thirdEdge;
    }

    public void setThirdEdge(double thirdEdge) {
        this.thirdEdge = thirdEdge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.firstEdge, firstEdge) != 0) return false;
        if (Double.compare(triangle.secondEdge, secondEdge) != 0) return false;
        return Double.compare(triangle.thirdEdge, thirdEdge) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(firstEdge);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(secondEdge);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(thirdEdge);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "firstEdge=" + firstEdge +
                ", secondEdge=" + secondEdge +
                ", thirdEdge=" + thirdEdge +
                '}';
    }

    public double calculatePerimeter() {
        return firstEdge + secondEdge + thirdEdge;
    }
}
