
package logikaioop;

import java.util.Scanner;

public class LogikaiOOP {

        public static Scanner src = new Scanner(System.in);

        public static void main(String[] args) {
                run();
                
        }

    private static void run() {
       System.out.println("Leírás");
                System.out.println("Az 1. állítás!");
                System.out.println("Az 2. állítás!");
                System.out.println("Az 3. állítás!");
                System.out.println("Melyik:");
                int valasz = src.nextInt();
                Valasz(valasz);
    }
    private static void Valasz(int valasz){
        if(valasz == 1){
            System.out.println("A válasz jó");
        }
        else{
            System.out.println("A válasz rosz");
        }
        
    }

}
