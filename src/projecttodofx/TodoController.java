/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttodofx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

/**
 * FXML Controller class
 *
 * @author Ad
 **/
 public class TodoController implements Initializable{
     
    private Label lblCounter;
    @FXML
    private VBox parentBox;
    @FXML
    private Label lblStatus;
    @FXML
    private Button btnAdd;
    @FXML
    private TextField txtTask;
    @FXML
    private HBox hboxTasks;

    //    main
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addTask(ActionEvent event) {
      
    }

    @FXML
    private void closeApp(MouseEvent event) {
    }

    @FXML
    private void minimizeApp(MouseEvent event) {
    }

    @FXML
    private void handleKeyPressed(KeyEvent event) {
  
    }
    
}
