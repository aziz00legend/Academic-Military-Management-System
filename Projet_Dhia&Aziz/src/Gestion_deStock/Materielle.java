/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion_deStock;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author PC_DHIA
 */
public class Materielle implements GESTION {
   protected int id ;
   protected String nom ;
   protected String type ;
   protected int nbrepiece_desp ;
   protected int nbrepiece_Nece ;
   public Materielle (){} 
   public Materielle ( int id,String nom ,String type ,int nbrepiece ,int nbre_Nece){
        this.id=id ;
        this.nom=nom;
        this.type=type;
        this.nbrepiece_desp=nbrepiece;
        this.nbrepiece_Nece=nbre_Nece;
   }
  
 public void saisir() throws Negative_number {
    Scanner scanner = new Scanner(System.in);

    while (true) {
        try {
            System.out.print("Donner ID : ");
            id = scanner.nextInt();
            if (id < 0) throw new Negative_number("L'ID ne doit pas être négatif.");
             scanner.nextLine(); 
            System.out.print("Donner nom : ");
            nom = scanner.nextLine();
            System.out.print("Donner type : ");
            type = scanner.nextLine();

            System.out.print("Donner nombre de pièces : ");
            nbrepiece_desp = scanner.nextInt();
            if (nbrepiece_desp < 0) throw new Negative_number("Le nombre de pièces ne doit pas être négatif."); 
            System.out.print("Donner nombre de pièces nécessaires : ");
            nbrepiece_Nece = scanner.nextInt();
            if (nbrepiece_Nece < 0) throw new Negative_number("Le nombre de pièces nécessaires ne doit pas être négatif.");

            break;
        } catch (InputMismatchException e) {
            System.out.println("Saisie incorrecte. Veuillez saisir à nouveau.");
            scanner.nextLine(); 
        }
    }
}
 public void saisir2()throws Negative_number {
    Scanner scanner = new Scanner(System.in);

    while (true) {
        try {
            System.out.print("Donner ID : ");
            id = scanner.nextInt();
            if (id < 0) throw new Negative_number("L'ID ne doit pas être négatif.");
             scanner.nextLine(); 
            System.out.print("Donner nom : ");
            nom = scanner.nextLine();
            System.out.print("Donner type : ");
            type = scanner.nextLine();
            scanner.nextLine();
            System.out.print("Donner nombre de pièces nécessaires : ");
            nbrepiece_Nece = scanner.nextInt();
            if (nbrepiece_Nece < 0) throw new Negative_number("Le nombre de pièces nécessaires ne doit pas être négatif.");
            break;
        } catch (InputMismatchException e) {
            System.out.println("Saisie incorrecte. Veuillez saisir à nouveau.");
            scanner.nextLine(); 
        }
    }
 }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getType() {
        return type;
    }

    public int getNbrepiece_desp() {
        return nbrepiece_desp;
    }

    public int getNbrepiece_Nece() {
        return nbrepiece_Nece;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setNbrepiece_desp(int nbrepiece_desp) {
        this.nbrepiece_desp = nbrepiece_desp;
    }

    public void setNbrepiece_Nece(int nbrepiece_Nece) {
        this.nbrepiece_Nece = nbrepiece_Nece;
    }

    @Override
    public String toString() {
        return "Materielle{" + "id=" + id + ", nom=" + nom + ", type=" + type + ", nbrepiece_desp=" + nbrepiece_desp + ", nbrepiece_Nece=" + nbrepiece_Nece + '}';
    }
    @Override
    public void afichier(){
        System.out.println("Materielle{" + "id=" + id + ", nom=" + nom + ", type=" + type + ","
                + " nbrepiece_desp=" + nbrepiece_desp + ", nbrepiece_Nece=" + nbrepiece_Nece + '}');
    }
    
}
