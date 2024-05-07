/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Plan_detude;

/**
 *
 * @author PC_DHIA
 */
import Gestion_deStock.Negative_number;
import java.util.Objects;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Matiére implements Gestion_deStock.GESTION {
    protected String nom;
    protected int nbre_Heure;
    protected int coef;
    protected int id;
    public Matiére (){}
    public Matiére (String nom ,int nbre_Heure,int coef ,int id ){
    this.nom=nom;
    this.nbre_Heure=nbre_Heure;
    this.coef=coef;
    this.id=id;}
    
    
    public void saisir()throws Negative_number{
     Scanner scanner = new Scanner(System.in);
     while(true){
     try {       
     System.out.print("Donner ID du matiére : ");
     this.id=scanner.nextInt();
     scanner.nextLine();
     if(this.id<0){
      throw new Negative_number("Dsl id ne doit pas etre negative svp faite attention !!:") ;}
     System.out.print("Donner le nom du matiere");
     this.nom=scanner.nextLine();
     scanner.nextLine();
     System.out.print("Donner Coef du matiére ! : ");
     this.coef=scanner.nextInt();
     scanner.nextLine();
      if(this.coef<0){
      throw new Negative_number("Dsl coef ne doit pas etre negative svp faite attention !!:") ;}
      System.out.print("Donner nbrs de heures svp : ");
      this.nbre_Heure=scanner.nextInt();
       if(this.nbre_Heure<0){
      throw new Negative_number("Dsl nbrs heures  ne doit pas etre negative svp faite attention !!:") ;}
       break;
     
     }
     catch (InputMismatchException e) {
            System.out.println("Saisie incorrecte. Veuillez saisir à nouveau.");
            scanner.nextLine(); 
        }
     }   
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbre_Heure() {
        return nbre_Heure;
    }

    public void setNbre_Heure(int nbre_Heure) {
        this.nbre_Heure = nbre_Heure;
    }

    public int getCoef() {
        return coef;
    }

    public void setCoef(int coef) {
        this.coef = coef;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Mati\u00e9re{" + "nom=" + nom + ", nbre_Heure=" + nbre_Heure + ", coef=" + coef + ", id=" + id + '}';
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Matiére other = (Matiére) obj;
        if (this.nbre_Heure != other.nbre_Heure) {
            return false;
        }
        if (this.coef != other.coef) {
            return false;
        }
        if (this.id != other.id) {
            return false;
        }
        return Objects.equals(this.nom, other.nom);
    }
    @Override
    public void afichier(){
    System.out.println("la matiere est :"+this.nom+"de coefficient :"+this.coef+"de durée"+this.nbre_Heure);
    
    }

    
}
