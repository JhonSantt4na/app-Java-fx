package gui.Util;
import javafx.scene.control.TextField;

public class Constraints {
   // Contem uns metodos padãoes que contem um Listener controlara o comportamento dos nossos controles
   // addListener = Função para ser exc quando o controler sofre uma alteração ou  interação com usuario

     public static void setTextFieldInteger(TextField txt) {
      txt.textProperty().addListener((obs, oldValue, newValue) -> {
         if (newValue != null && !newValue.matches("\\d*")) {
            txt.setText(oldValue);
         }
      });
   }

   // Testando o valor maximo
   public static void setTextFieldMaxLength(TextField txt, int max) {
      txt.textProperty().addListener((obs, oldValue, newValue) -> {
         if (newValue != null && newValue.length() > max) {
            txt.setText(oldValue);
         }
      });
   }

   public static void setTextFieldDouble(TextField txt) {
      txt.textProperty().addListener((obs, oldValue, newValue) -> {
         if (newValue != null && !newValue.matches("\\d*([\\.]\\d*)?")) {
            txt.setText(oldValue);
         }
      });
   }
}

//newValue.matches("\\d*")) = Expressão regular para ser um numero inteiro
//newValue.matches("\\d*([\\.]\\d*)?")) = Expressão regular para ser um numero double