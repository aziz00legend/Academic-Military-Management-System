/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Plan_detude;

import Gestion_deStock.Negative_number;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PC_DHIA
 */
public class Plan_Etude implements Gestion_deStock.GESTION {
protected ArrayList<Matiére> plan_etude_S;
 protected ArrayList <Matiére> plan_etude_P;
 public Plan_Etude(){
  this.plan_etude_P=new ArrayList<>();
  this.plan_etude_S=new ArrayList<>();
 }
 public void saisir(){
     Scanner scanner =new Scanner(System.in);
     System.out.println("REMPLISSAGE DE PLANS SECTION SANTE :");
     scanner.nextLine();
      String rep ;
     do{
       Matiére ma=new Matiére();
       while(true){
         try {
             ma.saisir();
             break;
         }
         catch(Negative_number e){
             System.out.print(e.getMessage());
             scanner.nextLine();}
     }
        boolean idExists;
        do {
            idExists = false;
            for (Matiére mat : plan_etude_S) {
                if (mat.getId() == ma.getId()) {
                    idExists = true;
                    break;
                }
            }

            if (idExists) {
                System.out.println("Désolé, cet ID existe déjà. Veuillez saisir un nouvel matiére.");
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

        plan_etude_S.add(ma);
        System.out.print("Voulez-vous continuer ? Tapez 'O' pour oui ou 'N' pour non : ");
        rep = scanner.nextLine();
    }
     while (rep.equalsIgnoreCase("O")||rep.equalsIgnoreCase("o") );
     System.out.println("REMPLISSAGE DE PLANS SECTION PREPA MPI :");
     scanner.nextLine();
         do{
       Matiére ma=new Matiére();
       while(true){
         try {
             ma.saisir();
             break;
         }
         catch(Negative_number e){
             System.out.print(e.getMessage());
             scanner.nextLine();}
     }
        boolean idExists;
        do {
            idExists = false;
            for (Matiére mat : plan_etude_P) {
                if (mat.getId() == ma.getId()) {
                    idExists = true;
                    break;
                }
            }

            if (idExists) {
                System.out.println("Désolé, cet ID existe déjà. Veuillez saisir un nouvel matiére.");
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
         plan_etude_P.add(ma);
        System.out.print("Voulez-vous continuer ? Tapez 'O' pour oui ou 'N' pour non : ");
        rep = scanner.nextLine();
    }
    while(rep.equalsIgnoreCase("O")||rep.equalsIgnoreCase("o") );
 
 }

    @Override
    public String toString() {
        return "Plan_Etude{" + "plan_etude_S=" + plan_etude_S + ", plan_etude_P=" + plan_etude_P + '}';
    }
    public ArrayList<Matiére> getPlan_etude_S() {
        return plan_etude_S;
    }

    public void setPlan_etude_S(ArrayList<Matiére> plan_etude_S) {
        this.plan_etude_S = plan_etude_S;
    }

    public ArrayList<Matiére> getPlan_etude_P() {
        return plan_etude_P;
    }

    public void setPlan_etude_P(ArrayList<Matiére> plan_etude_P) {
        this.plan_etude_P = plan_etude_P;
    }
    @Override
    public void afichier(){
     System.out.println("Plan d'étude pour le SANTE :");
    for (Matiére matiere : plan_etude_S) {
        matiere.afichier();
    }
    
    System.out.println("\nPlan d'étude pour le PREPA MPI :");
    for (Matiére matiere : plan_etude_P) {
       matiere.afichier();
    }
    
    }
 
    
}
