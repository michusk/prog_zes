/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication3;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author PC1
 */
public class FXMLDocumentController implements Initializable {
    
    
    //logowanie
    
    @FXML
    private PasswordField password;
    @FXML
    private TextField login;
    @FXML
    private Button zaloguj;
    @FXML
    private Hyperlink zapomnialemHasla;
    
    
    @FXML
    private void logowanie(ActionEvent event) throws IOException {
        Stage stage; 
        Parent root;
        stage = (Stage) zaloguj.getScene().getWindow();
        
        //logikalogowania
        
        String konto =  "panelKierownik.fxml";
            if(true) {
                konto = "panelPracownik.fxml";
            } else {
                konto = "panelAdmin.fxml";
        }
        root = FXMLLoader.load(getClass().getResource(konto));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    public void handleButtonAction(ActionEvent event) throws IOException {
        Stage stage; 
        Parent root;
        stage = (Stage) zaloguj.getScene().getWindow();
        if(event.getSource()==zaloguj) {
            //Obsługa logowanie
            //Sprawdzisz cy możesz sie zalogowac jak sie możesz zalogowac
            String konto =  "panelKierownik.fxml";
            if(true) {
                konto = "panelPracownik.fxml";
            } else {
                konto = "panelAdmin.fxml";
            }
            
            
            root = FXMLLoader.load(getClass().getResource(konto));
        } else {
            //
            root = FXMLLoader.load(getClass().getResource("logowanie.fxml"));
        }
        
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        
    }
    
    @FXML
    private void zapomnialemHasla() throws IOException {
        
        Stage stage; 
        Parent root;
        stage = (Stage) zapomnialemHasla.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("odzyskiwanieHasla.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    
}
