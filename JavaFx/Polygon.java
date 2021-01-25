import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class Polygon extends Application{

	public static void main(String[]args){
		launch(args);
	}
	@Override
	public void start(Stage stage)throws Exception{
		Group grp=new Group();
		Scene scene=new Scene(grp,500,400);
		Polygon triangle=new Polygon(100,20,130,230,250,130);
		polygon.setFill(Color.RED);
		///
		grp.getChildren().add(triangle);
		stage.setScene(scene);
		stage.show();
	}
}