  import javafx.animation.Animation;
  import javafx.animation.TranslateTransition;
  import javafx.util.Duration;
  import javafx.application.Application;
  import javafx.stage.Stage;
  import javafx.scene.Scene;
  import javafx.scene.Group;
  import javafx.scene.shape.Rectangle;
  import javafx.scene.shape.Circle;
  import javafx.scene.paint.Color;

  public class Fortnite extends Application{
   
  	public static void main(String[] args) {
  		launch(args);
  	}
   
  	@Override
  	public void start(Stage primaryStage) {
  		View v = new View();
  		Scene scene = new Scene(v, 1080, 720);
  		primaryStage.setScene(scene);
  		primaryStage.show();
  	}
  }
  
  
  class View extends Group{
  	public View() {
  		Rectangle rect = new Rectangle(100,100,50,50);
      Circle crl=new Circle(80,40,40);
  		TranslateTransition animation = new TranslateTransition(Duration.seconds(3), rect);
  		animation.setFromX(0);		// 最初の場所:X
  		animation.setFromY(0);		// 最初の場所:Y
  		animation.setToX(220);		// 最後の場所:X
  		animation.setToY(600);		// 最後の場所:X
  		animation.setCycleCount( Animation.INDEFINITE );
      rect.setFill(Color.RED);
      	// 何回アニメーションするか; 無限
  		// animation.setCycleCount(3);		// 何回アニメーションするか
  		animation.setAutoReverse(true);	// 帰ってくるアニメーション
       TranslateTransition animation1 = new TranslateTransition(Duration.seconds(3), crl);
      animation1.setFromX(1);    // 最初の場所:X
      animation1.setFromY(1);    // 最初の場所:Y
      animation1.setToX(480);    // 最後の場所:X
      animation1.setToY(600);    // 最後の場所:X
      animation1.setCycleCount( Animation.INDEFINITE );
      animation1.setAutoReverse(false);
  		animation.play();
      animation1.play();
  		getChildren().add(rect);
      getChildren().add(crl);
  	}
  }

