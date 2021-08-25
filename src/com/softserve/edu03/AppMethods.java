package com.softserve.edu03;

public class AppMethods { // extends Object {
    private String name;

    public AppMethods(String name) {
        this.name = name;
    }

    // Overload
    public void print() {
        System.out.println(name);
    }

    // Overload
    public void print(String message) {
        System.out.println(message + " " + name);
    }

    public static void main(String[] args) {
        /*-
        AppMethods app = new AppMethods("Ivan");
        //app.print();
        app.print("hello");
        */
        /*-
        Student st = new Student("Ivan");
        System.out.println("st = " + st.getName());
        st.setName("Petro");
        //st.setName("P");
        System.out.println("st = " + st.getName());
        */
        /*
        Hello h = new Hello();
        h.setMessage("Privet");
        h.print();
        */
        Hello.setMessage("Privet");
        Hello.print();
    }
}
