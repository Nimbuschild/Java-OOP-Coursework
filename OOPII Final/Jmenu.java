// Sekou Hera

package com.example.jmenu;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import java.io.IOException;

public class Jmenu extends Application {
    Pane menupane = new Pane();
    Pane mainpane = new Pane();

    Menu[] menus = Makemenu();

    Button Breakfast = new Button();
    Button Lunch = new Button();
    Button Dinner = new Button();
    Button back = new Button();


    Scene mainscene = new Scene(mainpane,600,400);
    Scene menuscene = new Scene(menupane,600,400);

    @Override
    public void start(Stage stage) throws IOException {

        Breakfast.setText("Breakfast");
        Lunch.setText("Lunch");
        Dinner.setText("Dinner");
        back.setText("Back");

        back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(mainscene);
            }
        });

        Breakfast.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                menupane = new Pane();
                menuscene = new Scene(menupane,600,400);


                for( int i = 0;i < 4; i++){
                    Text item = new Text(menus[i].name+" "+menus[i].price);
                    item.relocate(200,i*20+100);
                    menupane.getChildren().add(item);
                }
                    back.relocate(500,350);
                    menupane.getChildren().add(back);
    stage.setScene(menuscene);
                stage.show();
            }
        });
        Lunch.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                menupane = new Pane();
                menuscene = new Scene(menupane,600,400);


                for( int i = 4;i < 8; i++){
                    Text item = new Text(menus[i].name+" "+menus[i].price);
                    item.relocate(200,(i-4)*20+100);
                    menupane.getChildren().add(item);
                }
                back.relocate(500,350);
                menupane.getChildren().add(back);
                stage.setScene(menuscene);
                stage.show();
            }
        });
        Dinner.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                menupane = new Pane();
                menuscene = new Scene(menupane,600,400);


                for( int i = 8;i < 13; i++){
                    Text item = new Text(menus[i].name+" "+menus[i].price);
                    item.relocate(200,(i-8)*20+100);
                    menupane.getChildren().add(item);
                }
                back.relocate(500,350);
                menupane.getChildren().add(back);
                stage.setScene(menuscene);
                stage.show();
            }
        });

        Breakfast.relocate(100,250);
        Lunch.relocate(225,250);
        Dinner.relocate(325,250);

        mainpane.getChildren().addAll(Breakfast,Lunch,Dinner);

        stage.setTitle("Welcome to Jameson's Pub");
        stage.setScene(mainscene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }


    public static class Menu {
        String name;
        double price;

        Menu(String name, double price){
            this.name = name;
            this.price = price;
        }
    }
    public Menu[] Makemenu(){
        Menu[] menuitem = new Menu[13];
        Menu food1 = new Menu("Irish Blood Sausage w Eggs",11.49);
        Menu food2 = new Menu("Spinach and Artichoke Dip",9.99);
        Menu food3 = new Menu("Irish roll w Pudding",8.59);
        Menu food4 = new Menu("Jameson Omelette",12.99);
        Menu food5 = new Menu("Pesto Mac and Cheese",14.79);
        Menu food6 = new Menu("Prime Rib tacos",13.99);
        Menu food7 = new Menu("Marinara Meatballs",9.89);
        Menu food8 = new Menu("Jameson BBQ Chicken Sandwich",12.79);
        Menu food9 = new Menu("Fish & Chips Dinner",17.99);
        Menu food10 = new Menu("Prime Rib Entree",17.89);
        Menu food11 = new Menu("GameTime Burger",8.99);
        Menu food12 = new Menu("Wagyu & Prime Rib Blue Burger",14.49);
        Menu food13 = new Menu("Prime Rib Entree",17.38);

        menuitem[0] = food1;
        menuitem[1] = food2;
        menuitem[2] = food3;
        menuitem[3] = food4;
        menuitem[4] = food5;
        menuitem[5] = food6;
        menuitem[6] = food7;
        menuitem[7] = food8;
        menuitem[8] = food9;
        menuitem[9] = food10;
        menuitem[10] = food11;
        menuitem[11] = food12;
        menuitem[12] = food13;


        return menuitem;
    }
}
