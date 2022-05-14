/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modell;

/**
 *
 * @author Czuth Dominik
 */
public class Ember {

    private static int counter;
    private int ID;
    private String Vezeteknev;
    private String Keresztnev;
    private boolean CEO;

    public int getID() {
        return ID;
    }

    public String getVezeteknev() {
        return Vezeteknev;
    }

    public String getKeresztnev() {
        return Keresztnev;
    }

    public boolean isCEO() {
        return CEO;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setVezeteknev(String Vezeteknev) {
        this.Vezeteknev = Vezeteknev;
    }

    public void setKeresztnev(String Keresztnev) {
        this.Keresztnev = Keresztnev;
    }

    public void setCEO(boolean CEO) {
        this.CEO = CEO;
    }

    public Ember() {
        this.ID = counter++;
        this.Keresztnev = "N/A";
        this.Vezeteknev = "N/A";
        this.CEO = false;

    }

    public Ember(String Vezeteknev, String Keresztnev) {
        this.ID = counter++;
        this.Vezeteknev = Vezeteknev;
        this.Keresztnev = Keresztnev;
        this.CEO = false;
    }

    public Ember(String Vezeteknev, String Keresztnev, boolean isCEO) {
        this.ID = counter++;
        this.Vezeteknev = Vezeteknev;
        this.Keresztnev = Keresztnev;
        this.CEO = isCEO;
    }

}
