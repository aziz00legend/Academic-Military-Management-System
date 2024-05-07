/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GESTION_DES_RESOURCES;

import java.util.ArrayList;
import java.util.Date;



public class Etudiant extends Personne  {
    
    protected ArrayList<Quadruple<String, String, Date, Date>> punitions;
    protected String niveauScolaire;
    protected float moyenne;
    public Etudiant()
            {this.idpers = 0 ;
                this.punitions = new ArrayList<>();}
    public Etudiant(String a,int b,String c,String d,int e ,int f,int g,String h, float moyenne, String niveauScolaire) {
        super(a,b,c,d,e,f,g,h) ;
        this.moyenne = moyenne;
        this.niveauScolaire = niveauScolaire;
        this.punitions = new ArrayList<>();
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
    }}
    }
    public void saisirEtudiant()
    {
        
       this.saisirPersonne();
       System.out.println("donner le note Education physique : ");
       this.moyenne = sc.nextFloat();
       sc.nextLine();
       System.out.println("donner le note bac : ");
       this.moyenne += sc.nextFloat();
       sc.nextLine();
       System.out.println("donner le note morale : ");
       this.moyenne += sc.nextFloat();
       sc.nextLine();
       
       this.moyenne = this.moyenne /3;
       
       System.out.println("donner le niveauScolaire : ");
       this.niveauScolaire = sc.nextLine();
       
       
       
    }
    @Override
     public String toString() {
        String ch = super.toString();
        ch += "le moyenne :" + this.moyenne + "\n";
        ch += "le niveauScolaire :" + this.niveauScolaire + "\n";
        int k = 1;
        for (Quadruple i : this.punitions) {
            ch += "le " + k + "eme punitions sous forme date_deb \\ date_fin \\ lieu \\ type : " + "\n";
            ch += i.toString();
            k += 1;
        }
        return (ch);
    }

    public void affichepenutions() {
        String ch = "";
        int k = 1;
        for (Quadruple i : this.punitions) {
            ch += "le " + k + "eme punitions sous forme date_deb \\ date_fin \\ lieu \\ type : " + "\n";
            ch += i.toString() + "\n";
            k += 1;
        }
        System.out.println(ch + "\n");
    }

    public void addPenutions() {
        System.out.println("add punitions sous forme date_deb \\ date_fin \\ lieu \\ type :" + "\n");
        Quadruple<String, String, Date, Date> a = new Quadruple<>("a", "a", new Date(), new Date());
        a.saisir();
        this.punitions.add(a);
    }
    
    
    
    
    
    public float getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(float moyenne) {
        this.moyenne = moyenne;
    }

    

   
    protected String getNiveauScolaire() {
        return niveauScolaire;
    }

    protected void setNiveauScolaire(String niveauScolaire) {
        this.niveauScolaire = niveauScolaire;
    }
    
}
