import javafx.application.Application;
import javafx.scene.AmbientLight;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.PointLight;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.DrawMode;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;
 
/**
 *
 * @author Yucchi
 */
public class JavaFXD extends Application {
 
    @Override
    public void start(Stage primaryStage) {
 
        final Group root = new Group();
 
        final Sphere sphere = new Sphere(500.0d);
 
        // フォンシェーディングを設定
        final PhongMaterial sphereMaterial = new PhongMaterial();
 
        // DiffuseMap
        sphereMaterial.setDiffuseMap(
                new Image(this.getClass().getResource("resources/earth_texture.jpg").toExternalForm(),
                        8_192 / 2.0d,
                        4_092 / 2.0d,
                        true,
                        true
                )
        );
 
        // BumpMap
        sphereMaterial.setBumpMap(
                new Image(this.getClass().getResource("resources/earth_normalmap.jpg").toExternalForm(),
                        8_192 / 2.0d,
                        4_092 / 2.0d,
                        true,
                        true
                )
        );
 
        // SpecularMap
        sphereMaterial.setSpecularMap(
                new Image(this.getClass().getResource("resources/earth_specularmap.jpg").toExternalForm(),
                        8_192 / 2.0d,
                        4_092 / 2.0d,
                        true,
                        true
                )
        );
 
        // マテリアルを設定
        sphere.setMaterial(sphereMaterial);
        // ドローモードを設定
        sphere.setDrawMode(DrawMode.FILL);
 
        // 透視投影カメラ
        final PerspectiveCamera cam = new PerspectiveCamera(true);
        // Field of View 
        cam.setFieldOfView(45.5d);
        // Clipping Planes
        cam.setNearClip(1.0d);
        cam.setFarClip(1_000_000.0d);
 
        // カメラを 1500 後退させる。(Z 軸を -1500)
        cam.setTranslateZ(-1_500.0d);
 
        // アンビエントライト
        AmbientLight ambient = new AmbientLight();
        ambient.setColor(Color.rgb(90, 90, 90, 0.6));
 
        // ポイントライト
        PointLight point = new PointLight();
        point.setColor(Color.WHITE);
 
        // ポイントライトを移動
        point.setTranslateX(-1_800.0d);
        point.setTranslateY(-1_300.0d);
        point.setTranslateZ(-1_800.0d);
 
        root.getChildren().addAll(sphere, ambient, point);
 
        Scene scene = new Scene(root, 1_024, 768, true, SceneAntialiasing.BALANCED);
 
        scene.setFill(Color.BLACK);
 
        scene.setCamera(cam);
 
        primaryStage.setTitle("JavaFX 3D EARTH");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
 
}