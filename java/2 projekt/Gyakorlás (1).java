/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gyakorlás;

import java.util.Scanner;

/**
 *
 * @author VörösDominik(SZF_202
 */
public class Gyakorlás {
    
    public static void main(String[] args) {
        elsofeldat();
        masodikfeladat();
        Harmadikfeladat();
        negyedikfeladat();
        ötödikfeladat();
        hatodikfeladat();
        hetedikfeladat();
    }

    private static void hetedikfeladat() {
        System.out.print("adj meg egy  szót: ");
        Scanner src= new Scanner(System.in);
        String szo = src.next();
        
        if (szo.charAt(szo.length()-1)== szo.charAt(0)) {
            System.out.println("ugyan az");
        }
        else{
            System.out.println("nem ugyan az ");
        }
    }

    private static void hatodikfeladat() {
        System.out.print("adj meg egy 3 betüs szót: ");
        Scanner src= new Scanner(System.in);
        String szoharomb = src.next();
        while (szoharomb.length()<3) {
            System.out.println("urja");
            szoharomb = src.next();
            
        }
    }

    private static void ötödikfeladat() {
        //negyedikfeladat();
        System.out.print("Ird be kérlek a neved szóközel elválasztva: ");
        Scanner src= new Scanner(System.in);
        String teljesnev = src.next();
        String vezeteknev="";
        boolean space=false;
        for (int i = 0; i < teljesnev.length(); i++) {
            if (teljesnev.charAt(i)==' ') 
            {
                space = true;
            }
            if (space==false) {
                vezeteknev=vezeteknev+teljesnev.charAt(i);
            }
          
            
        }
        System.out.println("Megoldas: " +vezeteknev);
    }

    private static void negyedikfeladat() {
        //Harmadikfeladat();
        
        
        System.out.print("Mondj egy Nevet: ");
        Scanner src= new Scanner(System.in);
        String kereszt = src.next();
    }

    private static void Harmadikfeladat() {
        
            boolean megfelel= true;
        System.out.print("irj ide egy számot 5 és 30 között: ");
        Scanner src= new Scanner(System.in);
        int szam1= src.nextInt();
        if (szam1>30 || szam1<5) {
            System.out.println("hiba");
            megfelel= false;
        while(megfelel==false){
           
            megfelel=szam1<=30 && szam1>=5;
            if (megfelel== false) {
                System.out.println("hiba");
            }
            
        }
    }
    }

    private static void masodikfeladat() {
        boolean megfelel= true;
        System.out.print("irj ide egy számot 5 és 30 között: ");
        Scanner src= new Scanner(System.in);
        int szam1= src.nextInt();
        if (szam1>30 || szam1<5) {
            System.out.println("hiba");
            megfelel= false;
        }
       
    }

    private static void elsofeldat() {
        System.out.print("irj ide egy számot: ");
        Scanner src= new Scanner(System.in);
        int akarmien= src.nextInt();
        
    }
    
}
