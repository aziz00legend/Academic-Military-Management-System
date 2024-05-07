/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Plan_detude;

/**
 *
 * @author PC_DHIA
 */
import Gestion_deStock.Materielle;
import Gestion_deStock.Centre_Stock_maintenance;
import Gestion_deStock.Negative_number;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javax.xml.transform.OutputKeys;

public class STAGE implements Gestion_deStock.GESTION {
    protected int id_stage;
    protected String nom;
    protected int id_encadreur;
    protected String type;
    protected String objectif;
    protected String lieu;
    protected Date date_deb;
    protected Date date_fin;
    protected Map<Integer, Integer> tab_materielles;

    public STAGE(int id_stage, String nom, int id_encadreur, String type, String objectif, String lieu, Date date_deb, Date date_fin) {
        this.id_stage = id_stage;
        this.nom = nom;
        this.id_encadreur = id_encadreur;
        this.type = type;
        this.objectif = objectif;
        this.lieu = lieu;
       this.date_deb = date_deb;
        this.date_fin = date_fin; 
        this.tab_materielles = new HashMap<>();
    }
    public STAGE(){
        this.tab_materielles = new HashMap<>();
        this.id_stage=0;
        this.id_encadreur=0;
        this.lieu="";
        this.type="";
        this.objectif="";
    }
   public STAGE(int id_stage, String nom, String type, String lieu, Date date_deb, Date date_fin){
    this.id_stage = id_stage;
        this.nom = nom;
        this.type = type;
        this.lieu = lieu;
       this.date_deb = date_deb;
        this.date_fin = date_fin; 
         this.tab_materielles = new HashMap<>();
   }

    @Override
    public String toString() {
        for (Map.Entry<Integer, Integer> entry : tab_materielles.entrySet()) {
            int cle = entry.getKey();
            int valeur = entry.getValue();
            System.out.println("Clé : " + cle + ", Valeur : " + valeur);
        }
        return "le stage est de nature " + type + " sous le nom de " + nom + " situé à " + lieu + " tel que se début dans " + date_deb;
    }
    @Override
    public void afichier(){
        for (Map.Entry<Integer, Integer> entry : tab_materielles.entrySet()) {
            int cle = entry.getKey();
            int valeur = entry.getValue();
            System.out.println("Clé : " + cle + ", Valeur : " + valeur);
        }
    }
    public Integer donner_quantite(int id) {
        return tab_materielles.get(id);
    }
    public int getId_stage() {
        return id_stage;
    }

    public void setId_stage(int id_stage) {
        this.id_stage = id_stage;
    }

   
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    
    public int getId_encadreur() {
        return id_encadreur;
    }

    public void setId_encadreur(int id_encadreur) {
        this.id_encadreur = id_encadreur;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getObjectif() {
        return objectif;
    }

    public void setObjectif(String objectif) {
        this.objectif = objectif;
    }
    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public Date getDate_deb() {
        return date_deb;
    }

    public void setDate_deb(Date date_deb) {
        this.date_deb = date_deb;
    }
    public Date getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }
    public Map<Integer, Integer> getTab_materielles() {
        return tab_materielles;
    }

    public void setTab_materielles(Map<Integer, Integer> tab_materielles) {
        this.tab_materielles = tab_materielles;
    }
}

