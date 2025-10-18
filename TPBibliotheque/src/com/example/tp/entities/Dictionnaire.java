package com.example.tp.entities;

public class Dictionnaire extends Document {
    private String langue;

    public Dictionnaire(String titre, String langue) {
        super(titre);
        setLangue(langue);
    }

    public String getLangue() { return langue; }
    public void setLangue(String langue) {
        this.langue = (langue == null || langue.trim().isEmpty()) ? "Inconnue" : langue.trim();
    }

    @Override
    public String toString() {
        return "Dictionnaire{numEnreg=" + getNumEnreg() + ", titre='" + getTitre()
             + "', langue='" + langue + "'}";
    }
}
