/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modell;

/**
 *
 * @author Dani
 */
public class Autotulajdonos extends Ember{
    
    private Auto auto;
    
    //add constructor, getter, setter

    public Autotulajdonos(Auto auto) {
        this.auto = auto;
    }

    public Autotulajdonos(Auto auto, String Vezeteknev, String Keresztnev) {
        super(Vezeteknev, Keresztnev);
        this.auto = auto;
    }

    @Override
    public String toString() {
        return "Név: " + this.getVezeteknev() + " " + this.getKeresztnev() + "Autok =" + auto + '}';
    }
    
    
    
    
}
