package gui;

import Model.entities.Person;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.util.Callback;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;


public class ViewController implements Initializable {
   // Criando um Atributo para associar com a tela
   @FXML
   private ComboBox<Person> comboBoxPerson;

   @FXML
   private Button btnAll;

   private ObservableList<Person> obsList;
   // ObservableList = Lista especial que ja fica associada ao combobox e a coleção

   @FXML
   public void onBtnAllAction() {
      for (Person person : comboBoxPerson.getItems()){
         System.out.println(person);
      }
   }

   @FXML
   public void onComboBoxPersonAction(){
      Person person = comboBoxPerson.getSelectionModel().getSelectedItem(); // Pegando item que foi selecionado
      System.out.println(person);
   }

   @Override
   public void initialize(URL url, ResourceBundle resourceBundle) {
      // Criamos uma lista normal
      List<Person> list = new ArrayList<>();
      list.add(new Person(1, "Maria", "Maria@Gmail.com"));
      list.add(new Person(2, "Joao", "Joao@Gmail.com"));
      list.add(new Person(3, "Bob", "Bob@Gmail.com"));

      // agr vamos instanciar o ObservableList aproveitando a lista normal
      obsList = FXCollections.observableArrayList(list); // Passamos a lista normal na lista ObservableList
      comboBoxPerson.setItems(obsList); // Carrega os elementos no combo box

      Callback<ListView<Person>, ListCell<Person>> factory = lv -> new ListCell<Person>() {
         @Override
         protected void updateItem(Person item, boolean empty) {
            super.updateItem(item, empty);
            setText(empty ? "" : item.getName());
         }
      };
      comboBoxPerson.setCellFactory(factory);
      comboBoxPerson.setButtonCell(factory.call(null));
   }
}
