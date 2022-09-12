package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Magyarkartya {
    
    static List<String> pakli = new ArrayList<>(22);
    static List<String> ujPakli = new ArrayList<>(22);
    static List<String> sor1 = new ArrayList<>();
    static List<String> sor2 = new ArrayList<>();
    static List<String> sor3 = new ArrayList<>();
    static List<String> segitoSor = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    static Random rnd = new Random();
    static String lap;
    static int hossz;
    static int ujLap;
    static String ujErtek;
    static int kezdo;
    static int kivalasztott;
    
    public static void main(String[] args) {
    //a kevert megírása, hogy mindig a 11.lap a gondolt legyen! 3x bekérni kell a felhasználótól
    //GRAFikusan a varázslósat
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};

        for (int i = 0; i < szinek.length; i++) {
            for (int j = 0; j < ertek.length; j++) {
                lap = szinek[i]+ertek[j];
//                System.out.println(lap);
            if(!("MX".equals(lap) || "MIX".equals(lap) || "MVIII".equals(lap))){
                    pakli.add(lap);}  
                }}
//              System.out.println(pakli);  
              hossz=pakli.size();
               
                sorok();
                
              for (int i = 0; i < 3; i++) {      
            beker();
            rendez();
            randomKeveres();
            ujPakliKezdo();
            ujPakliKeszites();
            ujSorok(); 
//            System.out.println(ujPakli);
//            sor1.clear();
//            sor2.clear();
//            sor3.clear();
//            ujPakli.clear();
        }      
    }
    
     private static void sorok(){
        for (int i = 0; i < hossz; i++) {
                     if(i<7){
                        sor1.add(pakli.get(i)); 
                     }
                    if(i>=7 && i<14){
                        sor2.add(pakli.get(i));
                    }
                    if(i>=14){
                        sor3.add(pakli.get(i));
                    }}
            System.out.println(sor1);
            System.out.println(sor2);
            System.out.println(sor3);
}
     private static void ujSorok(){
        for (int i = 0; i < hossz; i++) {
                     if(i<7){
                        sor1.add(ujPakli.get(i)); 
                     }
                    if(i>=7 && i<14){
                        sor2.add(ujPakli.get(i));
                    }
                    if(i>=14){
                        sor3.add(ujPakli.get(i));
                    }}
}
     private static void rendez(){
          if(kivalasztott==1){
             segitoSor = sor2;
             sor2 = sor1;
             sor1 = segitoSor;
         }else if(kivalasztott == 3){
             segitoSor = sor2;
             sor2 = sor3;
             sor3 = segitoSor;
         }
            System.out.println(sor1);
            System.out.println(sor2);
            System.out.println(sor3);
     }
   
     private static void beker(){
          System.out.println("Kérem adja meg, hogy melyik 'oszlopban' van a kiválasztott lap!");
          kivalasztott = sc.nextInt();       
     }
     
     private static void randomKeveres(){
           
           ujLap = (int) ((Math.random() * (hossz - 0)) + 0);
            ujErtek = pakli.get(ujLap);
//            System.out.println(ujErtek);
     }
     
   private static boolean ujPakliKezdo(){
    boolean kiir=false;
        while(kiir==false) {
            if(kiir==false){
                for (int t = 0; t < sor1.size(); t++) {
                if(sor1.get(t).equals(ujErtek)){
                    kiir=true;
            }else if(kiir==false){
                    for (int z = 0; z < sor2.size(); z++) {
                if(sor2.get(z).equals(ujErtek)){
                    kiir=true;
                }else if(kiir==false){
                    for (int u = 0; u < sor3.size(); u++) {
                if(sor3.get(u).equals(ujErtek)){
                     kiir=true;
                }}}}}}}
             }
            sor1.clear();
            sor2.clear();
            sor3.clear();
            ujPakli.clear();
        
        return kiir;
}
   private static void ujPakliKeszites(){
//       System.out.println(ujLap);
        for (int a = ujLap; a < hossz; a++) {
               ujPakli.add(pakli.get(a));
            }
        for (int k = 0; k < ujLap; k++) {
            ujPakli.add(pakli.get(k));
        }
   }
}
