
package logikaioop;


public class LogikaiOOP {

  
    public static void main(String[] args) {
     Logikai log = new Logikai("1 Opcio", "2 Opcio", "3 Opcio");
      System.out.println("Leírás");
        System.out.println("Az " + log.getOpcio1());
        System.out.println("A " + log.getOpcio2());
        System.out.println("A " + log.getOpcio3());
        System.out.println("Melyik:");
        System.out.println("A válasz jó | rossz");
    }
    
}
