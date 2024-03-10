package com.eniso.tp2systemegestionetudiants;
import java.util.ArrayList;

public class SystemeGestionEtudiants {
    private ArrayList<Etudiant> liste ;
   
    public SystemeGestionEtudiants(){
         this.liste = new ArrayList();
    }
    public void ajouterEtudiant(String Nom , String Prenom , int Numins, String Email){
        Etudiant e = new Etudiant(Nom,Prenom,Numins,Email);
        this.liste.add(e);
    }
    public void afficherEtudiant(){
        for (Etudiant e : this.liste){
            System.out.println(e.toString());
        }
    }
    public void modifierEmailEtudiant(int Numins , String nouvelemail){
        for (Etudiant e : this.liste){
            if(e.getNumins()==Numins){
                e.setEmail(nouvelemail);
                break;
            }
        }
    }
    public void supprimerEtudiant(int Numins){
        for(Etudiant e : this.liste){
            if(e.getNumins()==Numins){
                this.liste.remove(e);
                break;
            }
        }
    }
   
   
}