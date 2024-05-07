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

public class Etudiant_prepa extends Etudiant {
    private int rg_concours ;
    private static ArrayList<Integer> stages_pr = new ArrayList<>();
    
    public static void appendStagespr(int value) {
        stages_pr.add(value);
    }
    public Etudiant_prepa()
            {}
    public Etudiant_prepa(String a,int b,String c,String d,int e ,int f,int g,String h, float moyenne, String niveauScolaire,int rg_concours) {
        super(a,b,c,d,e,f,g,h,moyenne,niveauScolaire) ;
        
        this.rg_concours = rg_concours;
    }
    public void saisirEtudiant_prepa()
    {
        
       super.saisirEtudiant();
       System.out.println("donner le rg_concours : ");
       this.rg_concours = sc.nextInt();
       
       
       
    }
    @Override
    public String toString() {
        String ch=super.toString();
        
        ch+="\nle rg_concours :"+this.rg_concours +"\n" ;
        
        return(ch);
    }
    
    
    
    
    
    
    
    
    
    public int getrg_concours() {
        return rg_concours;
    }

    public void setrg_concours(int rg_concours) {
        this.rg_concours = rg_concours;
    }

    
}
