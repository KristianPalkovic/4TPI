package com.example.prvypolrok.parkovisko;
import java.util.ArrayList;
import java.util.List;

public class Parkovisko {
    public static void main(String[] args) {

        Auto a1 = new Auto("Škoda", 150, "cervena");
        Auto a2 = new Auto("VW", 100, "biela");
        Auto a3 = new Auto("BMW", 200, "modra");
        Auto a4 = new Auto("Mercedes", 210, "seda");

        Kolobezka k1 = new Kolobezka("cervena", 2, true);
        Kolobezka k2 = new Kolobezka("cierna", 3, false);


        List<ParkoviskoInterface> parkovisko = new ArrayList<>();
        parkovisko.add(a1);
        parkovisko.add(a2);
        parkovisko.add(a3);
        parkovisko.add(a4);
        parkovisko.add(k1);
        parkovisko.add(k2);

        for(ParkoviskoInterface le : parkovisko){
            ParkoviskoInterface zListu = le;
            if(zListu instanceof Auto){
                Auto autoZListu = (Auto) zListu;
                System.out.println(autoZListu.getFarba());
            }else{
                Kolobezka kolobezkaZListu = (Kolobezka) zListu;
                System.out.println("Farba Kolobezky " + kolobezkaZListu.getFarba());
            }
        }
    }
}