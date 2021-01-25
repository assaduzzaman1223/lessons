 import javafx.application.Application;
　  import javafx.stage.Stage;
　  import javafx.scene.Scene;
　  import javafx.scene.Group;
　  import javafx.scene.paint.Color;
　  import javafx.scene.shape.Circle;

public class Circle1 extends Application{
	public static void main(String[]args){
		launch(args);
	}
	@Override
	public void start(Stage stage)throws Exception{
		//group
		Group root=new Group();
		Scene scene=new SAcene(root,500,400);
		///
		Circle circle=new Circle(200,200,80);
		///color
		Circle.setFill(Color.RED);
		///
		root.getChildren().add(circle);
		//show
		stage.setScene(scene);
		stage.show();
	}
}