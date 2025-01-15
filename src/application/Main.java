package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {
   @Override
   public void start(Stage primaryStage) {
      try {
         // Ao inves de cria um Painel Vazio
         //BorderPane root = new BorderPane();


         // vou importa o nosso View do gui aqui:
         Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/gui/View.fxml")));

         // Parent é uma Super Classe de AnchorPane por isso funciona normalmente com o UpCasting
         // Sendo o Parent a classe mais generica que vai compor os nossos elementos da tela

         // Indicando a Cena
         Scene scene = new Scene(parent); // Não precisa mais especificar o tamanho
         primaryStage.setScene(scene);
         primaryStage.show();

      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   public static void main(String[] args) {
      launch(args);
   }
}