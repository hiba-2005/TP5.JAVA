package test;

import java.util.Scanner;
import com.example.tp.entities.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1) Capacité lue au clavier
        System.out.print("Capacité de la bibliothèque (n): ");
        int n = safeInt(sc);
        Bibliotheque bib = new Bibliotheque(n);

        // 2) Initialisation avec 2 documents
        bib.ajouter(new Livre("Le Petit Prince", "Saint-Exupéry", 96));
        bib.ajouter(new Dictionnaire("Larousse Poche", "Français"));

        // 3) Menu
        int choix;
        do {
            System.out.println("\n=== MENU BIBLIOTHEQUE ===");
            System.out.println("1) Afficher tous les documents");
            System.out.println("2) Ajouter un document");
            System.out.println("3) Supprimer un document (par numEnreg)");
            System.out.println("4) Rechercher un document (par numEnreg)");
            System.out.println("5) Afficher la liste des auteurs");
            System.out.println("0) Quitter");
            System.out.print("Votre choix: ");
            choix = safeInt(sc);

            switch (choix) {
                case 1:
                    bib.afficherDocuments();
                    break;
                case 2:
                    ajouterDepuisMenu(sc, bib);
                    break;
                case 3:
                    System.out.print("Numéro d'enregistrement à supprimer: ");
                    int numS = safeInt(sc);
                    Document ds = bib.document(numS);
                    System.out.println(bib.supprimer(ds) ? "Supprimé." : "Introuvable ou plein/erreur.");
                    break;
                case 4:
                    System.out.print("Numéro d'enregistrement à rechercher: ");
                    int numR = safeInt(sc);
                    Document d = bib.document(numR);
                    System.out.println(d == null ? "Introuvable." : d);
                    break;
                case 5:
                    bib.afficherAuteurs();
                    break;
                case 0:
                    System.out.println("Au revoir.");
                    break;
                default:
                    System.out.println("Choix invalide.");
            }
        } while (choix != 0);

        sc.close();
    }

    // --- Helpers ---
    private static int safeInt(Scanner sc) {
        while (!sc.hasNextInt()) { sc.next(); System.out.print("Entrez un entier: "); }
        return sc.nextInt();
    }
    private static double safeDouble(Scanner sc) {
        while (!sc.hasNextDouble()) { sc.next(); System.out.print("Entrez un nombre: "); }
        return sc.nextDouble();
    }

    private static void ajouterDepuisMenu(Scanner sc, Bibliotheque bib) {
        System.out.println("Type ? 1= Livre, 2= Revue, 3= Dictionnaire, 4= Roman, 5= Manuel");
        int t = safeInt(sc); sc.nextLine(); // flush \n
        switch (t) {
            case 1: {
                System.out.print("Titre: "); String titre = sc.nextLine();
                System.out.print("Auteur: "); String auteur = sc.nextLine();
                System.out.print("Pages: "); int pages = safeInt(sc);
                System.out.println(bib.ajouter(new Livre(titre, auteur, pages)) ? "Ajouté." : "Échec (plein).");
                break;
            }
            case 2: {
                System.out.print("Titre: "); String titre = sc.nextLine();
                System.out.print("Mois: "); String mois = sc.nextLine();
                System.out.print("Année: "); int annee = safeInt(sc);
                System.out.println(bib.ajouter(new Revue(titre, mois, annee)) ? "Ajouté." : "Échec (plein).");
                break;
            }
            case 3: {
                System.out.print("Titre: "); String titre = sc.nextLine();
                System.out.print("Langue: "); String langue = sc.nextLine();
                System.out.println(bib.ajouter(new Dictionnaire(titre, langue)) ? "Ajouté." : "Échec (plein).");
                break;
            }
            case 4: {
                System.out.print("Titre: "); String titre = sc.nextLine();
                System.out.print("Auteur: "); String auteur = sc.nextLine();
                System.out.print("Pages: "); int pages = safeInt(sc);
                System.out.print("Prix: "); double prix = safeDouble(sc);
                System.out.println(bib.ajouter(new Roman(titre, auteur, pages, prix)) ? "Ajouté." : "Échec (plein).");
                break;
            }
            case 5: {
                System.out.print("Titre: "); String titre = sc.nextLine();
                System.out.print("Auteur: "); String auteur = sc.nextLine();
                System.out.print("Pages: "); int pages = safeInt(sc);
                System.out.print("Niveau: "); String niveau = sc.nextLine();
                System.out.println(bib.ajouter(new Manuel(titre, auteur, pages, niveau)) ? "Ajouté." : "Échec (plein).");
                break;
            }
            default:
                System.out.println("Type inconnu.");
        }
    }
}
