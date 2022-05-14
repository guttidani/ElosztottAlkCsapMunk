/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modell;

import java.util.ArrayList;

/**
 *
 * @author Dani
 */
public class Cegtulajodonos extends Ember {

    private ArrayList<Auto> Autok;

    // getter setter
    public Cegtulajodonos() {
        Autok = new ArrayList<Auto>();
        //Amikor „létrejön” egy cégtulajdonos, akkor aktualizálja magát, ha van létező bináris állomány.
    }

    public void sellCar(Auto auto) {
        Autok.remove(auto);
    }

    public void buyCar(Auto auto) {
        Autok.add(auto);
    }

    public String vagyonJelentes() {
        //jelentés egy bináris állományba kerül
        return Autok.toString();
    }

    @Override
    public String toString() {
        return "Név: " + this.getVezeteknev() + " " + this.getKeresztnev() + "Autok =" + Autok + '}';
    }

}
