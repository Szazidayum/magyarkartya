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
    static int ujLap;
    
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
              System.out.println(pakli);  
        
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
        System.out.println(sor1);
        System.out.println(sor2);
        System.out.println(sor3);
   
        


//random keverés

//        for (int i = 0; i < hossz; i++) {
            ujLap = (int) ((Math.random() * (hossz - 0)) + 0);
            String ujErtek = pakli.get(ujLap);
//            System.out.println(ujLap);
            System.out.println(ujErtek);
//            ujPakli.add(ujErtek);
////            System.out.println("űj érték:"+ujErtek);
//            pakli.remove(lap);
////            System.out.println("régi pakli index:"+i);
//            hossz=pakli.size();
////            System.out.println("űúj pakli size:"+hossz);
//        }
//        System.out.println(ujPakli);
//        System.out.println(ujPakli.get(0));
        
        
        
//        int ujHossz=ujPakli.size();
        //új oszlopok kialakítása
        boolean kiir=false;
        while(kiir==false) {
            if(kiir==false){
                for (int t = 0; t < sor1.size(); t++) {
                if(sor1.get(t).equals(ujErtek)){
                    System.out.println("megvan!");
                    kiir=true;
            }else if(kiir==false){
                    for (int z = 0; z < sor2.size(); z++) {
                if(sor2.get(z).equals(ujErtek)){
                    System.out.println("megvan!");
                    kiir=true;
                }else{
                    for (int u = 0; u < sor3.size(); u++) {
                if(sor3.get(u).equals(ujErtek)){
                     System.out.println("megvan!");
                     kiir=true;
                }
                }
            
            
            
                }
            }
            
            }
            
            }
                
        }
             }
        sor1.clear();
        sor2.clear();
        sor3.clear();
//                 if(k<7){
//                    sor1.add(ujPakli.get(k)); 
//                 }
//                
//                if(k>=7 && k<14){
//                    sor2.add(ujPakli.get(k));
//                }
//                if(k>=14){
//                    sor3.add(ujPakli.get(k));
//                }
//            }
//             kevertP.add(sor1);
//             kevertP.add(sor2);
//             kevertP.add(sor3);
//        System.out.println(sor1);
//        System.out.println(sor2);
        System.out.println(sor3);
   
    //a kevert megírása, hogy mindig a 11.lap a gondolt legyen! 3x bekérni kell a felhasználótól
    //GRAFikusan a varázslósat
    } 
}
