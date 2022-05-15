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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;

public class Feladat13 extends Application {

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Beadandó");
        //Input mező
        primaryStage.setTitle("Név");
        TextField input = new TextField();
        StackPane s = new StackPane();
        s.getChildren().add(input);
        //Gomb
        Button OKbutton = new Button();
        OKbutton.setText("OK");
        /*TableView tableView = new TableView();   //Tábla
        TableColumn<Person, String> column1 
                = new TableColumn<>("Vezetéknév");

        column1.setCellValueFactory(
                new PropertyValueFactory<>("Vezetéknév"));

        TableColumn<Person, String> column2
                = new TableColumn<>("Keresztnév");

        column2.setCellValueFactory(
                new PropertyValueFactory<>("Keresztnév"));
         */
        HBox horiBox = new HBox(OKbutton);
        VBox gridBox = new VBox(horiBox, input);
        OKbutton.setTranslateX(300);  
        OKbutton.setTranslateY(200);
        Scene mainScene = new Scene(gridBox, 900, 600);
        primaryStage.setScene(mainScene);

        primaryStage.show();

    }

    public static void main(String args[]) {
        launch(args);
    }
}
