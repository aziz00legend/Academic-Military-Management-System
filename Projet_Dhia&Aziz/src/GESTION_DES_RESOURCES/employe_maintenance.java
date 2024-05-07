/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GESTION_DES_RESOURCES;

/**
 *
 * @author boubs
 */
public class employe_maintenance extends Employe {
    private String specialite;
    private String note;
    public employe_maintenance(String a,int b,String c,String d,int e ,int f,int g,String h, String department, String grades, int numberOfHoursPerDay, int numberOfDaysPerMonth,float salaireH,String specialite, String note) {
        super(a,b,c,d,e,f,g,h, department,  grades,  numberOfHoursPerDay,  numberOfDaysPerMonth,salaireH) ;
        this.specialite = specialite;
        this.note = note;
    }
    public employe_maintenance() {
        
    }
    public void saisiremploye_maintenance()
    {
        
       super.saisirEmploye();
       System.out.println("donner le specialite : ");
       this.specialite = sc.nextLine();
       System.out.println("donner le niveauScolaire : ");
       this.note = sc.nextLine();
       
       
       
    }
    @Override
    public String toString() {
        String ch=super.toString();
        ch+="le specialite :"+this.specialite +"\n" ;
        ch+="le note :"+this.note +"\n" ;
        return(ch);
    }
   
    
    
    
    
    
    
    
    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
