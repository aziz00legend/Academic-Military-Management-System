/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion_deStock;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author PC_DHIA
 */
public class Centre_Stock_maintenance implements GESTION {
    protected String nom;
    protected Set<Materielle> stocks;
    protected ArrayList<Enpanne_materielle> materielle_en_panne;
    public Centre_Stock_maintenance(){}
    public Centre_Stock_maintenance(String nom){
    this.nom=nom;
    this.materielle_en_panne=new ArrayList<>();
    this.stocks=new HashSet<>();
    }
    public void saisir() {
        this.materielle_en_panne=new ArrayList<>();
        this.stocks=new HashSet<>();
        Scanner scanner =new Scanner(System.in);
        System.out.print("saisir le stock en materielle ");
         scanner.nextLine();
         System.out.println("donner le nom svp : ");
        this.nom=scanner.nextLine();
        String rep ;

    do {
        Materielle ma = new Materielle();
        while (true) {
            try {
                ma.saisir();
                break;
            } catch (Negative_number e) {
                System.out.println("Saisie incorrecte. Veuillez saisir à nouveau.");
                scanner.nextLine();
            }
        }

        boolean idExists;
        do {
            idExists = false;
            for (Materielle mat : stocks) {
                if (mat.getId() == ma.getId()) {
                    idExists = true;
                    break;
                }
            }

            if (idExists) {
                System.out.println("Désolé, cet ID existe déjà. Veuillez saisir un nouvel matériel.");
                while (true) {
                    try {
                        ma.saisir(); 
                        break;
                    } catch (Negative_number e) {
                        System.out.println("Saisie incorrecte. Veuillez saisir à nouveau.");
                        scanner.nextLine();
                    }
                }
            }
        } while (idExists);

        stocks.add(ma);
        System.out.print("Voulez-vous continuer ? Tapez 'O' pour oui ou 'N' pour non : ");
        rep = scanner.nextLine();
    } while (rep.equalsIgnoreCase("O")||rep.equalsIgnoreCase("o"));
    //hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh
    System.out.print("saisir le stock en materielle en panne ");
    scanner.nextLine();
     do {
        Enpanne_materielle ma = new Enpanne_materielle();
        while (true) {
            try {
                ma.saisir();
                break;
            } catch (Negative_number e) {
                System.out.println("Saisie incorrecte. Veuillez saisir à nouveau.");
                scanner.nextLine();
            }
        }

        boolean idExists;
        do {
            idExists = false;
            for (Enpanne_materielle mat : materielle_en_panne) {
                if (mat.getId() == ma.getId()) {
                    idExists = true;
                    break;
                }
            }

            if (idExists) {
                System.out.println("Désolé, cet ID existe déjà. Veuillez saisir un nouvel matériel.");
                while (true) {
                    try {
                        ma.saisir(); 
                        break;
                    } catch (Negative_number e) {
                        System.out.println("Saisie incorrecte. Veuillez saisir à nouveau.");
                        scanner.nextLine();
                    }
                }
            }
        } while (idExists);

        materielle_en_panne.add(ma);
        System.out.print("Voulez-vous continuer ? Tapez 'O' pour oui ou 'N' pour non : ");
        rep = scanner.nextLine();
    } while (rep.equalsIgnoreCase("O")||rep.equalsIgnoreCase("o"));
    
}

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Set<Materielle> getStocks() {
        return stocks;
    }

    public void setStocks(Set<Materielle> stocks) {
        this.stocks = stocks;
    }

    public ArrayList<Enpanne_materielle> getMaterielle_en_panne() {
        return materielle_en_panne;
    }

    public void setMaterielle_en_panne(ArrayList<Enpanne_materielle> materielle_en_panne) {
        this.materielle_en_panne = materielle_en_panne;
    }

    @Override
    public String toString() {
        return "Centre_Stock_maintenance{" + "nom=" + nom + ", stocks=" + stocks + ", materielle_en_panne=" + materielle_en_panne + '}';
    }

  
    @Override
    public void afichier(){
    System.out.println("nom est :"+this.nom);
    System.out.println("Matériels en stock :");
    for (Materielle materielle : stocks) {
        materielle.afichier();// Appeler la méthode affiche de la classe Materielle
    }

    System.out.println("Matériels en panne :");
    for (Enpanne_materielle materielleEnPanne : materielle_en_panne) {
        materielleEnPanne.afichier(); // Appeler la méthode affiche de la classe Enpanne_materielle
    }
}

    
    
}
