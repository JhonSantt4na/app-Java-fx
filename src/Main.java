import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

   @Override
   public void start(Stage primaryStage) {
      Button btn = new Button("Clique em mim!");
      btn.setOnAction(e -> System.out.println("Olá, JavaFX!"));

      StackPane root = new StackPane();
      root.getChildren().add(btn);

      Scene scene = new Scene(root, 300, 250);

      primaryStage.setTitle("JavaFX Exemplo");
      primaryStage.setScene(scene);
      primaryStage.show();
   }

   public static void main(String[] args) {
      launch(args);
   }
}