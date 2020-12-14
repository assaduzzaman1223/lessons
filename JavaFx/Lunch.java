import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class Lunch extends Application{
	public static void main(String[]args){
		launch(args);
	}
	@Override
	public void start(Stage stage)throws Exception{
		///stage.show();
		Label label=new Label("HELLO! Beautyfull");
		///pane
		BorderPane pane=new BorderPane();
		pane.setCenter(label);
		///put pane into scene
		Scene scene=new Scene(pane,320,240);
		stage.setScene(scene);

		stage.show();
	}
}