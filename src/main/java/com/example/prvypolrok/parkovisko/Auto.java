package com.example.prvypolrok.parkovisko;

import java.util.Objects;

public class Auto implements ParkoviskoInterface{
    private String znacka;
    private int vykon;
    private String farba;

    public Auto(String znacka, int vykon, String farba) {
        this.znacka = znacka;
        this.vykon = vykon;
        this.farba = farba;
    }

    public String getZnacka() {
        return znacka;
    }

    public void setZnacka(String znacka) {
        this.znacka = znacka;
    }

    public int getVykon() {
        return vykon;
    }

    public void setVykon(int vykon) {
        this.vykon = vykon;
    }

    public String getFarba() {
        return farba;
    }

    public void setFarba(String farba) {
        this.farba = farba;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "znacka='" + znacka + '\'' +
                ", vykon=" + vykon +
                ", Farba='" + farba + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(znacka, vykon, farba);
    }
}
