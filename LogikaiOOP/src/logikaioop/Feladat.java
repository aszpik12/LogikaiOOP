package logikaioop;

import java.util.ArrayList;
import java.util.Scanner;

public class Feladat {
    Scanner scr=new Scanner(System.in);
    Lada lad1 = new Lada("veszélyes", "fa", true);
    Lada lad2 = new Lada("biztonságos", "vas", true);
    Lada lad3 = new Lada("ismeretlen", "gyémánt", false);
    ArrayList<Lada> ladak = new ArrayList<Lada>();

    public Feladat() {
        ladak.add(lad1);
        ladak.add(lad2);
        ladak.add(lad3);
    }

    @Override
    public String toString() {
        return "Ladak{" + "lad1=" + lad1 + ", lad2=" + lad2 + ", lad3=" + lad3 + ", ladak=" + ladak + '}';
    }
    
    public void leiras(){
        System.out.println("Leírás:");
        for (Lada lada : ladak) {
            System.out.println(lada.allitas);
        }
    }

    public void valasz(){
        System.out.println("Melyik:");
        int valasz=scr.nextInt();
        if(valasz==3){
            System.out.println("A válasz jó");
        }else{
            System.out.println("A válasz rossz");
        }
    }
}
