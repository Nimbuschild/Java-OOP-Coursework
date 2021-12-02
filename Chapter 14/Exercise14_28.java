// Sekou Hera

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class Exercise14_28 extends Application {

    @Override
    public void start(Stage primaryStage) {
        ClockPane clock = new ClockPane((int)(Math.random()*12),((int)(Math.random()*2) == 1 ? 30 : 0),0);
        String displaytime = clock.getHour() + ":" + clock.getMinute() + ":" + clock.getSecond();

        clock.setSecondHandVisible(false);
        Label time = new Label(displaytime);
        BorderPane pane = new BorderPane();
        pane.setCenter(clock);
        pane.setBottom(time);
        BorderPane.setAlignment(time, Pos.CENTER);


        Scene scene = new Scene(pane, 250, 250);
        primaryStage.setTitle("Exercise14_28");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}


