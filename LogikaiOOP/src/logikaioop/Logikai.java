
package logikaioop;
    
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
    }

    @Override
    public String toString() {
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



    
    
}
