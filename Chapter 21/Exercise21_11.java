// Sekou Hera

package Exercise21_11;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class Exercise21_11 extends Application {

    private Map<String, Integer>[] mapForBoy = new HashMap[10];

    private Map<String, Integer>[] mapForGirl = new HashMap[10];
    private int year = 0;
    private Button btFindRanking = new Button("Find Ranking");
    private ComboBox<Integer> cboYear = new ComboBox<>();
    private ComboBox<String> cboGender = new ComboBox<>();
    private TextField tfName = new TextField();
    private Label lblResult = new Label();

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) throws IOException {
        btFindRanking.setOnAction(new EventHandler(){
            @Override
            public void handle(Event event) {
                if (cboGender.getValue().equals("Male")){

                    lblResult.setText("" + mapForBoy[(cboYear.getValue()-2001)].get(tfName.getText()));
                }else{
                    lblResult.setText("" + mapForGirl[cboYear.getValue()-2001].get(tfName.getText()));
                }
            }
        });

        GridPane gridPane = new GridPane();
        gridPane.add(new Label("Select a year:"), 0, 0);
        gridPane.add(new Label("Boy or girl?"), 0, 1);
        gridPane.add(new Label("Enter a name:"), 0, 2);
        gridPane.add(lblResult,0,4);
        gridPane.add(cboYear, 1, 0);
        gridPane.add(cboGender, 1, 1);
        gridPane.add(tfName, 1, 2);
        gridPane.add(btFindRanking, 1, 3);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(5);
        gridPane.setVgap(5);


        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(gridPane);
        borderPane.setBottom(lblResult);
        BorderPane.setAlignment(lblResult, Pos.CENTER);
        // Create a scene and place it in the stage
        Scene scene = new Scene(borderPane, 370, 160);
        primaryStage.setTitle("Exercise21_11"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
        for (int year = 2001; year <= 2010; year++) {
            cboYear.getItems().add(year);


        }

        cboYear.setValue(2001);
        System.out.println(cboYear.getValue().intValue());
        cboGender.getItems().addAll("Male", "Female");
        cboGender.setValue("Male");
        for(int i = 0; i < 10; i++){
            mapForBoy[i] = new HashMap<String,Integer>();
            mapForGirl[i] = new HashMap<String,Integer>();
        }

        for (int i = 0; i < 10; i++) {
            URL link = new URL("http://liveexample.pearsoncmg.com/data/babynamesranking"+(2001+i)+".txt");
            Scanner scanner = new Scanner(link.openStream());
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] split = line.split("\\s");

                //System.out.println(split[7]);
                // 2 boyname 3 boynumber 5 girlname 7 girlnumber
                mapForBoy[i].put(split[2],Integer.parseInt(split[3]));
                mapForGirl[i].put(split[5],Integer.parseInt(split[7]));
            }
           System.out.println(mapForBoy[0].get("Jacob"));


        }


    }
    /**
     * The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line.
     */
    public static void main(String[] args) {

        launch(args);
    }}
