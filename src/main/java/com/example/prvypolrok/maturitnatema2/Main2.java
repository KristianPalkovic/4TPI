package com.example.prvypolrok.maturitnatema2;

import java.util.Scanner;

public class Main2 {

    static void ParneNeparne(){
        Scanner scanner = new Scanner(System.in);
        int cislo = scanner.nextInt();
        if(cislo % 2 == 0){
            System.out.println("číslo je párne");
        }else{
            System.out.println("číslo je nepárne");
        }
    }

    public static void main(String[] args) {
        ParneNeparne();
    }
}