
package logikaioop;
    
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
    }

    @Override
    public String toString() {
        return "Logikai{" + "allitas1=" + allitas1 + ", allitas2=" + allitas2 + ", allitas3=" + allitas3 + ", valasztott=" + valasztott + ", valasz=" + valasz + '}';
    }
     
    
}
