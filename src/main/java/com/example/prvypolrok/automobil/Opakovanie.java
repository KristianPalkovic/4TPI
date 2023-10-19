package com.example.prvypolrok.automobil;
import java.util.*;

//main metoda sem
// vytvorte si novu triedu s nazvom automobil. Ten bude mat parametre znacka, jeNastartovane, aktualnaRychlost,
// vytvoríte gettre a settre metody nastartovatAuto, pohybAuto(int)

        /**/

public class Opakovanie {

    static List<Automobil> autolist= new ArrayList<>();
    public static void main(String[] args) {
        System.out.println(autolist);
        Automobil a1 = new Automobil("Skoda");
        Automobil a2 = new Automobil("VW");
        Automobil a3 = new Automobil("VW");


        List<Automobil>automobilList = Arrays.asList(a1,a2,a3);
        int sucetRychlosti = 0;
        for(Automobil automobil : automobilList){
            automobil.isJeNastartované();
            automobil.pohybAuto(30);
            sucetRychlosti += automobil.getAktuálnaRýchlosť();
        }

        double priemernaRychlost = sucetRychlosti / automobilList.size();
        System.out.println("priemerna rychlost aut v listu je " + priemernaRychlost);

        Set<Automobil> sets = new HashSet<>();
        sets.addAll(Arrays.asList(a1,a2,a3));
        System.out.println(sets.size());
    }
}