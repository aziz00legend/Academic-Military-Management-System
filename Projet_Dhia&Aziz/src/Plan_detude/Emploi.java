/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Plan_detude;

/**
 *
 * @author boubs
 */
public class Emploi  {
    public String[][] schedule;
    public Emploi () {
        // Initialize the schedule with empty strings
        this.schedule = new String[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                this.schedule[i][j] = "******"; //matier
            }
        }
    }
    
    public String tostring () {
        // Initialize the schedule with empty strings
        String ch ="";
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                ch+=this.schedule[i][j] +"\t"; //matier
            }
            ch+="\n";
        }
        return(ch) ;
    }
    public boolean  desponible(int i , int j )
    {return("".equals(schedule[i][j]));}
    public String getMetiere(int i,int j) {
        return this.schedule[i][j];
    }

    public void ajouter_Matier(int i,int j, String matier) {
        if (this.desponible( i , j )) 
        {
        this.schedule[i][j] = matier;
    }
    }

    
    
    public void  Remove_Matier(int i , int j )
    {schedule[i][j]="";}
    
}


