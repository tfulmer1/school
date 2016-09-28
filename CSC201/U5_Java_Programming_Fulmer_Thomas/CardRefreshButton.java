
/*
Displays four card with a refresh button to bring new ones up
Unit 5 Problem 3
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 22 Sept 2016
*/

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.text.*;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.image.*;
import java.util.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;


public class CardRefreshButton extends Application
{
    public static Pane pane = new HBox(10);
    public static Pane pane1 = new HBox(10);
    public static ArrayList<Image> deck = new ArrayList<Image>();
    public static Button refresh = new Button("Refresh");
    public static BorderPane bpane = new BorderPane();


    @Override
	public void start(Stage primaryStage){
        //Setup Pane
        pane.setPadding(new Insets(5,5,5,5));

        //Create images list
        for(int i = 1; i <= 52; i++){
            String path = ("image/card/" + i + ".png");
            Image image = new Image(CardRefreshButton.class.getResourceAsStream(path));
            deck.add(image);
        }

        //Initial shuffle
        Collections.shuffle(deck);

        //create a button and a pane for it
        RefreshHandleClass handler = new RefreshHandleClass();
        refresh.setOnAction(handler);
        pane1.getChildren().add(refresh);
 
        //Set initial display of Cards
        pane.getChildren().add(new ImageView(deck.get(0)));
        pane.getChildren().add(new ImageView(deck.get(1)));
        pane.getChildren().add(new ImageView(deck.get(2)));
        pane.getChildren().add(new ImageView(deck.get(3)));

        //create the border pane
        bpane.setTop(pane);
        bpane.setCenter(refresh);

        Scene scene = new Scene(bpane);
 
        primaryStage.setTitle("Shuffling Cards");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

class RefreshHandleClass implements EventHandler<ActionEvent>{
    @Override
    public void handle(ActionEvent e){
        CardRefreshButton.pane.getChildren().clear();
        Collections.shuffle(CardRefreshButton.deck);
        CardRefreshButton.pane.getChildren().add(new ImageView(CardRefreshButton.deck.get(0)));
        CardRefreshButton.pane.getChildren().add(new ImageView(CardRefreshButton.deck.get(1)));
        CardRefreshButton.pane.getChildren().add(new ImageView(CardRefreshButton.deck.get(2)));
        CardRefreshButton.pane.getChildren().add(new ImageView(CardRefreshButton.deck.get(3)));

    }
}