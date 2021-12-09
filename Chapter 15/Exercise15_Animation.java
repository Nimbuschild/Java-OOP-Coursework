// Sekou Hera

package sample;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.animation.FadeTransition;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
import javafx.util.Duration;


public class Exercise15_Animation extends Application {

    @Override
    public void start(Stage primaryStage){
        Pane pane = new Pane();

        Rectangle rectangle = new Rectangle(100,100,25,50);
        Polygon pentagon = new Polygon();
        pentagon.getPoints().addAll(new Double[]{
                200.0, 300.0,
                300.0, 600.0,
                700.0, 600.0,
                800.0, 300.0,
                500.0, 100.0,
                });

        pane.getChildren().add(rectangle);
        pane.getChildren().add(pentagon);

        PathTransition pt = new PathTransition();
        pt.setDuration(Duration.seconds(10));
        pt.setPath(pentagon);
        pt.setNode(rectangle);
        pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt.setCycleCount(Timeline.INDEFINITE);
        pt.setAutoReverse(false);
        pt.play();

        pentagon.setOnMousePressed( event -> pt.pause());
        pentagon.setOnMouseReleased( event -> pt.play());

        Scene scene = new Scene(pane, 250, 200);
        primaryStage.setTitle("Exercise15_Animation");
        primaryStage.setScene(scene);
        primaryStage.show();

        FadeTransition ft = new FadeTransition(Duration.seconds(10),rectangle);
            ft.setFromValue(1.0);
            ft.setToValue(0.1);
            ft.setCycleCount(Timeline.INDEFINITE);
            ft.setAutoReverse(false);
            ft.play();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
