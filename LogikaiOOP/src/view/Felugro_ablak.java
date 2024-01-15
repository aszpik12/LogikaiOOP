/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import logikaioop.Lada;
/**
 *
 * @author dobrocsi.kornel
 */
public class Felugro_ablak {
    
    ArrayList<Lada> ladak;
    public Felugro_ablak(ArrayList<Lada> ladak) {
        this.ladak=ladak;
    }
    public void leiras(){
        JOptionPane.showInternalMessageDialog(null, "Leírás: Minden láda 1-1 állitást tartalmaz, csak az egyik igaz Melyikben van a kincs");
         for (Lada lada : ladak) {
             String egy=lada.getAnyag()+"láda: "+lada.getAllitas();
            JOptionPane.showInternalMessageDialog(null,egy,null,JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public String bekeres(){
       Object[] megoldasok={"arany","ezüst","bronz"};
       String elso=(String) JOptionPane.showInputDialog(null, "adja meg melyik lada helyes", "Valasz", JOptionPane.DEFAULT_OPTION, null, megoldasok, megoldasok);
       return elso;
    }
    public void helyesvalasz(){
        JOptionPane.showMessageDialog(null, "helyes valasz");
    }
    public void helytelenvalasz(){
        JOptionPane.showMessageDialog(null, "helytelen valasz");
    }
}
