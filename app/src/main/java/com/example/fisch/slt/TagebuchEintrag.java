package com.example.fisch.slt;

import java.util.Date;

/**
 * Created by Fisch on 04.04.2017.
 */

public class TagebuchEintrag {

    private Date datum;
    private String sportart;    // z.B. Laufen oder Walken
    private double strecke;     //Strecke in km


    public TagebuchEintrag(Date datum, String sportart, double strecke) {
        this.datum = datum;
        this.sportart = sportart;
        this.strecke = strecke;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getSportart() {
        return sportart;
    }

    public void setSportart(String sportart) {
        this.sportart = sportart;
    }

    public double getStrecke() {
        return strecke;
    }

    public void setStrecke(double strecke) {
        this.strecke = strecke;
    }
}
