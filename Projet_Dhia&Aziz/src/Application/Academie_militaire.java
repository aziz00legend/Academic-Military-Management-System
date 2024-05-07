/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;

import GESTION_DES_RESOURCES.*;
import Gestion_deStock.Centre_Stock_maintenance;
import Plan_detude.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import java.util.Scanner;
import GESTION_DES_RESOURCES.Etudiant;
import GESTION_DES_RESOURCES.Prof;
import GESTION_DES_RESOURCES.Employe_encad_stg;
import GESTION_DES_RESOURCES.employe_maintenance;
import Gestion_deStock.Materielle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


/**
 *
 * @author boubs
 */
public class Academie_militaire {
    String nom;
    Centre_Stock_maintenance CSM;
    HashMap<Integer, employe_maintenance> employesM;
    HashMap<Integer, Employe_encad_stg> employesS;

    public ArrayList<Groupe1> getGroupes() {
        return groupes;
    }

    public void setGroupes(ArrayList<Groupe1> groupes) {
        this.groupes = groupes;
    }
    HashMap<Integer,Prof> profs;
    
    HashMap<Integer, Etudiant> etudiants;
    Plan_Etude plan_E;
    ArrayList <STAGE> stages;
    ArrayList <Materielle> Materielles;
    HashMap<String, Emploi > emploi_Groupe;
    HashMap<Integer, Emploi> emploi_Prof;
    ArrayList<Groupe1> groupes;
    Scanner sc = new Scanner(System.in);
    
    public Academie_militaire(String nom) {
        this.nom = nom;
        CSM = new Centre_Stock_maintenance();
        employesS = new HashMap<>();
         employesM = new HashMap<>();
        profs = new HashMap<>();
       this.groupes = new ArrayList<>();
        etudiants = new HashMap<>();
        plan_E = new Plan_Etude();
        emploi_Groupe = new HashMap<>();
        emploi_Prof = new HashMap<>();
        stages = new ArrayList<>();
        Materielles = new ArrayList<>();
    }
    public Emploi rechercherEmp(int id )
    {
      
       
        List<Groupe1> filteredGroupes = groupes.stream().filter(groupe1 -> groupe1.etudients().contains(id)).collect(Collectors.toList());
         return(filteredGroupes.get(0).emp());
    }
    public Academie_militaire(String nom,Centre_Stock_maintenance CSM,HashMap<Integer, employe_maintenance> employesM ,HashMap<Integer, Employe_encad_stg> employes,  HashMap<Integer,Prof> profs,HashMap<String, Groupe> groupes, HashMap<Integer, Etudiant> etudiants,
    Plan_Etude plan_E,HashMap<String, Emploi > emploi_Groupe,
    HashMap<Integer, Emploi> emploi_Prof) {
        
        this.CSM = new Centre_Stock_maintenance();
        this.employesS = new HashMap<>();
        this.employesM = new HashMap<>();
        this.profs = new HashMap<>();
        
        this.etudiants = new HashMap<>();
        this.plan_E = new Plan_Etude();
        this.emploi_Groupe = new HashMap<>();
        this.emploi_Prof = new HashMap<>();
        
        
        this.nom = nom;
        this.CSM = CSM;
        this.employesS = employes;
        this.employesM=employesM;
        this.profs = profs;
        
        this.etudiants = etudiants;
        this.plan_E = plan_E;
        this.emploi_Groupe = emploi_Groupe;
        this.emploi_Prof = emploi_Prof;
        stages = new ArrayList<>();
        Materielles = new ArrayList<>();
    }
    public Academie_militaire() {
        this.CSM = new Centre_Stock_maintenance();
        this.employesS = new HashMap<>();
        this.employesM = new HashMap<>();
        this.profs = new HashMap<>();
        
        this.etudiants = new HashMap<>();
        this.plan_E = new Plan_Etude();
        this.emploi_Groupe = new HashMap<>();
        this.emploi_Prof = new HashMap<>();
    }
    
    public void ajoutemployeM1(employe_maintenance p)
    {
        int x=p.getIdpers();
        this.employesM.put(x, p);
    }  
    public void ajoutemployeS1(Employe_encad_stg p)
    {
        int x=p.getIdpers();
        this.employesS.put(x, p);
    } 
    
    
    
    public void ajouteetud1(Etudiant p)
    {
        int x=p.getIdpers();
        this.etudiants.put(x, p);
        
    }
    
    public void ajouteStage(STAGE  p)
    {
        
        this.stages.add(p);
        
    }
    public void ajouteMaterielle(Materielle  p)
    {
        
        this.Materielles.add(p);
        
    }
    
    public void ajoutprof1(Prof p)
    {
        int x=p.getIdpers();
        this.profs.put(x, p);
    }
    
    
    
    
    
    public void ajoutemployeM()
    {do
        
    {
        System.out.println("donner le idpers : ");
        int x = sc.nextInt();
         sc.nextLine();
        if (!this.employesM.containsKey(x)) {
            
            employe_maintenance p = new employe_maintenance();
            
            p.setIdpers(x);
            
            p.saisiremploye_maintenance();
            
            this.employesM.put(x, p);
            break;
        } else {
            
            System.out.println("Key " + x + " deja excite");
        }
    }
        while(true);
    
    }
    public void ajoutemployeS()
    {do
        
    {
        System.out.println("donner le idpers : ");
        int x = sc.nextInt();
         sc.nextLine();
        if (!this.employesS.containsKey(x)) {
            
            Employe_encad_stg p = new Employe_encad_stg();
            
            p.setIdpers(x);
            
            p.saisirEmploye_encad_stg();
            
            this.employesS.put(x, p);
            break;
        } else {
            
            System.out.println("Key " + x + " deja excite");
        }
    }
        while(true);
    
    }
    public void ajoutProf()
    {do
        
    {
        System.out.println("donner le idpers : ");
        int x = sc.nextInt();
         sc.nextLine();
        if (!this.profs.containsKey(x)) {
            
            Prof p = new Prof();
            
            p.setIdpers(x);
            
            p.saisiprof();
            
            this.profs.put(x, p);
            break;
        } else {
            
            System.out.println("Key " + x + " deja excite");
        }
    }
        while(true);
    
    }
    public void ajoutEtudiant_prepa()
    {do
        
    {
        System.out.println("donner le idpers : ");
        int x = sc.nextInt();
         sc.nextLine();
        if (!this.etudiants.containsKey(x)) {
            
            Etudiant_prepa p = new Etudiant_prepa();
            
            p.setIdpers(x);
            
            p.saisirEtudiant_prepa();
            
            this.etudiants.put(x, p);
            break;
        } else {
            
            System.out.println("Key " + x + " deja excite");
        }
    }
        while(true);
    
    }
    public void ajoutEtudiant_sante()
    {do
        
    {
        System.out.println("donner le idpers : ");
        int x = sc.nextInt();
         sc.nextLine();
        if (!this.etudiants.containsKey(x)) {
            
            Etudiant_sante p = new Etudiant_sante();
            
            p.setIdpers(x);
            
            p.saisirEtudiant_sante();
            
            this.etudiants.put(x, p);
            break;
        } else {
            
            System.out.println("Key " + x + " deja excite");
        }
    }
        while(true);
    
    }
    
    
    
    public void saisir()
    {
       System.out.println("donner le nom : ");
       this.nom = sc.nextLine();
       System.out.println("donner le donne de plan de etude : ");
       this.plan_E = new Plan_Etude();
       this.plan_E.saisir();
       System.out.println("donner le donne Centre_Stock_maintenance : ");
       this.CSM = new Centre_Stock_maintenance();
       this.CSM.saisir();
    
    }
    @Override
    public String toString()
    {
       String ch="";
        ch+="le nom :"+this.nom +"\n" ;
         //ch+=this.plan_E.toString();
         //ch+=this.CSM.toString();
        ch+="le liste de employe_maintenance \n" ;
         Iterator<Entry<Integer, employe_maintenance>> iterator = this.employesM.entrySet().iterator();
         for (int i=0;i<this.employesM.size();i++)
         {
              Entry<Integer, employe_maintenance> entry = iterator.next();
              ch+=entry.getValue().toString();
              
         
         }
         ch+="le liste de Employe_encad_stg \n" ;
         Iterator<Entry<Integer, Employe_encad_stg>> iterator1 = this.employesS.entrySet().iterator();
         for (int i=0;i<this.employesS.size();i++)
         {
              Entry<Integer, Employe_encad_stg> entry = iterator1.next();
              ch+=entry.getValue().toString();
              
         
         }
         ch+="le liste de Prof \n" ;
         Iterator<Entry<Integer, Prof>> iterator2 = this.profs.entrySet().iterator();
         for (int i=0;i<this.profs.size();i++)
         {
              Entry<Integer, Prof> entry = iterator2.next();
              ch+=entry.getValue().toString();
              
         
         }
         ch+="le liste de Etudiant \n" ;
         Iterator<Entry<Integer, Etudiant>> iterator3 = this.etudiants.entrySet().iterator();
         for (int i=0;i<this.etudiants.size();i++)
         {
              Entry<Integer, Etudiant> entry = iterator3.next();
              ch+=entry.getValue().toString();
              
         
         }
         return(ch);
    
    }

    public ArrayList<STAGE> getStages() {
        return stages;
    }

    public void setStages(ArrayList<STAGE> stages) {
        this.stages = stages;
    }

    public ArrayList<Materielle> getMaterielles() {
        return Materielles;
    }

    public void setMaterielles(ArrayList<Materielle> Materielles) {
        this.Materielles = Materielles;
    }
    public void getbase(){
        String url = "jdbc:mysql://localhost:3306/academie_militaire";
        String utilisateur = "root";
        String motDePasse = "0000";

        Connection connexion = null;
        ResultSet resultSet = null;
        
        Employe_encad_stg a = new Employe_encad_stg("1987-09-18", 12356781, "Ben Ali", "Mohamed", 11223345, 35, 1234528, "Male", "academie_foundek_jdid", "**", 5, 18, 40,9);
        Employe_encad_stg a1 = new Employe_encad_stg("1987-09-18", 12356725, "Ben Ali", "Mejdi", 98221436, 37, 1234248, "Male", "academie_navale", "*", 5, 18, 40,9);
        employesS.put(a.getIdpers(),a);
        this.ajoutemployeS1(a);
      
        try {
            // Establish the connection to the database
            
            connexion = DriverManager.getConnection(url, utilisateur, motDePasse);

            
            
            
            
            
            
          // Pour les stage  
            
            String selectQuery4 = "SELECT * FROM Stage";
        PreparedStatement preparedStatement4 = connexion.prepareStatement(selectQuery4);
        resultSet = preparedStatement4.executeQuery();

        List<STAGE> stageList = new ArrayList<>();

        while (resultSet.next()) {
            int idStage = resultSet.getInt("id_stage");
            String nom = resultSet.getString("nom");
            String type = resultSet.getString("type");
            String lieu = resultSet.getString("lieu");
            Date dateDeb = resultSet.getDate("date_deb");
            Date dateFin = resultSet.getDate("date_fin");

            STAGE stage = new STAGE(idStage, nom, type, lieu, dateDeb, dateFin);
            stageList.add(stage);
        }
        for (STAGE x : stageList) {
            // Assuming you have a method to add stages to your application
            
            stages.add(x);
        }

        // Close resources for stages
        resultSet.close();
        preparedStatement4.close();
            
            
            
            
            
                    // For Materielle
        String selectQueryMaterielle = "SELECT * FROM materielle";
        PreparedStatement preparedStatementMaterielle = connexion.prepareStatement(selectQueryMaterielle);
        resultSet = preparedStatementMaterielle.executeQuery();

        List<Materielle> materielleList = new ArrayList<>();

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String nom = resultSet.getString("nom");
            String type = resultSet.getString("type");
            int nbrepiece_desp = resultSet.getInt("nbrepiece_desp");
            int nbrepiece_Nece = resultSet.getInt("nbrepiece_Nece");

            Materielle materielle = new Materielle(id, nom, type, nbrepiece_desp, nbrepiece_Nece);
            materielleList.add(materielle);
        }

        // Process the list of Materielle
        for (Materielle x : materielleList) {
            Materielles.add(x);
        }

        // Close resources for Materielle
        resultSet.close();
        preparedStatementMaterielle.close();

            
            
            
            
            // Pour les employés de maintenance
            String selectQuery3 = "SELECT * FROM employemaintenance";
            PreparedStatement preparedStatement3 = connexion.prepareStatement(selectQuery3);
            resultSet = preparedStatement3.executeQuery();

            List<employe_maintenance> getEmpM = new ArrayList<>();

            while (resultSet.next()) {
                int idPers = resultSet.getInt("idpers");
                String nom = resultSet.getString("nom");
                String prenom = resultSet.getString("prenom");
                int numtel = resultSet.getInt("numtel");
                int age = resultSet.getInt("age");
                int cin = resultSet.getInt("cin");
                String sexe = resultSet.getString("sexe");
                String dateNaiss = resultSet.getDate("DateNaiss").toString();
                String department = resultSet.getString("department");
                String grades = resultSet.getString("grades");
                int numberOfHoursPerDay = resultSet.getInt("numberOfHoursPerDay");
                int numberOfDaysPerMonth = resultSet.getInt("numberOfDaysPerMonth");
                float salaireH = resultSet.getFloat("salaireH");
                String specialite = resultSet.getString("specialite");
                String note = resultSet.getString("note");

                employe_maintenance emp = new employe_maintenance(dateNaiss, idPers, nom, prenom, numtel, age, cin, sexe, department, grades,
                        numberOfHoursPerDay, numberOfDaysPerMonth, salaireH, specialite, note);
                getEmpM.add(emp);
            }
            for (employe_maintenance x:getEmpM)
            {
            this.ajoutemployeM1(x);
            }

            // Close resources for employes de maintenance
            resultSet.close();
            preparedStatement3.close();

            // Pour les étudiants
            String selectQuery2 = "SELECT * FROM etudiant";
            PreparedStatement preparedStatement2 = connexion.prepareStatement(selectQuery2);
            resultSet = preparedStatement2.executeQuery();

            List<Etudiant> getEtudiant = new ArrayList<>();

            while (resultSet.next()) {
                int idPers = resultSet.getInt("idpers");
                String nom = resultSet.getString("nom");
                String prenom = resultSet.getString("prenom");
                int numtel = resultSet.getInt("numtel");
                int age = resultSet.getInt("age");
                int cin = resultSet.getInt("cin");
                String sexe = resultSet.getString("sexe");
                float moyenne = resultSet.getFloat("moyenne");
                String dateNaiss = resultSet.getDate("DateNaiss").toString();
                String niveauScolaire = "BAC";

                Etudiant etd = new Etudiant(dateNaiss, idPers, nom, prenom, numtel, age, cin, sexe, moyenne, niveauScolaire);
                getEtudiant.add(etd);
            }
            for (Etudiant x:getEtudiant)
            {
            this.ajouteetud1(x);
            }

            // Close resources for etudiants
            resultSet.close();
            preparedStatement2.close();

            // Pour les professeurs
            String selectQuery = "SELECT * FROM proff_academique";
            PreparedStatement preparedStatement = connexion.prepareStatement(selectQuery);
            resultSet = preparedStatement.executeQuery();

            List<Prof> profList = new ArrayList<>();

            while (resultSet.next()) {
                int idPers = resultSet.getInt("idpers");
                String nom = resultSet.getString("nom");
                String prenom = resultSet.getString("prenom");
                int numtel = resultSet.getInt("numtel");
                int age = resultSet.getInt("age");
                int cin = resultSet.getInt("cin");
                String sexe = resultSet.getString("sexe");
                String dateNaiss = resultSet.getDate("DateNaiss").toString();
                String department = resultSet.getString("department");
                String grades = resultSet.getString("grades");
                int numberOfHoursPerDay = resultSet.getInt("numberOfHoursPerDay");
                int numberOfDaysPerMonth = resultSet.getInt("numberOfDaysPerMonth");
                float salaireH = resultSet.getFloat("salaireH");
                String matiere = resultSet.getString("matiere");

                Prof prof = new Prof(dateNaiss, idPers, nom, prenom, numtel, age, cin, sexe, department, grades,
                        numberOfHoursPerDay, numberOfDaysPerMonth, salaireH, matiere);
                profList.add(prof);
            }
            for (Prof x:profList)
            {
            this.ajoutprof1(x);
            }

            // Process the list of professors
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null && !resultSet.isClosed()) {
                    resultSet.close();
                }
                if (connexion != null && !connexion.isClosed()) {
                    connexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public HashMap<Integer, employe_maintenance> getEmployesM() {
        return employesM;
    }

    public void setEmployesM(HashMap<Integer, employe_maintenance> employesM) {
        this.employesM = employesM;
    }

    public HashMap<Integer, Employe_encad_stg> getEmployesS() {
        return employesS;
    }

    public void setEmployesS(HashMap<Integer, Employe_encad_stg> employesS) {
        this.employesS = employesS;
    }

    public HashMap<Integer, Prof> getProfs() {
        return profs;
    }

    public void setProfs(HashMap<Integer, Prof> profs) {
        this.profs = profs;
    }

    

    public HashMap<Integer, Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(HashMap<Integer, Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    public HashMap<String, Emploi> getEmploi_Groupe() {
        return emploi_Groupe;
    }

    public void setEmploi_Groupe(HashMap<String, Emploi> emploi_Groupe) {
        this.emploi_Groupe = emploi_Groupe;
    }

    public HashMap<Integer, Emploi> getEmploi_Prof() {
        return emploi_Prof;
    }

    public void setEmploi_Prof(HashMap<Integer, Emploi> emploi_Prof) {
        this.emploi_Prof = emploi_Prof;
    }
    
    
    
}

