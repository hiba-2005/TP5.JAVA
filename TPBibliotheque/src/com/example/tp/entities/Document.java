package com.example.tp.entities;

public class Document {
    private static int compteur = 0;

    private final int numEnreg; // auto-incrément
    private String titre;

    public Document(String titre) {
        this.numEnreg = ++compteur;
        setTitre(titre);
    }

    public int getNumEnreg() { return numEnreg; }
    public String getTitre() { return titre; }
    public void setTitre(String titre) {
        this.titre = (titre == null || titre.trim().isEmpty()) ? "Sans titre" : titre.trim();
    }

    @Override
    public String toString() {
        return "Document{numEnreg=" + numEnreg + ", titre='" + titre + "'}";
    }
}

