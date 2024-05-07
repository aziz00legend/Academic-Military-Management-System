/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GESTION_DES_RESOURCES;

/**
 *
 * @author boubs
 * @param <T>
 * @param <U>
 * @param <V>
 * @param <W>
 */
import java.util.Scanner;

public class Quadruple <T, U, V, W> {
    private T valeur1;
    private U valeur2;
    private V valeur3;
    private W valeur4;
    public Quadruple()
    {}
            
    public Quadruple(T a, U b, V c, W d)
    {this.valeur1=a;
    this.valeur2=b;
    this.valeur3=c;
    this.valeur4=d;}
    public void saisir() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez la première valeur : ");
        this.valeur1 = (T) sc.nextLine();

        System.out.println("Entrez la deuxième valeur : ");
        this.valeur2 = (U) sc.nextLine();

        System.out.println("Entrez la troisième valeur : ");
        this.valeur3 = (V) sc.nextLine();

        System.out.println("Entrez la quatrième valeur : ");
        this.valeur4 = (W) sc.nextLine();
    }

    @Override
    public String toString() {
        return "Valeur 1 : " + this.valeur1 + "\nValeur 2 : " + this.valeur2 +
                "\nValeur 3 : " + this.valeur3 + "\nValeur 4 : " + this.valeur4;
    }
    
    
    
    
    
    public void setValeur1(T valeur) {
        this.valeur1 = valeur;
    }

    public T getValeur1() {
        return this.valeur1;
    }
    public void setValeur2(U valeur) {
        this.valeur2 = valeur;
    }

    public U getValeur2() {
        return this.valeur2;
    }
    public void setValeur3(V valeur) {
        this.valeur3 = valeur;
    }

    public V getValeur3() {
        return this.valeur3;
    }
    public void setValeur4(W valeur) {
        this.valeur4 = valeur;
    }

    public W getValeur4() {
        return this.valeur4;
    }
}
