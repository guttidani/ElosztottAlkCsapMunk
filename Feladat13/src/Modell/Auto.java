/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modell;

/**
 *
 * @author Dani
 */
public class Auto {
    private String Szin;
    private String Marka;

    public String getSzin() {
        return Szin;
    }

    public String getMarka() {
        return Marka;
    }

    public Auto() {
        this.Marka = "VW";
        this.Szin = "Fehér";
    }

    public void setSzin(String Szin) {
        this.Szin = Szin;
    }

    public void setMarka(String Marka) {
        this.Marka = Marka;
    }
    
    public Auto(String Szin) {
        this.Marka = "VW";
        this.Szin = Szin;
    }
    
    public Auto(String Szin, String Marka) {
        this.Marka = Marka;
        this.Szin = Szin;
    }
    
}
