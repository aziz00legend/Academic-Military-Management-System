/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GESTION_DES_RESOURCES;
import java.util.Scanner;
/**
 *
 * @author boubs
 */
public class Prof extends Employe{
    private String matiere ;
    Scanner sc = new Scanner(System.in);
    
    public Prof(String a,int b,String c,String d,int e ,int f,int g,String h, String department, String grades, int numberOfHoursPerDay, int numberOfDaysPerMonth,float salaireH,String matiere) {
        super(a,b,c,d,e,f,g,h, department,  grades,  numberOfHoursPerDay,  numberOfDaysPerMonth,salaireH) ;
        this.matiere = matiere;
        
    }

    public Prof() {
        
    }

    /**
     *
     */
    public void saisiprof()
    {
        
       super.saisirEmploye();
       System.out.println("donner le matiere : ");
       this.matiere = sc.nextLine();
       
       
       
       
    }
    @Override
    public String toString() {
        String ch=super.toString();
        ch+="le matiere :"+this.matiere +"\n" ;
        return(ch);
    }
    
    public String getmatiere() {
        return matiere;
    }

    public void setmatiere(String nom) {
        this.matiere = nom;
    }
    
}
