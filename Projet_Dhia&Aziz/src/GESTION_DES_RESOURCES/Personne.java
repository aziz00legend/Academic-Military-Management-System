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


public  abstract class Personne {
    protected String DateNaiss;
    protected int idpers ;
    protected String nom ;
    protected String prenom  ;
    protected int numtel ;
    protected int age ;
    protected int cin ;
    protected String sexe ; 
    
    
    Scanner sc = new Scanner(System.in);
    
    public Personne(String a,int b,String c,String d,int e ,int f,int g,String h) 
    {
    this.DateNaiss =a;
    this.idpers =b ;
    this.nom =c;
    this.prenom  =d;
    this.numtel =e;
    this.age =f;
    this.cin =g ;
    this.sexe =h ;
    
    }
    public Personne()
    {}
    protected abstract void saisirPersonne();
    
       
       
    
    @Override
    public String toString() {
        String ch="le idpers :"+this.idpers +"\n" ;
        ch+="le nom et le prenom :"+this.nom+" "+this.prenom +"\n" ;
        ch+="le numero telephone :"+this.numtel +"\n" ;
        ch+="le numero DateNaiss :"+this.DateNaiss +"\n" ;
        ch+="le sexe :"+this.sexe +"\n" ;
        ch+="le age :"+this.age +"\n" ;
        ch+="le cin :"+this.cin +"\n" ;
        
        return(ch);
    }
    public int getIdpers() {
        return idpers;
    }

    public void setIdpers(int id) {
        this.idpers = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String no) {
        this.nom = no;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String pr) {
        this.prenom = pr;
    }

    public int getNumtel() {
        return numtel;
    }

    public void setNumtel(int num) {
        this.numtel = num;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int A) {
        this.age = A;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int A) {
        this.cin = A;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String A) {
        this.sexe = A;
    }

    public String getDateNaiss() {
        return DateNaiss;
    }

    public void setDateNaiss(String A) {
        this.DateNaiss = A;
    }
    
}
