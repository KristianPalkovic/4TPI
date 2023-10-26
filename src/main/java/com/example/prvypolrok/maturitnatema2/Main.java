package com.example.prvypolrok.maturitnatema2;

public class Main {
    public static void main(String[] args) {
        int i = 9;
        boolean b = true;
        String s = "text";
        short h = 3;
        long l = 500000000L;
        char c = 's';
        byte y = 5;
        float f = 4;
        double d = 3.5;

        String out = "" +i+" "+b+" "+s+" "+h+" "+l+" "+ c+" "+y+" "+f+" "+d;
        System.out.println(i);
        System.out.println(b + " " + s);
        System.out.println("" + h + " " + l);
        System.out.println("" + c + " " + "" + y + " " + f + " " + d);
        System.out.println(out);
    //---------------------------------------------------------------------------------
        int x = 5;
        int u = 9;
        int j = 14;
        int p = 33;

        System.out.println((j + p) /3 * (u - x));


    }
}
