package com.example.prvypolrok.parkovisko;

import java.util.Objects;

public class Kolobezka implements ParkoviskoInterface{
    private String farba;
    private int pocetKoles;
    private boolean maZvonek;

    public Kolobezka(String farba, int pocetKoles, boolean maZvonek) {
        this.farba = farba;
        this.pocetKoles = pocetKoles;
        this.maZvonek = maZvonek;
    }

    public String getFarba() {
        return farba;
    }

    public void setFarba(String farba) {
        this.farba = farba;
    }

    public int getPocetKoles() {
        return pocetKoles;
    }

    public void setPocetKoles(int pocetKoles) {
        this.pocetKoles = pocetKoles;
    }

    public boolean isMaZvonek() {
        return maZvonek;
    }

    public void setMaZvonek(boolean maZvonek) {
        this.maZvonek = maZvonek;
    }

    @Override
    public String toString() {
        return "Kolobezka{" +
                "farba='" + farba + '\'' +
                ", pocetKoles=" + pocetKoles +
                ", maZvonek=" + maZvonek +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(farba, pocetKoles, maZvonek);
    }
}
