package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

/*
 * Quando o Usuario Fizer alguma interação com a tela
 * essa ação pode ser tratada pelo controlador
 * */

public class ViewController {

   @FXML // Declarando um atributo ao controle da view
   private Button btn;

   // Methodo responsavel para quando o usuario fizer algo
   @FXML
   public void  onBtnAction(){
      System.out.println("Click");
   };
}
