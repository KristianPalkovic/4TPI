package com.example.prvypolrok.les;
import java.util.ArrayList;
import java.util.List;

public class Les {

    public static void main(String[] args) {

       Strom a1 = new Strom(15, "ihlicnaty", "smrek");
       Strom a2 = new Strom(19,"listnaty", "dub");
       Strom a3 = new Strom(21,"listnaty", "javor");
       Strom a4 = new Strom(30,"ihlicnaty", "borovica");

       Krik k1 = new Krik();
       Krik k2 = new Krik();


       List<SpolocnyInterface> les = new ArrayList<>();
        les.add(a1);
        les.add(a2);
        les.add(a3);
        les.add(a4);
        les.add(k1);
        les.add(k2);

        for(SpolocnyInterface le : les){
            SpolocnyInterface zListu = le;
            if(zListu instanceof Strom){
                Strom stromZListu = (Strom) zListu;
                System.out.println(stromZListu.getTyp());
            }else{
                Krik krikZListu = (Krik) zListu;
                System.out.println("Vyska Kriku" + krikZListu.getVyskaKrika());
            }

        }
    }
}