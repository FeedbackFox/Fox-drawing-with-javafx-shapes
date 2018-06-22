package feedbackfox.javafxdemo1;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;

import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class Main extends Application {
	
	private int counter = 0;
	
	ArrayList<Polygon> polygons = new ArrayList<Polygon>();
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		//set group and scene
		Group root = new Group();
		
		Scene scene = new Scene(root, 600, 400); 
		//make all polygons
		
		
		newPolygon(67.5, 72, 58.5, 92, 25, 82, Color.web("#f17746")); //non-black tip of nose
		newPolygon(67.5, 72, 58.5, 92, 81, 81.5, Color.web("#b9411f"));
		newPolygon(67.5, 72, 78, 56.5, 81, 81.5, Color.web("#ffcb65"));
		newPolygon(115.5, 89, 78, 56.5, 81, 81.5, Color.web("#b9411f"));
		newPolygon(115.5, 89, 78, 56.5, 104, 50.5, Color.web("#f17746"));
		newPolygon(115.5, 89, 138, 58.5, 104, 50.5, Color.web("#ffa255"));
		newPolygon(124, 47.5, 138, 58.5, 104, 50.5, Color.web("#a22d1e"));
		newPolygon(124, 47.5, 138, 58.5, 129, 9.5, Color.web("#7c2a15"));
		newPolygon(124, 47.5, 104, 50.5, 129, 9.5, Color.web("#e4f9f0")); 
		newPolygon(115.5, 89, 138, 58.5, 123.5, 120, Color.web("#ffcb65"));
		newPolygon(153, 93.5, 138, 58.5, 123.5, 120, Color.web("#ffa255")); 
		newPolygon(153, 93.5, 132, 182.5, 123.5, 120, Color.web("#ffcb65"));
		newPolygon(105.5, 172, 132, 182.5, 123.5, 120, Color.web("#f17746"));
		newPolygon(105.5, 172, 94, 118.5, 123.5, 120, Color.web("#cfede1"));
		newPolygon(81, 81.5, 94, 118.5, 123.5, 120, Color.web("#e4f9f0"));
		newPolygon(81, 81.5, 115.5, 89, 123.5, 120, Color.web("#f8fefa"));
		newPolygon(81, 81.5, 94, 118.5, 58.5, 92, Color.web("#cfede1")); 
		newPolygon(34, 97, 94, 118.5, 58.5, 92, Color.web("#e4f9f0"));
		newPolygon(34, 97, 25, 82, 58.5, 92, Color.web("#f8fefa")); 
		newPolygon(153, 93.5, 132, 182.5, 198.5, 141, Color.web("#de5f34"));
		newPolygon(153, 93.5, 138, 58.5, 198.5, 141, Color.web("#ffcb65"));
		newPolygon(269, 159.5, 132, 182.5, 198.5, 141, Color.web("#f17746"));
		newPolygon(269, 159.5, 132, 182.5, 208.5, 226.5, Color.web("#ffa255")); //checkpoint middle of fur
		newPolygon(138, 245, 132, 182.5, 208.5, 226.5, Color.web("#f17746"));
		newPolygon(138, 245, 132, 182.5, 100.5, 199.5, Color.web("#cfede1"));
		newPolygon(105.5, 172, 132, 182.5, 100.5, 199.5, Color.web("#e4f9f0"));
		newPolygon(138, 245, 199.5, 242.5, 208.5, 226.5, Color.web("#de5f34"));
		newPolygon(138, 245, 199.5, 242.5, 170.5, 296, Color.web("#b9411f")); 
		newPolygon(202.5, 285, 199.5, 242.5, 170.5, 296, Color.web("#8f2821"));
		newPolygon(202.5, 285, 194, 352, 170.5, 296, Color.web("#5b1a14"));
		newPolygon(186.5, 350, 194, 352, 170.5, 296, Color.web("#8f2821"));
		newPolygon(186.5, 350, 194, 352, 177, 360, Color.web("#3a1611"));
		newPolygon(269, 159.5, 289, 222, 208.5, 226.5, Color.web("#de5f34")); 
		Polygon realpolygon1 = new Polygon();
		realpolygon1.getPoints().addAll(new Double[] {
				289d, 222d, 208.5, 226.5, 199.5, 242.5, 200.5, 252d
		});
		realpolygon1.setFill(Color.web("#cfede1"));
		newPolygon(269, 159.5, 369, 146, 291, 231, Color.web("#ffa255"));
		newPolygon(399, 208.5, 369, 146, 291, 231, Color.web("#f17746")); // checkpoint hind legs
		newPolygon(399, 208.5, 369, 146, 400.5, 162.5, Color.web("#de5f43"));
		newPolygon(399, 208.5, 442.5, 202.5, 400.5, 162.5, Color.web("#f17746"));
		newPolygon(399, 208.5, 442.5, 202.5, 427, 296.5, Color.web("#de5f34"));
		newPolygon(494, 296.5, 442.5, 202.5, 427, 296.5, Color.web("#ffa255"));
		newPolygon(494, 296.5, 448, 349.5, 427, 296.5, Color.web("#b9411f"));
		newPolygon(494, 296.5, 448, 349.5, 504.5, 360.5, Color.web("#9b2823"));
		newPolygon(494, 296.5, 519, 330.5, 504.5, 360.5, Color.web("#751f1e"));
		newPolygon(494, 296.5, 519, 330.5, 567.5, 326.6, Color.web("#5b1a14"));
		newPolygon(567.5, 326.5, 519, 330.5, 504.5, 360.5, Color.web("#39120b")); 
		newPolygon(399, 208.5, 354.5, 267, 291, 231, Color.web("#de5f34"));
		newPolygon(399, 208.5, 354.5, 267, 396.5, 245, Color.web("#b9411f")); 
		newPolygon(388, 289, 354.5, 267, 396.5, 245, Color.web("#9b2823"));
		newPolygon(388, 289, 404, 260, 396.5, 245, Color.web("#b9411f"));
		newPolygon(388, 289, 354.5, 267, 373.5, 315.5, Color.web("#761d19")); 
		newPolygon(353, 349, 354.5, 267, 373.5, 315.5, Color.web("#5b1a14"));
		newPolygon(353, 349, 360.5, 356.5, 373.5, 315.5, Color.web("#761d19")); 
		newPolygon(353, 349, 360.5, 356.5, 339, 361.5, Color.web("#39120b")); // 81.5 66
		
		//eye
		newPolygon(81.5, 66, 82.5, 76.5, 92, 74, Color.BLACK); // 92 74
		
		
		//nose
		newPolygon(23.3, 81.3, 31, 80.6, 27.5, 86, Color.BLACK);

		
		//add all polygons
		for(int i = 0; i < counter; i++) {
			root.getChildren().add(polygons.get(i));
		}
		root.getChildren().add(realpolygon1);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Polygonal Fox");
		primaryStage.getIcons().add(new Image("file:photo.jpg"));
		primaryStage.show();
	}
	
	public void newPolygon(double point1, double point2, double point3, double point4, double point5, double point6, Color color)
	{
		
		Polygon temppolygon = new Polygon();
		temppolygon.getPoints().addAll(new Double[] {
				point1, point2, point3, point4, point5, point6
		});
		temppolygon.setFill(color);
				
		polygons.add(temppolygon);		
		
		counter++;
		
	}

}
