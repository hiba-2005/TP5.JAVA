# 🧩 TP5.JAVA — Exercices d’Héritage et de Polymorphisme en Java

Ce projet regroupe plusieurs exercices pratiques sur la **programmation orientée objet (POO)** en Java.  
Chaque dossier correspond à un **exercice de TP (Travail Pratique)** indépendant, illustrant différents concepts fondamentaux tels que l’héritage, le polymorphisme, l’encapsulation et la composition.

---

## 📂 Structure du projet
TP5.JAVA/
│
├── TPInheritance/ → Héritage et polymorphisme avec les comptes bancaires
├── TP5Exercice2/ → Gestion d’un zoo (héritage + tableau dynamique)
├── TPParcVehicules/ → Parc de véhicules (héritage multi-niveaux + composition)
└── TPBibliotheque/ → Gestion d’une bibliothèque (héritage + encapsulation)


---

## ⚙️ Environnement utilisé

- **IDE :** Eclipse IDE for Java Developers  
- **Langage :** Java SE 8 ou supérieur  
- **Version JDK :** `jdk-1.8` ou plus récent  

---

## 🧠 Détails des exercices

### 🏦 1. TPInheritance — Hiérarchie de Comptes Bancaires
Objectif : modéliser une hiérarchie simple de comptes (héritage concret).  
**Classes principales :**
- `Compte`
- `CompteEpargne`
- `CompteCourant`

Fonctionnalités : dépôts, retraits, découvert autorisé, application d’intérêts, polymorphisme.

---

### 🐾 2. TP5Exercice2 — Gestion d’un Zoo
Objectif : pratiquer l’héritage et le polymorphisme avec des animaux.  
**Classes principales :**
- `Animal`, `Mammifere`, `Oiseau`, `Reptile`
- `Zoo` (tableau dynamique d’`Animal`)

Permet d’ajouter, afficher et manipuler plusieurs types d’animaux dans un zoo.

---

### 🚗 3. TPParcVehicules — Gestion d’une Flotte de Véhicules
Objectif : mettre en œuvre l’héritage multi-niveaux et la composition (classe `Moteur`).  
**Classes :**
- `Vehicule`, `Motorise`, `Voiture`, `Camion`, `Moto`, `VoitureElectrique`, `Flotte`

Simulation de trajets, consommation, recharge, distance totale parcourue.

---

### 📚 4. TPBibliotheque — Gestion d’une Bibliothèque
Objectif : combiner héritage, encapsulation et tableaux d’objets.  
**Classes :**
- `Document`, `Livre`, `Roman`, `Manuel`, `Revue`, `Dictionnaire`, `Bibliotheque`

Fonctionnalités :
- Ajouter / supprimer / rechercher un document
- Afficher les auteurs
- Menu interactif console

---

## 🚀 Exécution

### ▶️ Depuis Eclipse
1. Clique droit sur `Main.java` → **Run As → Java Application**
2. Choisis le TP voulu (ex: `TPBibliotheque/src/test/Main.java`)
3. Observe le résultat dans la console

### 💻 Depuis un terminal
```bash
cd TPBibliotheque/src
javac com/example/tp/entities/*.java com/example/tp/test/Main.java
java com.example.tp.test.Main
