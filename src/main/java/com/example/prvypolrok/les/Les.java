package com.example.prvypolrok.les;
import java.util.ArrayList;
import java.util.List;

public class Les {

    public static void main(String[] args) {

       Strom a1 = new Strom(15, "ihlicnaty", "smrek");
       Strom a2 = new Strom(15,"listnaty", "dub");


       List<Strom> stromList = new ArrayList<>();
       stromList.add(a1);
       stromList.add(a2);

        System.out.println(stromList);
    }
}