package logikaioop;

public class Lada {
    String allitas,anyag;
    boolean kincs;
    
    /*public Lada() {
        this("","",true);
    }*/
    public Lada(String allitas, String anyag, boolean kincs) {
        setAllitas(allitas);
        setAnyag(anyag);
        setKincs(kincs);
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

    public void setAnyag(String anyag) {
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
        return "Lada{" + "allitas=" + allitas + ", anyag=" + anyag + ", kincs=" + kincs + '}';
    }
    public void valasz(){
        
    }
    
}
