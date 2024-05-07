/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion_deStock;

/**
 *
 * @author PC_DHIA
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class Enpanne_materielle implements GESTION {
    protected int id;
    protected String nom;
    protected int priority;
    protected String lieu;
    protected int id_maintenace;
    protected String description;

    public Enpanne_materielle() {}

    public Enpanne_materielle(int id, String nom, int priority, String lieu, int id_maintenance, String description) {
        this.id = id;
        this.nom = nom;
        this.priority = priority;
        this.lieu = lieu;
        this.id_maintenace = id_maintenance;
        this.description = description;
    }

    public void saisir() throws Negative_number {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Donner l'ID : ");
                id = scanner.nextInt();
                if (id < 0) throw new Negative_number("L'ID ne doit pas être négatif.");

                scanner.nextLine(); 

                System.out.print("Donner le nom : ");
                nom = scanner.nextLine();

                System.out.print("Donner la priorité : ");
                priority = scanner.nextInt();
                if (priority < 0) throw new Negative_number("La priorité ne doit pas être négative.");

                System.out.print("Donner l'ID de l'employé responsable de la maintenance : ");
                id_maintenace = scanner.nextInt();
                if (id_maintenace < 0) throw new Negative_number("L'ID de maintenance ne doit pas être négatif.");
                System.out.print("Donner la description de l'état de la pièce : ");
                description = scanner.nextLine();
                scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erreur de saisie. Veuillez entrer une valeur valide.");
                scanner.nextLine(); 
            } 
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public int getId_maintenace() {
        return id_maintenace;
    }

    public void setId_maintenace(int id_maintenace) {
        this.id_maintenace = id_maintenace;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Enpanne_materielle{" +
                "id=" + id +
                ", nom=" + nom +
                ", priority=" + priority +
                ", lieu=" + lieu +
                ", id_maintenace=" + id_maintenace +
                ", description=" + description +
                '}';
    }
    @Override
    public void afichier(){
     System.out.println("Enpanne_materielle{" +
                "id=" + id +
                ", nom=" + nom +
                ", priority=" + priority +
                ", lieu=" + lieu +
                ", id_maintenace=" + id_maintenace +
                ", description=" + description +
                '}');
    }
}