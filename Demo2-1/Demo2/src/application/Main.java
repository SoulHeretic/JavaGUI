package application;
	
import javafx.application.Application;
import java.util.ArrayList;
import java.util.Collections;  // Import the Collections class
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.*;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.Group;
import javafx.scene.layout.*;
import javafx.geometry.Pos;


public class Main extends Application {  
	public static void main(String[] args)  {    
		launch(args);  
	}  
@Override  public void start(Stage s)  {    
	
	ArrayList<Button> Buttons = new ArrayList<Button>();
	Button one = new Button("*");//Create 7 buttons here
	Button two = new Button("**");
	Button three = new Button("***");
	Button four = new Button("****");
	Button five = new Button("*****");
	Button six = new Button("******");
	Button seven = new Button("*******");
	Buttons.add(one);	//Add all of them.
	Buttons.add(two);
	Buttons.add(three);
	Buttons.add(four);
	Buttons.add(five);
	Buttons.add(six);
	Buttons.add(seven);
	
    BorderPane root = new BorderPane();
    
    HBox hbox = new HBox();
    hbox.setSpacing(10);	//This will create some spacing between the buttons
    
    Collections.shuffle(Buttons); 	//Shuffle the array 

    for(int i = 0; i < Buttons.size(); i++) {	//Add the shuffled array to the hbox
    	hbox.getChildren().add(Buttons.get(i));
    }
    

    root.setTop(hbox);
    
    one.setDisable(false);	//Enable only one button
    two.setDisable(true);
    three.setDisable(true);
    four.setDisable(true);
    five.setDisable(true);
    six.setDisable(true);
    seven.setDisable(true);
    
    one.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent me) -> {
    	one.setDisable(true);
    	two.setDisable(false);
    });
    
    two.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent me) -> {
        two.setDisable(true);
        three.setDisable(false);
        });
    
    three.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent me) -> {
        three.setDisable(true);
        four.setDisable(false);
        });
    
    four.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent me) -> {
        four.setDisable(true);
        five.setDisable(false);
        });
    
    five.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent me) -> {
        five.setDisable(true);
        six.setDisable(false);
        });
    
    six.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent me) -> {
        six.setDisable(true);
        seven.setDisable(false);
        });
    
    seven.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent me) -> {
        seven.setDisable(true);
        });




   
root.getChildren();
Scene scene = new Scene(root, 600, 600);    
//Set up the Stage    
s.setTitle("Extra Credit Lab");    
s.setScene(scene);    
s.show();  }
}