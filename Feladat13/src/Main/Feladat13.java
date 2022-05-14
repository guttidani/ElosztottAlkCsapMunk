/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;

/**
 *
 * @author Dani
 */
public class Feladat13 extends Application{
    public void start (Stage primaryStage){
         primaryStage.setTitle("Beadandó");
         VBox gridBox = new VBox();
         Scene mainScene = new Scene(gridBox,900,600);
         primaryStage.setScene(mainScene);
         primaryStage.show();
            
    }
}
