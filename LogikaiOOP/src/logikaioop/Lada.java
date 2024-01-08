
package logikaioop;


public class Lada {
    private String allitas, anyag;
    private boolean kincs;

    public Lada(String allitas, String anyag, boolean kincs) {
        this.allitas = allitas;
        this.anyag = anyag;
        this.kincs = kincs;
    }
    public Lada(String allitas, String anyag){
        this.allitas = allitas;
        this.anyag = anyag;
        this.kincs = true;
        
    }
    public Lada(boolean kincs){
        this.allitas = "pénz";
        this.anyag = "réz";
        this.kincs = true;
        
    }

    public String getAllitas() {
        return allitas;
    }

    public void setAllitas(String allitas) {
        this.allitas = allitas;
    }

    public String getAnyag() {
        return anyag;
    }

    public void setAnyag(String allany) {
        this.anyag = anyag;
    }

    public boolean isKincs() {
        return kincs;
    }

    public void setKincs(boolean kincs) {
        this.kincs = kincs;
    }

    @Override
    public String toString() {
        return "Lada{" + "allitas=" + allitas + ", allany=" + anyag + ", kincs=" + kincs + '}';
    }
    
}
