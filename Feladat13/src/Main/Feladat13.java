/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;


import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;


public class Feladat13 extends Application {

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Beadandó");
        Button OKbutton = new Button();
        Button Closebutton = new Button();
        OKbutton.setText("OK");
        Closebutton.setText("Close");
        HBox horiBox = new HBox(OKbutton,Closebutton);
        VBox gridBox = new VBox(horiBox);
        //OKbutton.setTranslateX(500);  
        //OKbutton.setTranslateY(250);
        
 
        
        Scene mainScene = new Scene(gridBox, 900, 600);
        primaryStage.setScene(mainScene);
        primaryStage.show();

    }
    public static void main(String args[]){
      launch(args);
   }
}
