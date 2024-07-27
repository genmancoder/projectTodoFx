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
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class TodoController implements Initializable {

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
        String task = txtTask.getText().toString();
        System.out.println("task is " + task);
        txtTask.setText("");
        HBox hbox = new HBox();
        
        Image image = new Image(getClass().getResourceAsStream("/projecttodofx/icons8_circle_32px.png"));
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(150);
        imageView.setPreserveRatio(true);
        
        hbox.getChildren().add(imageView);
        
        Button btnEdit = new Button();
        Button btnDelete = new Button();
        
        hbox.getChildren().add(btnEdit);
        hbox.getChildren().add(btnDelete);
        
        hboxTasks.getChildren().add(hbox);
        
        
    }
    
}
