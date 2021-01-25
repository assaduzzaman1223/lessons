 import javafx.animation.Animation;
  import javafx.animation.ScaleTransition;
  import javafx.util.Duration;
  import javafx.application.Application;
  import javafx.stage.Stage;
  import javafx.scene.Scene;
  import javafx.scene.Group;
  import javafx.scene.paint.Color;
  import javafx.scene.shape.Rectangle;

  public class Scale extends Application {
    // main()
    public static void main( String[] args ) {
      launch( args );
    }
    
    // start(); override
    @Override
    public void start( Stage stage ) throws Exception {
      View v = new View();
      Scene scene = new Scene( v, 500, 400 );
      stage.setScene(scene);
      stage.show();
    }
  }
  
  class View extends Group {
    // constructor
    public View(){
Rectangle rect=new Rectangle(0,0,60,70);
rect.setFill(Color.RED);
///
ScaleTransition animation = new ScaleTransition(Duration.seconds(3), rect);
//
animation.setFromX(0.1);
animation.setFromY(0.1);
animation.setToX(5);
animation.setToY(5);
///
animation.setCycleCount(Animation.INDEFINITE);
//
animation.setAutoReverse(true);
///
animation.play();
getChildren().add(rect);
    }
  }
  
