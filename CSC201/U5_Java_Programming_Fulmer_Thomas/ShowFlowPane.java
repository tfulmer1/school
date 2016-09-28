
/*
Displays a FlowPane with two boxes and 3 buttons per box
Unit 5 Problem 1
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 22 Sept 2016
*/

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ShowFlowPane extends Application
{
    @Override
	public void start(Stage primaryStage)
	{
        String[] buttons = {
            "Abort",
            "Retry",
            "Ignore"
        }; //Set basic names for the buttons to use

        FlowPane pane1 = new FlowPane();
        pane1.setPadding(new Insets(11, 12, 13, 14));
        pane1.setHgap(5);
        pane1.setVgap(5);
        FlowPane pane2 = new FlowPane();
        pane2.setPadding(new Insets(11, 12, 13, 14));
        pane2.setHgap(5);
        pane2.setVgap(5);

        for(String button : buttons){
            pane1.getChildren().add(new Button(button));
            pane2.getChildren().add(new Button(button));
        }

        Scene scene1 = new Scene(pane1, 500, 600);
        Scene scene2 = new Scene(pane2, 200, 250);
        primaryStage.setTitle("ShowFlowPane");
        primaryStage.setScene(scene1);
        primaryStage.show();
        Stage secondaryStage = new Stage();
        secondaryStage.setTitle("Secondary");
        secondaryStage.setScene(scene2);
        secondaryStage.show();
	}
}
