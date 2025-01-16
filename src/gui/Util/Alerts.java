package gui.Util;

public class Alerts {
   public static void showAlert(String title, String header, String content, javafx.scene.control.Alert.AlertType type){
      javafx.scene.control.Alert alert = new javafx.scene.control.Alert(type); // Criando uma caixa de alerta
      // Setando seus atributos
      alert.setTitle(title);
      alert.setHeaderText(header);
      alert.setContentText(content);

      alert.show(); // Mostrando na tela
      //Vamos chamar ele no nosso evento de Click
   }
}
