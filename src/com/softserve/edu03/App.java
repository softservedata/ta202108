package com.softserve.edu03;

import java.util.Scanner;

import com.softserve.edu.Example;

/**
 * <h1>Super Class</h1>
 * @author ta202108
 * @version 1.0
 */
public class App {

    /**
     * @param args - argument from <b>command line</b>.
     */
    public static void main(String[] args) {
        // /*-
        byte b = 1; // -128 ...+127
        b = (byte) (b + 1); // 1 int, 4 bytes
        long n = b;
        System.out.println("n = " + n);
        int i = (int) n;
        System.out.println("i = " + i);
        double d = 101.04;
        long lg = (long) d; // Explicit
        System.out.println("lg = " + lg);
        String s = "123";
        //double d1 = Double.parseDouble(s);
        double d1 = Double.valueOf(s);
        System.out.println("d1 = " + d1);
        //
        String s2 = "abc " + 2;
        System.out.println("s2 = " + s2);
        // */
        /*-
        Example ex3 = new Example(1);
        ex3.text = "abc"; // new String("abc");
        System.out.println("ex3 = " + ex3.getK() + "  text.length() = " + ex3.text.length());
        */
        /*-
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String text = br.readLine();
        System.out.print("age = ");
        int age = -1;
        try {
            age = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            //e.printStackTrace();
            System.out.println("ERROR");
        }
        //double t = Double.parseDouble(br.readLine());
        System.out.println("you are = " + (age + 1));
        try {
            br.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        */
        /*-
        Scanner sc = new Scanner(System.in);
        System.out.print("age = ");
        //String text = sc.nextLine();
        int age = sc.nextInt();
        System.out.println("you are = " + (age + 1));
        sc.close();
        */
    }

}
