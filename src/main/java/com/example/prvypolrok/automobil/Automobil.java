package com.example.prvypolrok.automobil;

import java.util.Objects;

public class Automobil {
    private String značka;
    private boolean jeNastartované;
    private int aktuálnaRýchlosť;

    public Automobil(String VášAutomobil) {
    }

    public String getZnačka() {
        return značka;
    }

    public void setZnačka(String značka) {
        this.značka = značka;
    }

    public boolean isJeNastartované() {
        return jeNastartované;
    }

    public void setJeNastartované(boolean jeNastartované) {
        this.jeNastartované = jeNastartované;
    }

    public int getAktuálnaRýchlosť() {
        return aktuálnaRýchlosť;
    }

    public void setAktuálnaRýchlosť(int aktuálnaRýchlosť) {
        this.aktuálnaRýchlosť = aktuálnaRýchlosť;
    }

    public void naštartovaťAuto() {
        if (!jeNastartované) {
            jeNastartované = true;
            System.out.println("Automobil bol nastartovaný.");
        } else {
            System.out.println("Automobil je už nastartovaný.");
        }
    }

    public void pohybAuto(int rýchlosť) {
        if (jeNastartované) {
            if (rýchlosť >= 0) {
                aktuálnaRýchlosť = rýchlosť;
                System.out.println("Automobil sa pohol rýchlosťou " + rýchlosť + " km/h.");
            } else {
                System.out.println("Rýchlosť nemôže byť záporná.");
            }
        } else {
            System.out.println("Najprv musíte nastartovať automobil.");
        }
    }

    public static void main(String[] args) {
        Automobil auto = new Automobil("VášAutomobil");
        auto.naštartovaťAuto();
        auto.pohybAuto(50-10);


    }

    @Override
    public String toString() {
        return "Automobil{" +
                "značka='" + značka + '\'' +
                ", jeNastartované=" + jeNastartované +
                ", aktuálnaRýchlosť=" + aktuálnaRýchlosť +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Automobil automobil = (Automobil) o;
        return jeNastartované == automobil.jeNastartované && aktuálnaRýchlosť == automobil.aktuálnaRýchlosť && Objects.equals(značka, automobil.značka);
    }

    @Override
    public int hashCode() {
        return Objects.hash(značka, jeNastartované, aktuálnaRýchlosť);
    }
}