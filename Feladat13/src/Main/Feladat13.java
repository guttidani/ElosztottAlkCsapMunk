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
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.layout.HBox;

public class Feladat13 extends Application {

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Beadandó");
        //Gombok + Mezők Létrehozása      
        Text Veznev = new Text("Vezetéknév");
        Text Kernev = new Text("Keresztnév");
        TextField Vezfield = new TextField();
        TextField Kerfield = new TextField();
        //Gombok
        Button OKgomb = new Button("OK");
        Button Megsegomb = new Button("Mégse");
        //Grid Pane Létrehozása
        GridPane gridPane = new GridPane();
        //gridPane.setMinSize(400, 200);
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        //GRID Helyzete
        gridPane.setAlignment(Pos.TOP_LEFT);
        //Gombok + Mezők Helyezése
        gridPane.add(Veznev, 1, 2);
        gridPane.add(Vezfield, 2, 2);
        gridPane.add(Kernev, 1, 3);
        gridPane.add(Kerfield, 2, 3);
        gridPane.add(OKgomb, 2, 4);
        gridPane.add(Megsegomb, 2, 5);
        //Gombok + Mezők Vége
        //Tábla Kezdete

        Label tablaNev = new Label("Adatok:");
        Font font = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12);
        tablaNev.setFont(font);
        TableView<Data> table = new TableView<Data>();
        //Creating columns
        TableColumn Nev = new TableColumn("Név");
        Nev.setCellValueFactory(new PropertyValueFactory<>("név"));
        TableColumn Marka = new TableColumn("Márka");
        Marka.setCellValueFactory(new PropertyValueFactory("márka"));
        TableColumn Szin = new TableColumn("Szín");
        Szin.setCellValueFactory(new PropertyValueFactory("szín"));
        TableColumn Vagyon = new TableColumn("Vagyon");
        Vagyon.setCellValueFactory(new PropertyValueFactory("vagyon"));
        Vagyon.setPrefWidth(100);
        //Adding data to the table
        table.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        table.getColumns().addAll(Nev, Marka, Szin, Vagyon);
        //Setting the size of the table
        table.setMaxSize(400, 200);
        VBox vbox = new VBox();
        HBox hbox = new HBox(gridPane,vbox);
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 50, 50, 60));
        vbox.getChildren().addAll(tablaNev, table);
        //Tábla Vége
        Scene scene = new Scene(hbox, 1000, 500);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String args[]) {
        launch(args);
    }
}
