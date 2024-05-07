/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Profile;

import Application.Academie_militaire;
import GESTION_DES_RESOURCES.Employe_encad_stg;
import GESTION_DES_RESOURCES.Etudiant;
import GESTION_DES_RESOURCES.Prof;
import GESTION_DES_RESOURCES.employe_maintenance;
import java.util.ArrayList;

/**
 *
 * @author boubs
 */
public class staticData {
    private static Etudiant etudiant;
    private static Prof Profp ;
    private static Employe_encad_stg encadreur ;
    private static employe_maintenance employe ;
    private static ArrayList<Integer>  adminMP;
    private static String nomGroupe ;
    private static Academie_militaire AM;
    private static int indexG ;
    private static int indexE ;

    public static int getIndexE() {
        return indexE;
    }

    public static void setIndexE(int indexE) {
        staticData.indexE = indexE;
    }

    public static int getIndexG() {
        return indexG;
    }

    public static void setIndexG(int indexG) {
        staticData.indexG = indexG;
    }

    public static String getNomGroupe() {
        return nomGroupe;
    }

    public static void setNomGroupe(String nomGroupe) {
        staticData.nomGroupe = nomGroupe;
    }

    public static Academie_militaire getAM() {
        return AM;
    }

    public static void setAM(Academie_militaire AM) {
        staticData.AM = AM;
    }
   

    public static ArrayList<Integer> getAdminMP() {
        return adminMP;
    }

    public static void setAdminMP(ArrayList<Integer> adminMP) {
        staticData.adminMP = adminMP;
    }
    
    
    
    
    
    
    public static Etudiant getEtudiant() {
        return etudiant;
    }    
    public static Prof getProf() {
        return Profp;
    }

    public static void setEtudiant(Etudiant etudiant) {
        staticData.etudiant = etudiant;
    }
    public static void setProf(Prof Profp) {
        staticData.Profp = Profp;
    }

    public static Employe_encad_stg getEncadreur() {
        return encadreur;
    }

    public static void setEncadreur(Employe_encad_stg encadreur) {
        staticData.encadreur = encadreur;
    }

    public static employe_maintenance getEmploye() {
        return employe;
    }

    public static void setEmploye(employe_maintenance employe) {
        staticData.employe = employe;
    }
    public static void  addAdmin ()
    {
        
        if (adminMP == null) {
            adminMP = new ArrayList<>();
        }
        adminMP.add(0000);
        adminMP.add(1234);
            
            }

    public static class getAM {

        public getAM() {
        }
    }
    
}

