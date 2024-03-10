
package com.eniso.tp2systemegestionetudiants;


public class Etudiant {
    private String Nom ;
    private String Prenom;
    private int Numins ;
    private String Email ;
   
    public Etudiant(String Nom,String Prenom,int Numins,String Email){
        this.Nom=Nom;
        this.Prenom=Prenom;
        this.Numins=Numins;
        this.Email=Email;
    }
    public String getNom(){
        return this.Nom;
    }
    public String getPrenom(){
        return this.Prenom;
    }
    public int getNumins(){
        return this.Numins;
    }
    public String getEmail(){
        return this.Email;
    }
    public void setEmail(String Email){
        this.Email=Email;
    }
    public void setNom(String Nom){
        this.Nom=Nom;
    }
    public void setPrenom(String Prenom){
        this.Prenom=Prenom;
    }
    public void setNumins(int Numins){
        this.Numins=Numins;
    }
    @Override
    public String toString(){
        return("[Nom = "+this.Nom+" ,Prenom = "+this.Prenom+" ,Num_ins = "+this.Numins+" ,Email = "+this.Email);
    }
   
       
}