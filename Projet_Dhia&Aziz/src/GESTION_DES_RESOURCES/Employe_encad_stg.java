/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GESTION_DES_RESOURCES;

import java.util.ArrayList;

/**
 *
 * @author boubs
 */
public class Employe_encad_stg extends Employe {
            private ArrayList<Integer> stages;
            private Float prime;
            public Employe_encad_stg ()
            {this.stages = new ArrayList<>();}
    
        public Employe_encad_stg(String a,int b,String c,String d,int e ,int f,int g,String h, String department, String grades, int numberOfHoursPerDay, int numberOfDaysPerMonth,float Sal,float prime) {
        super(a,b,c,d,e,f,g,h, department,  grades,  numberOfHoursPerDay,  numberOfDaysPerMonth,Sal) ;
        this.stages = new ArrayList<>();
        this.prime=prime;
        
        }
        public void addstages(int a)
       {
        
        this.stages.add(a) ;
        
       }
        @Override
    public String toString() {
        String ch=super.toString();
        ch+="le prime :"+this.prime +"\n" ;
        ch+="les ID de stage :\n" ;
        int k=1;
        for (int i : this.stages)
        {ch+="le "+k+"eme id de stage :"+i +"\n" ;
        k+=1;}
        return(ch);
    }
     public void saisirEmploye_encad_stg()
    {
        
       super.saisirEmploye();
       System.out.println("donner le prime : ");
       this.prime = sc.nextFloat();
       
               
      
       
    }
    @Override
    public float calculerSalaire() {
        return super.calculerSalaire() + (  prime * this.stages.size());
    }
     
    public float getPrime() {
        return prime;
    }

    
    public void setPrime(float prime) {
        this.prime = prime;
    }       
}
