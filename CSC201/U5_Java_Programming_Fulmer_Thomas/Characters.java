
/*
Displays a FlowPane with two boxes and 3 buttons per box
Unit 5 Problem 2
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 22 Sept 2016
*/

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.text.*;
import javafx.scene.transform.Rotate;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class Characters extends Application
{
    @Override
	public void start(Stage primaryStage)
	{
        //Establish a center point
        Text text = new Text("X");
        double originX = 350;
        double originY = 350;
        text.setX(originX);
        text.setY(originY);
        
        //Creating a pane
        Pane pane = new Pane();

        //Setting up the text, no spaces needed, they'll be gapped by their positions
        String input = "WELCOMETOJAVA! "; //extra space to start of string is obvious

        //Set the radius and degrres per character
        double radius = originX * 0.80;
        double degrees = 365.0 / input.length();

        //Adding the letters in the circle
        double degree = 0;
        for(int i = 0; i < input.length(); i++){
            double x = originX + (radius * Math.cos(Math.toRadians(degree)));
            double y = originY + (radius * Math.sin(Math.toRadians(degree)));
            Text letter = new Text(x, y, Character.toString(input.charAt(i)));
            letter.setFont(new Font("Times New Roman", 35));
            letter.setRotate(degree + 90);
            pane.getChildren().add(letter);
            degree += degrees;
        }

        Scene scene1 = new Scene(pane, originX*2, originY*2);
        primaryStage.setTitle("Rotating Text Example");
        primaryStage.setScene(scene1);
        primaryStage.show();
        
	}
}
