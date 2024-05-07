/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GESTION_DES_RESOURCES;

/**
 *
 * @author boubs
 */
import java.util.ArrayList;
public class Etudiant_sante extends Etudiant{
    private static ArrayList<Integer> stages_sante = new ArrayList<>();
    
    public static void appendStagessante(int value) {
        stages_sante.add(value);
    }
    public Etudiant_sante()
            {}
    public Etudiant_sante(String a,int b,String c,String d,int e ,int f,int g,String h, float moyenne, String niveauScolaire) {
        super(a,b,c,d,e,f,g,h,moyenne,niveauScolaire) ;
        
        
    }
    public void saisirEtudiant_sante()
    {
        
       super.saisirEtudiant();
       
       
       
       
    }
    @Override
    public String toString() {
        String ch=super.toString();
        
        
        
        return(ch);
    }
    
}
