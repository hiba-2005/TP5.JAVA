package com.example.tp.entities;

public class Livre extends Document {
    private String auteur;
    private int nbrePages;

    public Livre(String titre, String auteur, int nbrePages) {
        super(titre);
        setAuteur(auteur);
        setNbrePages(nbrePages);
    }

    public String getAuteur() { return auteur; }
    public void setAuteur(String auteur) {
        this.auteur = (auteur == null || auteur.trim().isEmpty()) ? "Anonyme" : auteur.trim();
    }

    public int getNbrePages() { return nbrePages; }
    public void setNbrePages(int nbrePages) {
        this.nbrePages = Math.max(1, nbrePages);
    }

    @Override
    public String toString() {
        return "Livre{numEnreg=" + getNumEnreg() + ", titre='" + getTitre()
             + "', auteur='" + auteur + "', pages=" + nbrePages + "}";
    }
}
