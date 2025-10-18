package com.example.tp.entities;

public class Roman extends Livre {
    private double prix;

    public Roman(String titre, String auteur, int nbrePages, double prix) {
        super(titre, auteur, nbrePages);
        setPrix(prix);
    }

    public double getPrix() { return prix; }
    public void setPrix(double prix) { this.prix = Math.max(0.0, prix); }

    @Override
    public String toString() {
        return "Roman{numEnreg=" + getNumEnreg() + ", titre='" + getTitre()
             + "', auteur='" + getAuteur() + "', pages=" + getNbrePages()
             + ", prix=" + String.format("%.2f", prix) + "}";
    }
}
