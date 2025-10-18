package com.example.tp.entities;

public class Bibliotheque {
    private final Document[] documents; // tableau de taille fixe (capacité)
    private int nbDocs;

    public Bibliotheque(int capacite) {
        if (capacite <= 0) capacite = 1;
        this.documents = new Document[capacite];
        this.nbDocs = 0;
    }

    /** Affiche tous les ouvrages. */
    public void afficherDocuments() {
        if (nbDocs == 0) {
            System.out.println("Bibliothèque vide.");
            return;
        }
        System.out.println("Bibliothèque (" + nbDocs + "/" + documents.length + "):");
        for (int i = 0; i < nbDocs; i++) {
            System.out.println("  - " + documents[i]);
        }
    }

    /** Ajoute si place dispo. */
    public boolean ajouter(Document doc) {
        if (doc == null || nbDocs == documents.length) return false;
        documents[nbDocs++] = doc;
        return true;
    }

    /** Supprime par identité numEnreg. */
    public boolean supprimer(Document doc) {
        if (doc == null || nbDocs == 0) return false;
        int idx = -1;
        for (int i = 0; i < nbDocs; i++) {
            if (documents[i].getNumEnreg() == doc.getNumEnreg()) { idx = i; break; }
        }
        if (idx == -1) return false;
        for (int i = idx + 1; i < nbDocs; i++) documents[i - 1] = documents[i];
        documents[--nbDocs] = null;
        return true;
    }

    /** Recherche par numéro d’enregistrement. */
    public Document document(int numEnrg) {
        for (int i = 0; i < nbDocs; i++) {
            if (documents[i].getNumEnreg() == numEnrg) return documents[i];
        }
        return null;
    }

    /** Liste les auteurs pour les documents qui en ont (Livres). */
    public void afficherAuteurs() {
        boolean found = false;
        for (int i = 0; i < nbDocs; i++) {
            if (documents[i] instanceof Livre) {
                Livre l = (Livre) documents[i];
                System.out.println("• " + l.getAuteur() + " — \"" + l.getTitre() + "\"");
                found = true;
            }
        }
        if (!found) System.out.println("Aucun auteur à afficher.");
    }
}
