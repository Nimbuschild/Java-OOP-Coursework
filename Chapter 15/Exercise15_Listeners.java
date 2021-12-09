// Sekou Hera

package com.example.ex_15;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ex15 extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        double width = 400;
        double height = 400;
        BallPane ballPane = new BallPane(width / 2,height / 2, Math.min(width,height) / 15);

        Button btLeft = new Button("Left");
        btLeft.setOnAction(e -> ballPane.Left());

        Button btRight = new Button("Right");
        btRight.setOnAction(e -> ballPane.Right());

        Button btUp = new Button("Up");
        btUp.setOnAction(e -> ballPane.Up());

        Button btDown = new Button("Down");
        btDown.setOnAction(e -> ballPane.Down());


        HBox hBox = new HBox(btUp, btDown, btLeft, btRight);
        hBox.setAlignment(Pos.BASELINE_CENTER);
        hBox.setSpacing(10);
        hBox.setPadding(new Insets(10, 10, 10, 10));

        BorderPane pane = new BorderPane();
        pane.setCenter(ballPane);
        pane.setBottom(hBox);

        Scene scene = new Scene(pane, width, height);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise_15");
        primaryStage.show();
    }

    private class BallPane extends Pane {

        private Circle circle;

        public BallPane() {
            this(0, 0, 10);
        }
        public BallPane(double centerX, double centerY, double radius) {
            circle = new Circle(centerX, centerY, radius);
            getChildren().add(circle);
        }
        public void Left() {
            if (circle.getCenterX() - circle.getRadius() - 10 < 0) return;
            circle.setCenterX(circle.getCenterX() - 10);
        }
        public void Right() {
            if (circle.getCenterX() + circle.getRadius() + 10 > getWidth()) return;
            circle.setCenterX(circle.getCenterX() + 10);
        }

        public void Up() {
            if (circle.getCenterY() - circle.getRadius()  - 10 < 0) return;
            circle.setCenterY(circle.getCenterY() - 10);
        }
        public void Down() {
            if (circle.getCenterY() + circle.getRadius() + 10 > getHeight()) return;

            circle.setCenterY(circle.getCenterY() + 10);
        }



        }

    }



