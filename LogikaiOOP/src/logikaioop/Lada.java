package logikaioop;

public class Lada {
    String allitas, anyag;
    boolean kincs;

    /*
     * public Lada() {
     * this("","",true);
     * }
     */
    public Lada(String allitas, String anyag, boolean kincs) {
        setAllitas(allitas);
        setAnyag(anyag);
        setKincs(kincs);
    }

    public String getAllitas() {
        return allitas;
    }

    public String getAnyag() {
        return anyag;
    }

    public boolean getKincs() {
        return kincs;
    }

    public void setAllitas(String allitas) {
        this.allitas = allitas;
    }

    public void setAnyag(String anyag) {
        this.anyag = anyag;
    }

    public void setKincs(boolean kincs) {
        this.kincs = kincs;
    }

    @Override
    public String toString() {
        return "Lada{" + "allitas=" + allitas + ", anyag=" + anyag + ", kincs=" + kincs + '}';
    }

    public void valasz() {

    }

}
