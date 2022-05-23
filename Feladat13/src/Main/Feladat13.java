/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.layout.HBox;

public class Feladat13 extends Application {

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Emberek Felvétele");
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
        gridPane.add(OKgomb, 2, 9);
        gridPane.add(Megsegomb, 2, 10);
        //Checkbox
        CheckBox cb = new CheckBox();
        cb.setText("Cégtulajdonos");
        cb.setSelected(false);
        gridPane.add(cb, 2, 4);
        //Gombok + Mezők + checkbox Vége
        //ChoiceBox kezdete
        Text t = new Text();
        t.setText("Márka");
        Text t2 = new Text();
        t2.setText("Szín");
        ChoiceBox chb = new ChoiceBox(FXCollections.observableArrayList("VolksWagen", "Peugeot", "Ford", "Audi", "Porche"));
        ChoiceBox chb2 = new ChoiceBox(FXCollections.observableArrayList("Fehér", "Fekete", "Piros", "Kék", "Sárga"));
        chb.setTooltip(new Tooltip("Válassza ki a márkát!"));
        chb2.setTooltip(new Tooltip("Válassza ki a színt!"));
        gridPane.add(chb, 2, 6);
        gridPane.add(chb2, 2, 7);
        gridPane.add(t, 1, 6);
        gridPane.add(t2, 1, 7);
        //Tábla Kezdete
        Label tablaNev = new Label("Adatok:");
        Font font = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 17);
        tablaNev.setFont(font);
        TableView<Data> table = new TableView<Data>();
        //Oszlopok létrehozása
        TableColumn Nev = new TableColumn("Név");
        Nev.setCellValueFactory(new PropertyValueFactory<>("név"));
        Nev.setPrefWidth(200);
        TableColumn Marka = new TableColumn("Márka");
        Marka.setCellValueFactory(new PropertyValueFactory("márka"));
        Marka.setPrefWidth(100);
        TableColumn Szin = new TableColumn("Szín");
        Szin.setCellValueFactory(new PropertyValueFactory("szín"));
        Szin.setPrefWidth(100);
        TableColumn Vagyon = new TableColumn("Vagyon");
        Vagyon.setCellValueFactory(new PropertyValueFactory("vagyon"));
        Vagyon.setPrefWidth(200);
        //Oszlopok megjelenítése
        table.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        table.getColumns().addAll(Nev, Marka, Szin, Vagyon);
        //Tábla méretezése
        table.setMaxSize(700, 200);
        VBox vbox = new VBox();
        HBox hbox = new HBox(gridPane, vbox);
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 50, 50, 60));
        vbox.getChildren().addAll(tablaNev, table);
        //Tábla Vége
        Scene scene = new Scene(hbox, 1000, 300);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String args[]) {
        launch(args);
    }
}
