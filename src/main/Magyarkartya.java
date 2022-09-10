package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Magyarkartya {
    
    static List<String> pakli = new ArrayList<>(21);
    static List<String> sor1 = new ArrayList<>();
    static List<String> sor2 = new ArrayList<>();
    static List<String> sor3 = new ArrayList<>();
    static List<List<String>> kevertP = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    static int min;
    Random rnd = new Random();
    static String lap;
    
    public static void main(String[] args) {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};

        for (int i = 0; i < szinek.length; i++) {
            for (int j = 0; j < ertek.length; j++) {
               
//                System.out.println(szinek[i]+ertek[j]);
                lap = szinek[i]+ertek[j];
//                System.out.println(lap);
            if(!("MX".equals(lap) || "MIX".equals(lap) || "MVIII".equals(lap))){
                    pakli.add(lap);
}
                    
                }
        }
//              System.out.println(pakli);  
        
              int hossz=pakli.size();
              System.out.println(hossz);
             for (int i = 0; i < hossz; i++) {
                 if(i<7){
                    sor1.add(pakli.get(i)); 
                 }
                
                if(i>=7 && i<14){
                    sor2.add(pakli.get(i));
                }
                if(i>=14){
                    sor3.add(pakli.get(i));
                }
            }
             kevertP.add(sor1);
             kevertP.add(sor2);
             kevertP.add(sor3);
//        System.out.println(sor1);
//        System.out.println(sor2);
//        System.out.println(sor3);
   
        //random keverés
        System.out.println(kevertP);
        min = kevertP.get(1);
        System.out.println(min);
        int hosszKevertP = kevertP.size();
        for (int i = 0; i < hosszKevertP; i++) {
            int szam1 = rnd.nextInt( - min + 1) + min;
        }
        
        
        
//        System.out.println(pakli);
//        System.out.println("Kérem adja meg a kártya színét:");
//        String beszin = sc.nextLine();
//        System.out.println("Kérem adja meg a kártya értékét:");
//        String beertek = sc.nextLine();
    }
    //a kevert megírása, hogy mindig a 11.lap a gondolt legyen! 3x bekérni kell a felhasználótól
    //GRAFikusan a varázslósat
    
}
