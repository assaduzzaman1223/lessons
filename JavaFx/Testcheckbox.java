import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.CheckBox;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;


public class TestCheckbox extends Application{
	public static void main(String[]args){
		launch(args);
	}
	@Override
	public void start(Stage strage)throws Exception{
		CheckBox check=new CheckBox("CheckBox"){
		check.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent e){
            System.out.println("Aloha");
		}
	});
		BprderPene pane=new BorderPane();
		pane.setCenter(check);

		Scene scene=new Scene(pane,400,300);

		stage.setScene(scene);
		stage.show();
    }
}