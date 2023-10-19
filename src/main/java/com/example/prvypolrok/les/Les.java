package com.example.prvypolrok.les;
import java.util.ArrayList;
import java.util.List;

public class Les {

    public static void main(String[] args) {

       Strom a1 = new Strom(15, "ihlicnaty", "smrek");
       Strom a2 = new Strom(15,"listnaty", "dub");
       Strom a3 = new Strom(15,"listnaty", "dub");
       Strom a4 = new Strom(15,"listnaty", "dub");

       Krik k1 = new Krik();
       Krik k2 = new Krik();


       List<SpolocnyInterface> les = new ArrayList<>();
        les.add(a1);
        les.add(a2);
        les.add(a2);
        les.add(a2);
        les.add(k1);

        System.out.println(les);
    }
}