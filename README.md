# 🧩 TP5.JAVA — Exercices d’Héritage et de Polymorphisme en Java

Ce projet regroupe plusieurs exercices pratiques sur la **programmation orientée objet (POO)** en Java.  
Chaque dossier correspond à un **exercice de TP (Travail Pratique)** indépendant, illustrant différents concepts fondamentaux tels que l’héritage, le polymorphisme, l’encapsulation et la composition.

---

## 📂 Structure du projet
```bash
TP5.JAVA/
│
├── TPInheritance/ → Héritage et polymorphisme avec les comptes bancaires
├── TP5Exercice2/ → Gestion d’un zoo (héritage + tableau dynamique)
├── TPParcVehicules/ → Parc de véhicules (héritage multi-niveaux + composition)
└── TPBibliotheque/ → Gestion d’une bibliothèque (héritage + encapsulation)
```

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

### ▶️ Exemple d’exécution :
```bash
Compte #1 — solde = 1000.0
Compte #1 : dépôt de 200.0
Compte #1 : retrait impossible (solde insuffisant)
CompteEpargne #2 — solde = 500.0, taux = 3.0%
CompteCourant #3 — solde = 200.0, découvert autorisé = 300.0
```

---

### 🐾 2. TP5Exercice2 — Gestion d’un Zoo

Objectif : pratiquer l’héritage et le polymorphisme avec des animaux.

**Classes principales :**
- `Animal` (classe de base)
- `Mammifere`, `Oiseau`, `Reptile` (sous-classes)
- `Zoo` (tableau dynamique d’animaux)
- `Main` (programme de test)
- 
### ⚙️ Fonctionnalités :
- Ajout dynamique d’animaux dans un tableau  
- Affichage détaillé (`toString()`)  
- Méthodes spécifiques (`voler()`, `allaiter()`, `seChauffer()`)

  ### ▶️ Exemple d’exécution :
  
```bash
Le zoo contient 6 animaux :

Lion (Mammifère)

Aigle (Oiseau)

Crocodile (Reptile)

Girafe (Mammifère)

Perroquet (Oiseau)

Serpent (Reptile)
Éléphant allaite ses petits.
Autruche s'envole avec une envergure de 1.8 m.
```


---

### 🚗 3. TPParcVehicules — Gestion d’une Flotte de Véhicules


### 🎯 Objectif :
Illustrer un héritage multi-niveaux et la composition d’objets (`Moteur` dans `Motorise`).

### 📚 Classes principales :
- `Vehicule`, `Motorise`
- `Voiture`, `Camion`, `Moto`, `VoitureElectrique`
- `Moteur`
- `Flotte` (tableau dynamique)
- `Main`

### ⚙️ Fonctionnalités :
- Démarrage, roulage et ravitaillement  
- Gestion du carburant ou de la batterie  
- Calcul de la distance totale parcourue par la flotte

### ▶️ Exemple d’exécution :
``` bash
Flotte (4 véhicules) :

Clio (Essence 75ch)

Volvo FH (Diesel 400ch)

Harley (Essence 90ch)

Tesla Model 3 (Élec 300ch)

Clio roule 100 km, reste 40.0 unités
Tesla roule 300 km, reste 55.0 kWh
Distance totale parcourue : 880 km
```

---

### 📚 4. TPBibliotheque — Gestion d’une Bibliothèque

### 🎯 Objectif :
Combiner héritage, encapsulation et gestion d’un tableau de documents.

### 📚 Classes principales :
- `Document` (classe mère)
- `Livre`, `Roman`, `Manuel`, `Revue`, `Dictionnaire`
- `Bibliotheque` (tableau de `Document`)
- `Main` (menu console interactif)

### ⚙️ Fonctionnalités :
- Ajouter / supprimer / rechercher un document  
- Afficher tous les documents  
- Lister les auteurs des ouvrages  
- Utiliser un **numéro d’enregistrement auto-incrémenté**

### ▶️ Exemple d’exécution :
```bash
Capacité de la bibliothèque (n): 5
Bibliothèque (2/5):

Livre{numEnreg=1, titre='Le Petit Prince', auteur='Saint-Exupéry', pages=96}

Dictionnaire{numEnreg=2, titre='Larousse Poche', langue='Français'}

• Saint-Exupéry — "Le Petit Prince"
• Camus — "L'Étranger"
```

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
```

✨ Auteur

👩‍💻 hiba-2005
Travaux pratiques réalisés sous Eclipse IDE
Langage : Java 100%
Objectifs : Héritage, Polymorphisme, Encapsulation, Composition et Gestion d’objets.
