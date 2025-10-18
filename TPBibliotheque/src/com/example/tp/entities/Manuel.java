package com.example.tp.entities;

public class Manuel extends Livre {
    private String niveau;

    public Manuel(String titre, String auteur, int nbrePages, String niveau) {
        super(titre, auteur, nbrePages);
        setNiveau(niveau);
    }

    public String getNiveau() { return niveau; }
    public void setNiveau(String niveau) {
        this.niveau = (niveau == null || niveau.trim().isEmpty()) ? "N/A" : niveau.trim();
    }

    @Override
    public String toString() {
        return "Manuel{numEnreg=" + getNumEnreg() + ", titre='" + getTitre()
             + "', auteur='" + getAuteur() + "', pages=" + getNbrePages()
             + ", niveau='" + niveau + "'}";
    }
}
