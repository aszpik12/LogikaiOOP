package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Feladat {
Scanner scr=new Scanner(System.in);
ArrayList<Lada> ladak = new ArrayList<Lada>();
    Lada lad1 = new Lada("én rejtem a kincset", "Arany", false);
    Lada lad2 = new Lada("nem én rejtem a kincset", "Ezüst", true);
    Lada lad3 = new Lada("az arany hazudik", "Bronz", false);
    konzol kon = new konzol();
    public Feladat() {
        ladak.add(lad1);
        ladak.add(lad2);
        ladak.add(lad3);
        konzol.leiras();
       
        
    }
    public int valasz(){
        int valasz=scr.nextInt();
        return valasz;
    }
    private void isHelyes(){
        
        int valasz=valasz();
        if(ladak.get(valasz-1).getKincs() == true){
            konzol.jovalasz();
        }
        else{
           konzol.rosszvalasz(); 
        }
    }
        
    }
