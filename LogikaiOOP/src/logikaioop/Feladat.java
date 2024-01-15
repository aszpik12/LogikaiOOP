package logikaioop;

import java.util.ArrayList;
import java.util.Scanner;

public class Feladat {
    Lada lad1 = new Lada("veszélyes", "fa", true);
    Lada lad2 = new Lada("biztonságos", "vas", true);
    Lada lad3 = new Lada("ismeretlen", "gyémánt", false);
    ArrayList<Lada> ladak = new ArrayList<Lada>();
    Scanner scr = new Scanner(System.in);

    public Feladat() {
        ladak.add(lad1);
        ladak.add(lad2);
        ladak.add(lad3);
    }

    @Override
    public String toString() {
        return "Ladak{" + "lad1=" + lad1 + ", lad2=" + lad2 + ", lad3=" + lad3 + ", ladak=" + ladak + '}';
    }
    
        public int valasz(){
        int valasz=scr.nextInt();
        return valasz;
    }
    
        public void leiras(){
        System.out.println("Leírás:");
        for (Lada lada : ladak) {
            System.out.println(lada.anyag +" "+ lada.allitas);
        }
        System.out.println("mondja meg melyik jo(1-3):");
    }
        
        public void jovalasz(){
            System.out.println("A válasz jó");  
        }
        
        public void rosszvalasz(){
            System.out.println("A válasz rossz"); 
        }

}