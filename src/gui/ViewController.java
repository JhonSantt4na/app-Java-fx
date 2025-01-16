package gui;

import gui.Util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class ViewController {

   @FXML
   private Button btn;

   @FXML
   public void  onBtnAction(){
      // Chamando o Alerts Aqui no Evento do Controller

      Alerts.showAlert("Alert Title", null, "Hello", Alert.AlertType.ERROR);

      // Alert.AlertType.INFORMATION = é um enum com algumas outras opções de tipos de alertas
      // "Alert Header" = Podemos colocar como null para ter um alerta mais enxuto
   };
}
