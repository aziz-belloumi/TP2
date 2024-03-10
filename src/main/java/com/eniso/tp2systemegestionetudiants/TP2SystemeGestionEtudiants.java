package com.eniso.tp2systemegestionetudiants;

public class TP2SystemeGestionEtudiants {

    public static void main(String[] args) {
        SystemeGestionEtudiants sys1 = new SystemeGestionEtudiants();
        System.out.println("apres l'ajout :");
        sys1.ajouterEtudiant("aziz","bel",123456,"belloumiaziz1@gamil.com");
        sys1.ajouterEtudiant("ali","ffff", 14529,"cjbhckbezckea");
        sys1.afficherEtudiant();
        System.out.println("apres la modification :");
       
        sys1.modifierEmailEtudiant(14529,"ali@gamil.com");
        sys1.afficherEtudiant();
        System.out.println("apres la supression :");
        sys1.supprimerEtudiant(14529);
        sys1.afficherEtudiant();
       
       
       
    }
}