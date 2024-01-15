
package logikaioop;

import model.Feladat;
import java.util.Scanner;

public class LogikaiOOP {

  
    public static void main(String[] args) {
        Lada lad = new Lada("gyors", "vas", true);
        System.out.println("Leírás");
        System.out.println("Melyik:");
        System.out.println("A válasz jó | rossz");
        
        Feladat lada = new Feladat();
        lada.leiras();
    }
    

}
