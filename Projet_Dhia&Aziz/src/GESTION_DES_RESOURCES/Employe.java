/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GESTION_DES_RESOURCES;

/**
 *
 * @author boubs
 */
import java.util.Scanner;
public class Employe extends Personne implements Salaire{
    protected String department;
    protected String grades;
    protected int numberOfHoursPerDay;
    protected int numberOfDaysPerMonth;
    protected float salaireH;
    
    public Employe ()
    {this.idpers=0;}
    
    public Employe(String a,int b,String c,String d,int e ,int f,int g,String h, String department, String grades, int numberOfHoursPerDay, int numberOfDaysPerMonth,float salaireH) {
        super(a,b,c,d,e,f,g,h) ;
        this.department = department;
        this.grades = grades;
        this.numberOfHoursPerDay = numberOfHoursPerDay;
        this.numberOfDaysPerMonth = numberOfDaysPerMonth;
        this.salaireH=salaireH;
    }
    @Override
    public void saisirPersonne() {
        
         if (this.idpers == 0)
         {System.out.println("donner le idpers : ");
       this.idpers = sc.nextInt();
       sc.nextLine();}
       System.out.println("donner le nom : ");
       this.nom = sc.nextLine();
       System.out.println("donner le prenom : ");
       this.prenom = sc.nextLine();
       
       while (true) {
    try {
        System.out.println("donner le numero telephone : ");
        this.numtel = sc.nextInt();
        sc.nextLine();
        
        if (this.numtel < 10000000 || this.numtel > 100000000) {
            throw new ExceptionHR("La valeur ne peut pas être comprise entre 10000000 et 99999999 !");
        } else {
            
            break;
        }
    } catch (ExceptionHR e) {
        System.out.println("Une erreur est survenue : " + e.getMessage());
    }
}
       
 
       
       System.out.println("donner Date de Naiss : ");
       this.DateNaiss = sc.nextLine();
       System.out.println("donner Age : ");
       this.age = sc.nextInt();
       sc.nextLine();
       
       
       
       
       while (true) {
    try {
        System.out.println("donner sexe M=male or F=female: ");
        this.sexe = sc.nextLine().toLowerCase(); 
        
        if (this.sexe.equals("m") || this.sexe.equals("f")) {
            
            break;
        } else {
            throw new ExceptionHR("Le sexe doit être 'M' ou 'F' !");
        }
    } catch (ExceptionHR e) {
        System.out.println("Une erreur est survenue : " + e.getMessage());
    }
}
       
       
       
       while (true) {
        try {
        System.out.println("donner cin : ");
        this.cin = sc.nextInt();
        sc.nextLine();
        
        if (this.cin < 10000000 || this.cin > 100000000) {
            throw new ExceptionHR("La valeur ne peut pas être comprise entre 10000000 et 99999999 !");
        } else {
            
            break;
        }
    } catch (ExceptionHR e) {
        System.out.println("Une erreur est survenue : " + e.getMessage());
    }}}
    public void saisirEmploye()
    {
        
       this.saisirPersonne();
       System.out.println("donner le department : ");
       this.department = sc.nextLine();
       System.out.println("donner le grades : ");
       this.grades = sc.nextLine();
       System.out.println("donner le numberOfHoursPerDay : ");
       this.numberOfHoursPerDay = sc.nextInt();
       System.out.println("donner numberOfDaysPerMonth : ");
       this.numberOfDaysPerMonth = sc.nextInt();
       System.out.println("donner salaireH : ");
       this.salaireH = sc.nextFloat();
       this.grades = sc.nextLine();
       
       
    }
    @Override
    public String toString() {
        String ch=super.toString();
        ch+="le department :"+this.department +"\n" ;
        ch+="le numero grades :"+this.grades +"\n" ;
        ch+="le numero numberOfHoursPerDay :"+this.numberOfHoursPerDay +"\n" ;
        ch+="le numberOfDaysPerMonth :"+this.numberOfDaysPerMonth +"\n" ;
        ch+="le salaireH :"+this.salaireH +"\n" ;
        return(ch);
    }
    @Override
    public float calculerSalaire()
    {return(salaireH*numberOfDaysPerMonth*numberOfHoursPerDay);}
    
    
    public String getDepartment() {
        return department;
    }

   
    public void setDepartment(String department) {
        this.department = department;
    }

    
    public String getGrades() {
        return grades;
    }

    
    public void setGrades(String grades) {
        this.grades = grades;
    }

    
    public int getNumberOfHoursPerDay() {
        return numberOfHoursPerDay;
    }

    
    public void setNumberOfHoursPerDay(int numberOfHoursPerDay) {
        this.numberOfHoursPerDay = numberOfHoursPerDay;
    }

    
    public int getNumberOfDaysPerMonth() {
        return numberOfDaysPerMonth;
    }

    
    public void setNumberOfDaysPerMonth(int numberOfDaysPerMonth) {
        this.numberOfDaysPerMonth = numberOfDaysPerMonth;
    }
    
    
}
