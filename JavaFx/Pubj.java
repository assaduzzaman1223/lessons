 import javafx.application.Application;
 import javafx.stage.Stage;
 import javafx.scene.Scene;
 import javafx.scene.Group;
 import javafx.scene.ParallelCamera;
 import javafx.scene.paint.Color;
 import javafx.scene.shape.Rectangle;
 import javafx.scene.shape.Circle;
///
public class Pubj extends Application{
	public static void main(String[]args){
		launch(args);
	}
	@Override
public 	void start(Stage stage)throws Exception{
	/////
	Group grp=new Group();
	Scene scene=new Scene(grp,400,300);
	////
	Rectangle rect1=new Rectangle(100,100,50,50);
	Rectangle rect2=new Rectangle(250,100,50,50);
	Circle crl1=new Circle(200,200,40);
	/////
	rect1.setFill(Color.RED);
	rect2.setFill(Color.BLUE);
	crl1.setFill(Color.YELLOW);
	///
	grp.getChildren().add(rect1);
	grp.getChildren().add(rect2);
	grp.getChildren().add(crl1);
	////
	stage.setScene(scene);
	stage.show();
 }
}

