package logikaioop;

import java.util.ArrayList;

public class Feladat {
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
