package gui;

import gui.Util.Alerts;
import gui.Util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;


public class ViewController implements Initializable {

   @FXML
   private TextField txtNumber1;

   @FXML
   private TextField txtNumber2;

   @FXML
   private Label labelResult;

   @FXML
   private Button btnSum;

   @FXML
   public void  onBtnSumAction(){
      try {
         Locale.setDefault(Locale.US); // Mudando a virgula / Ponto

         //Pegando os Valores
         double number1 = Double.parseDouble(txtNumber1.getText());
         double number2 = Double.parseDouble(txtNumber2.getText());

         //Somando os Valores
         double sum = number1 + number2;

         //Adicionando o valor ao labelResult
         labelResult.setText(String.format("%.2f", sum));
      }catch (NumberFormatException e) {
         Alerts.showAlert("Error", null, e.getMessage(), Alert.AlertType.ERROR);
      }
   };

   // Ira executar quando o controlador for criado
   // url = caminho da tela
   // ResourceBundle = recursos que podemos usar
   @Override
   public void initialize(URL url, ResourceBundle resourceBundle) {
      // Aqui dentro Ações que serão inicializada na instanciação do nosso controlador
      Constraints.setTextFieldDouble(txtNumber1);
      Constraints.setTextFieldDouble(txtNumber2);
      Constraints.setTextFieldMaxLength(txtNumber1, 5);
      Constraints.setTextFieldMaxLength(txtNumber2, 5);
   }
}
