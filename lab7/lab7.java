package lab7;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class lab7 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Group g=new Group();
		Scene sc=new Scene(g,300,300);
		
		Circle c=new Circle();
		c.setRadius(100);
		c.setCenterX(150);
		c.setCenterY(130);
		c.setStroke(Color.BLACK);
		c.setFill(Color.TRANSPARENT);
		g.getChildren().add(c);
		
		Ellipse e=new Ellipse();
		e.setCenterX(100);
		e.setCenterY(100);
		e.setRadiusX(30);
		e.setRadiusY(20);
		e.setStroke(Color.BLACK);
		e.setFill(Color.TRANSPARENT);
		g.getChildren().add(e);
		
		Ellipse e1=new Ellipse();
		e1.setCenterX(200);
		e1.setCenterY(100);
		e1.setRadiusX(30);
		e1.setRadiusY(20);
		e1.setStroke(Color.BLACK);
		e1.setFill(Color.TRANSPARENT);
		g.getChildren().add(e1);
		
		Circle c1=new Circle();
		c1.setRadius(15);
		c1.setCenterX(100);
		c1.setCenterY(100);
		c1.setStroke(Color.BLACK);
		c1.setFill(Color.BLACK);
		g.getChildren().add(c1);
		
		Circle c2=new Circle();
		c2.setRadius(15);
		c2.setCenterX(200);
		c2.setCenterY(100);
		c2.setStroke(Color.BLACK);
		c2.setFill(Color.BLACK);
		g.getChildren().add(c2);
		
		Polygon p=new Polygon();
		p.getPoints().addAll(new Double[]{
			150.0,105.0,125.0,155.0,175.0,155.0
		});
		p.setStroke(Color.BLACK);
		p.setFill(Color.TRANSPARENT);
		g.getChildren().add(p);
		
		Arc a=new Arc(150,160,50,25,0,-180);
		a.setType(ArcType.OPEN);
		a.setFill(Color.WHITE);
		a.setStroke(Color.BLACK);
		g.getChildren().add(a);
		
		primaryStage.setScene(sc);
		primaryStage.show();
		
	}
	public static void main(String[] args)
	{
		Application.launch(args);
	}

}
