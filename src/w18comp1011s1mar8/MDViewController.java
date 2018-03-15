/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w18comp1011s1mar8;

import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author jwright
 */
public class MDViewController implements Initializable
{
     @FXML
    private JFXTextField firstName;

    @FXML
    private JFXTextField lastName;

    @FXML
    void submitButtonPushed(ActionEvent event) {
           System.out.printf("first name: %s %nlast name: %s%n", firstName.getText(), lastName.getText());
    }


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }    
    
}
