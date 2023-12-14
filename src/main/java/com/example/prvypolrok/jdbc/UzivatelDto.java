package com.example.prvypolrok.jdbc;

public class UzivatelDto {
    private int ID;
    private String meno;
    private String priezvisko;
    private String adresa;

    public UzivatelDto(int ID, String meno, String priezvisko, String adresa) {
        this.ID = ID;
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.adresa = adresa;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        return "UzivatelDto{" +
                "ID=" + ID +
                ", meno='" + meno + '\'' +
                ", priezvisko='" + priezvisko + '\'' +
                '}';
    }
}