package view;

import java.util.ArrayList;
import java.util.Scanner;
import logikaioop.Lada;

public class konzol {
    String kerdes;
    String valasz;
    Scanner scr = new Scanner(System.in);

    public konzol(String kerdes, String valasz) {
        this.kerdes = kerdes;
        this.valasz = valasz;
    }

    public String getKerdes() {
        return kerdes;
    }

    public String getValasz() {
        return valasz;
    }

    public void setKerdes(String kerdes) {
        this.kerdes = kerdes;
    }

    public void setValasz(String valasz) {
        this.valasz = valasz;
    }

    public int valasz(){
        int valasz=scr.nextInt();
        return valasz;
    }
    
        public void leiras(ArrayList<Lada> ladak){
        System.out.println("Leírás:");
        for (Lada lada : ladak) {
            System.out.println(lada.getAnyag() +" "+ lada.getAllitas());
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
