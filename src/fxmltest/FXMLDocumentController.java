/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmltest;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Opiframe
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    Label titleLabel;

    @FXML
    private void handleSaveButton(ActionEvent event) {
        System.out.println("You clicked Save!");
    }
    
    @FXML
    private void handleCancelButton(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    private void handlePressButton(ActionEvent event) {
        titleLabel.setText("You changed the title");
    }

    @FXML
    private void handleCloseItem(ActionEvent event) {
        Platform.exit();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
