package com.example.tp.entities;

public class Revue extends Document {
    private String mois;
    private int annee;

    public Revue(String titre, String mois, int annee) {
        super(titre);
        setMois(mois);
        setAnnee(annee);
    }

    public String getMois() { return mois; }
    public void setMois(String mois) {
        this.mois = (mois == null || mois.trim().isEmpty()) ? "N/A" : mois.trim();
    }

    public int getAnnee() { return annee; }
    public void setAnnee(int annee) { this.annee = annee; }

    @Override
    public String toString() {
        return "Revue{numEnreg=" + getNumEnreg() + ", titre='" + getTitre()
             + "', mois='" + mois + "', annee=" + annee + "}";
    }
}
