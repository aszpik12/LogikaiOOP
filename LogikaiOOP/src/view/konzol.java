package view;

import java.util.ArrayList;
import logikaioop.Lada;

public class konzol {
    String kerdes;
    String valasz;

    public konzol(String kerdes, String valasz) {
        this.kerdes = kerdes;
        this.valasz = valasz;
    }

    public String getKerdes() {
        return kerdes;
    }

    public String getValasz() {
        return valasz;
    }

    public void setKerdes(String kerdes) {
        this.kerdes = kerdes;
    }

    public void setValasz(String valasz) {
        this.valasz = valasz;
    }

    public void leiras(ArrayList<Lada> ladak) {
        System.out.println("Leírás:");
        for (Lada lada : ladak) {
            System.out.println(lada.allitas);
        }
    }
}
