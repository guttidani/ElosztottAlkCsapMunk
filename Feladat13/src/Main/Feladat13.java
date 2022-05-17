/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;


public class Feladat13 extends Application {

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Beadandó");
        //Gombok + Mezők       
        Text Veznev = new Text("Vezetéknév");
        Text Kernev = new Text("Keresztnév");
        TextField Vezfield = new TextField();
        TextField Kerfield = new TextField();
        //Gombok
        Button OKgomb = new Button("OK");
        Button Megsegomb = new Button("Mégse");
        //Creating a Grid Pane
        GridPane gridPane = new GridPane();
        //Setting size for the pane
        //gridPane.setMinSize(400, 200);
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        //GRID helyzete
        gridPane.setAlignment(Pos.TOP_LEFT);
        //Gombok + Mezők helyezése
        gridPane.add(Veznev, 1, 2);
        gridPane.add(Vezfield, 2, 2);
        gridPane.add(Kernev, 1, 3);
        gridPane.add(Kerfield, 2, 3);
        gridPane.add(OKgomb, 2, 4);
        gridPane.add(Megsegomb, 2, 5);
        Scene scene = new Scene(gridPane, 900, 200);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String args[]) {
        launch(args);
    }
}
