import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class TestButton extends Application{
	public static void main(String[]args){
		launch(args);
	}
	@Override
	public void start(Stage stage)throws Exception{
		////button 
		Button btn=new Button("Click Me!");
/////setAction
		btn.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent e){
				System.out.println("Aloha!");
			}
		});
		BorderPane pane=new BorderPane();
		pane.setCenter(btn);
		///Scene
		Scene scene=new  Scene(pane,400,300);

		stage.setScene(scene);
		stage.show();
	}
}