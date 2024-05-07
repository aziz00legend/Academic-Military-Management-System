/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Plan_detude;

/**
 *
 * @author PC_DHIA
 */
import GESTION_DES_RESOURCES.employe_maintenance;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
public class Groupe {
  protected ArrayList<Integer> etudiants ;
  protected String nom ;
  protected Integer num_salle ;
  protected String type ;
  
  
  public Groupe(){}
  public Groupe (String nom,Integer num_salle ,String type){
      this.nom=nom;
      this.num_salle=num_salle;
      this.type=type;
      etudiants=new ArrayList<>();
              }
  public void saisir(){
  Scanner scanner =new Scanner(System.in);
  this.nom=scanner.nextLine();
  for(int i=0 ; i<=24;i++)
  {
     
  
  }
    for(int i=0 ; i<=24;i++)
  {
     
  
  }
     for(int i=0 ; i<=24;i++)
  {
     
  
  }
     
  }

    public ArrayList<Integer> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(ArrayList<Integer> etudiants) {
        this.etudiants = etudiants;
    }

   

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public Integer getnum_salle() {
        return num_salle;
    }

    public void setnum_salle(Integer num_salle) {
        this.num_salle = num_salle;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    

    @Override
    public String toString() {
        String ch="";
        ch+="le nom :"+this.nom +"\n" ;
         ch+="le num_salle :"+this.num_salle +"\n" ;
         ch+="le type :"+this.type +"\n" ;
        ch+="le liste de Id de etudient  \n" ;
         
         for (int i : this.etudiants)
         {
              
              ch+="le  :"+i +"\t";
              
         
         }
         return (ch);
    }

 
  
  
  
    
    
}
