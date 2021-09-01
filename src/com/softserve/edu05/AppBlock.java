package com.softserve.edu05;

public class AppBlock {

    private static String name = "a";
    
    static {
        System.out.println("start init static bloc name = " + name);
        name = "b";
        System.out.println("done init static bloc name = " + name);
    }
    
    private String city = "c";
    
    {
        System.out.println("start init bloc city = " + city);
        city = "d";
        System.out.println("done init bloc city = " + city);
    }
    
//    public AppBlock(String city) {
//        System.out.println("start constructor city = " + this.city);
//        this.city = city;
//        System.out.println("done constructor city = " + this.city);
//    }

    {
        System.out.println("start init bloc#2 city = " + city);
    }
    
    public static String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public static void main(String[] args) {
//        AppBlock app1 = new AppBlock("f");
//        AppBlock app2 = new AppBlock("h");
        //
        AppBlock app1 = new AppBlock();
        AppBlock app2 = new AppBlock();
        System.out.println("name = " + getName());
        System.out.println("city1 = " + app1.getCity());
        System.out.println("city2 = " + app2.getCity());
    }
}
