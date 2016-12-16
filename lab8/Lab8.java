package lab8;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Lab8 extends Application{
	
	@Override
	public void start(Stage primaryStage) {
		GridPane gp = new GridPane();		
		Scene sc = new Scene(gp);
	//	sc.getStylesheets().add("style.css"); 
		perimetercalculator pc = new perimetercalculator();
		Label square = new Label("Enter the side of the square:");
		TextField side = new TextField();		
		Label answer = new Label(" The perimeter square is: ");
		Label perimeter = new Label();
		Button btnCalc = new Button("Calculate");	
		btnCalc.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<Event>(){
			@Override
			public void handle(Event event) {
				double cels = (Double.parseDouble(side.getText()));
				double result= pc.calculator(cels);
				perimeter.setText(String.valueOf(result));
			}			
		});	
		
		gp.getStyleClass().add("pane");
		gp.add(square, 0, 0);
		gp.add(side, 2, 0);
		gp.add(answer, 0, 1);
		gp.add(perimeter, 2, 1);
		gp.add(btnCalc, 1, 2);
        primaryStage.setScene(sc);
        primaryStage.show();
	}
	public class perimetercalculator {
		public double calculator(double side){
			return  4 * side;
		}
}

	public static void main(String[] args) {
		launch(args);
	}
	}

