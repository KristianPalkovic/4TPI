package com.example.prvypolrok.les;

public class Krik implements SpolocnyInterface{

    private int vyskaKrika;
    private String  nazov;


    public Krik(int vyskaKrika, String nazov) {
        this.vyskaKrika = vyskaKrika;
        this.nazov = nazov;
    }

    public Krik() {
    }

    public int getVyskaKrika() {
        return vyskaKrika;
    }

    public void setVyskaKrika(int vyskaKrika) {
        this.vyskaKrika = vyskaKrika;
    }

    public String getNazov() {
        return nazov;
    }

    @Override
    public String toString() {
        return "Krik{" +
                "vyskaKrika=" + vyskaKrika +
                ", nazov='" + nazov + '\'' +
                '}';
    }
}
