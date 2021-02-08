import javafx.application.Application;
  import javafx.stage.Stage;
  import javafx.scene.Scene;
  import javafx.scene.layout.Pane;
  import javafx.scene.paint.Color;
  import javafx.scene.canvas.Canvas;
  import javafx.scene.canvas.GraphicsContext;
  import javafx.animation.AnimationTimer;

  public class BreakPt3V extends Application {
    // data
    private BreakoutThread breakoutthread;

    // method
    public static void main(String[] args) {
      launch( args );
    }

    @Override
    public void start( Stage stage ) {
      stage.setTitle( "BreakoutGame" );

      Pane pane = new Pane();
      Scene scene = new Scene( pane );
      stage.setScene( scene );

      Canvas canvas = new Canvas( 640, 480 );
      GraphicsContext gc = canvas.getGraphicsContext2D();
      pane.getChildren().add( canvas );

      breakoutthread = new BreakoutThread( gc );
      breakoutthread.start();

      stage.show();
    }
  }



  class BreakoutThread extends AnimationTimer {
    // data
    private GraphicsContext gc;
    private Ball ball;

    // method
    public BreakoutThread( GraphicsContext gc ) {
      this.gc = gc;
      this.ball = new Ball();
    }

    @Override
    public void handle( long time ) {
      // clear
      gc.clearRect( 0, 0, 640, 480 );

      // draw
      ball.draw( gc );
      ball.move();
    }
  }



  class Ball {
    // data
    private int x;
    private int y;
    private int x_speed;
    private int y_speed;

    // method
    public Ball() {
      this.x = 0;
      this.y = 0;
      x_speed=3;
      y_speed=3;
    }

    // ballを表示する
    public void draw( GraphicsContext gc ) {
      gc.setFill( Color.RED );
      gc.fillOval( x, y, 20, 20 );
    }

    // ballを移動させる
    public void move() {
      x += 3;
      y += 3;

    if(x>640){
      x_speed *=-1;
    }
    if(y<0){
      y_speed *=-1;
    }
    if(x<0){
      x_speed *=-1;
    }
    if(y>480){
      y_speed *=-1;
    }
    }
  }