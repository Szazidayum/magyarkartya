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
    static List<List<String>> kevertP = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    static Random rnd = new Random();
    static String lap;
    static int hossz;
    static int ujLap;
    static String ujErtek;
    static int kezdo;
    
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
              System.out.println(pakli);  
              hossz=pakli.size();

              for (int i = 0; i < 3; i++) {
            sorok();
            randomKeveres();
            ujPakliKezdo();
            ujPakliKeszites();
            System.out.println(ujPakli);
            sor1.clear();
            sor2.clear();
            sor3.clear();
            ujPakli.clear();
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
                 kevertP.add(sor1);
                 kevertP.add(sor2);
                 kevertP.add(sor3);
            System.out.println(sor1);
            System.out.println(sor2);
            System.out.println(sor3);
}
     
     private static String randomKeveres(){
           ujLap = (int) ((Math.random() * (hossz - 0)) + 0);
            ujErtek = pakli.get(ujLap);
            System.out.println(ujErtek);
            return ujErtek;
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
