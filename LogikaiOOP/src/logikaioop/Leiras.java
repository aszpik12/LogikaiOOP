/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logikaioop;

import java.util.ArrayList;
import java.util.Objects;


class Leiras {
      private ArrayList<String> leiras;

    public Leiras(ArrayList<String> leiras) {
        this.leiras = leiras;
    }

    public ArrayList<String> getLeiras() {
        return leiras;
    }

    public void setLeiras(ArrayList<String> leiras) {
        this.leiras = leiras;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.leiras);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Leiras other = (Leiras) obj;
        return Objects.equals(this.leiras, other.leiras);
    }

    
    
}
