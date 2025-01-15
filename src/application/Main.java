package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

// Para ser uma app JavaFX
// tem que ser uma class q extends "Application"
public class Main extends Application {
   // Application tem 3 Methods nela
   // Sendo o Start Abstrato start (Obrigado a Implementar)
   @Override
   public void start(Stage primaryStage) {
      // No start vem como arg o "Palco" > Stage

      try {
         BorderPane root = new BorderPane(); // Criando um painel
         Scene scene = new Scene(root, 400,400); // Criando uma cena para o palco

         // Pegando os stylos do css
         scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

         primaryStage.setScene(scene); // Associando o palco para a cena
         primaryStage.show(); // Mostrando o conteudo do palco

      } catch (Exception e) {
         e.printStackTrace();
      }
   }
   // metodos:
   // Init > O que vau acontecer antes de iniciar o app
   // Stop > O que vai acontecer dpos que para o app

   // Aqui que comerça de fato a Applicação
   public static void main(String[] args) {
      launch(args);
      // launch = Mthodo statico que tem na class application
      // que serve para iniciar uma aplicação javaFX
   }
}