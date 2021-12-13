// Sekou Hera
package sample;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.paint.Color;

public class Exercise16_1 extends Application {
   Text text = new Text(50, 50, "Programming is fun");

    @Override
    public void start(Stage primaryStage) {


        HBox Buttonpane = new HBox(20);
            Button btLeft = new Button("<=");
            Button btRight = new Button("=>");
            Buttonpane.getChildren().addAll(btLeft, btRight);
            Buttonpane.setAlignment(Pos.CENTER);
            BorderPane pane = new BorderPane();
            pane.setBottom(Buttonpane);

        btLeft.setOnAction(e -> text.setX(text.getX() - 10));
        btRight.setOnAction(e -> text.setX(text.getX() + 10));

        HBox RadioButtonpane = new HBox(20);
            RadioButton rbRed = new RadioButton("Red");
            RadioButton rbYellow = new RadioButton("Yellow");
            RadioButton rbBlack = new RadioButton("Black");
            RadioButton rbOrange = new RadioButton("Orange");
            RadioButton rbGreen = new RadioButton("Green");
            RadioButtonpane.getChildren().addAll(rbRed, rbYellow, rbBlack, rbOrange, rbGreen);

        rbRed.setOnAction(e -> {
            if (rbRed.isSelected()) {
                text.setFill(Color.RED);
            }
        });

        rbYellow.setOnAction(e -> {
            if (rbYellow.isSelected()) {
                text.setFill(Color.YELLOW);
            }
        });

        rbBlack.setOnAction(e -> {
            if (rbBlack.isSelected()) {
                text.setFill(Color.BLACK);
            }
        });

        rbOrange.setOnAction(e -> {
            if (rbOrange.isSelected()) {
                text.setFill(Color.ORANGE);
            }
        });

        rbGreen.setOnAction(e -> {
            if (rbGreen.isSelected()) {
                text.setFill(Color.GREEN);
            }
        });

        ToggleGroup Buttongroup = new ToggleGroup();
            rbRed.setToggleGroup(Buttongroup);
            rbYellow.setToggleGroup(Buttongroup);
            rbBlack.setToggleGroup(Buttongroup);
            rbOrange.setToggleGroup(Buttongroup);
            rbGreen.setToggleGroup(Buttongroup);

        Pane Textpane = new Pane();
            Textpane.setStyle("-fx-border-color: black");
            Textpane.getChildren().add(text);
            pane.setCenter(Textpane);
            pane.setTop(RadioButtonpane);

        Scene scene = new Scene(pane, 450, 150);
            primaryStage.setTitle("Exercise16_1");
            primaryStage.setScene(scene);
            primaryStage.show();





    }
}