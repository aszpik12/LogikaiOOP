
package logikaioop;
<<<<<<< HEAD
    
public class Logikai {

    String opcio1;
    String opcio2;
    String opcio3;

    public Logikai(String opcio1, String opcio2, String opcio3) {
        this.opcio1 = opcio1;
        this.opcio2 = opcio2;
        this.opcio3 = opcio3;
    }

    public String getOpcio1() {
        return opcio1;
    }

    public String getOpcio2() {
        return opcio2;
    }

    public String getOpcio3() {
        return opcio3;
    }

    public void setOpcio1(String opcio1) {
        this.opcio1 = opcio1;
    }

    public void setOpcio2(String opcio2) {
        this.opcio2 = opcio2;
    }

    public void setOpcio3(String opcio3) {
        this.opcio3 = opcio3;
=======


public class Logikai {
    String allitas1;
    String allitas2;
    String allitas3;
    int valasztott;
    String valasz;

    public Logikai(String allitas1, String allitas2, String allitas3, int valasztott, String valasz) {
        this.allitas1 = allitas1;
        this.allitas2 = allitas2;
        this.allitas3 = allitas3;
        this.valasztott = valasztott;
        this.valasz = valasz;
    }
    public String getAllitas1() {
        return allitas1;
    }

    public void setAllitas1(String allitas1) {
        this.allitas1 = allitas1;
    }

    public String getAllitas2() {
        return allitas2;
    }

    public void setAllitas2(String allitas2) {
        this.allitas2 = allitas2;
    }

    public String getAllitas3() {
        return allitas3;
    }

    public void setAllitas3(String allitas3) {
        this.allitas3 = allitas3;
    }

    public int getValasztott() {
        return valasztott;
    }

    public void setValasztott(int valasztott) {
        this.valasztott = valasztott;
    }

    public String getValasz() {
        return valasz;
    }

    public void setValasz(String valasz) {
        this.valasz = valasz;
>>>>>>> fejlesztes
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return "Logikai{" + "opcio1=" + opcio1 + ", opcio2=" + opcio2 + ", opcio3=" + opcio3 + '}';
    }

    @Override
    public boolean equals(Object obj) {
        return (this == obj);
    }

    @Override
    public int hashCode() {
       int hash = 7;
    return hash;
    }



    
=======
        return "Logikai{" + "allitas1=" + allitas1 + ", allitas2=" + allitas2 + ", allitas3=" + allitas3 + ", valasztott=" + valasztott + ", valasz=" + valasz + '}';
    }
     
>>>>>>> fejlesztes
    
}
