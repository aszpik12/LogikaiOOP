/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logikaioop;

import java.util.Objects;


class Leiras {
    private String valasz;

    public Leiras(String valasz) {
        this.valasz = valasz;
    }

    public String getValasz() {
        return valasz;
    }

    public void setValasz(String valasz) {
        this.valasz = valasz;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.valasz);
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
        return Objects.equals(this.valasz, other.valasz);
    }

    @Override
    public String toString() {
        return "Leiras{" + "valasz=" + valasz + '}';
    }
    
}
