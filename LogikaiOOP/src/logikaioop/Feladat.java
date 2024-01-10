package logikaioop;

import java.util.ArrayList;
import java.util.Scanner;

public class Feladat {
Scanner scr=new Scanner(System.in);
ArrayList<Lada> ladak = new ArrayList<Lada>();
    Lada lad1 = new Lada("én rejtem a kincset", "Arany", false);
    Lada lad2 = new Lada("nem én rejtem a kincset", "Ezüst", true);
    Lada lad3 = new Lada("az arany hazudik", "Bronz", false);

    public Feladat() {
        ladak.add(lad1);
        ladak.add(lad2);
        ladak.add(lad3);
        leiras();
    }
    public int valasz(){
        int valasz=scr.nextInt();
        return valasz;
    }
    private void isHelyes(){
        System.out.println("mondja meg melyik jo(1-3):");
        int valasz=valasz();
        if(ladak.get(valasz-1).getKincs() == true){
            System.out.println("A válasz jó");
        }
        else{
            System.out.println("A válasz rosz");
        }
    }
        public void leiras(){
        System.out.println("Leírás:");
        for (Lada lada : ladak) {
            System.out.println(lada.anyag +" "+ lada.allitas);
        }
        isHelyes();
    }
}