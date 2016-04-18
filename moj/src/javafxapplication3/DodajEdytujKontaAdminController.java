
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
import javafx.scene.control.MenuButton;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author sony vaio
 */
public class DodajEdytujKontaAdminController implements Initializable {

    @FXML
    private TextField email;
    @FXML
    private TextField nazwisko;
    @FXML
    private TextField imie;
    @FXML
    private PasswordField password;
    @FXML
    private Button wyloguj;
    @FXML
    private Button zapiszZmiany;
    @FXML
    private Button wstecz;
    @FXML
    private MenuButton ranga;
    @FXML
    private TableView<?> konta;
    @FXML
    private ScrollBar scroll;
    @FXML
    private Button edytuj;
    @FXML
    private Button dodaj;
    
    @FXML
    private void wyloguj() throws IOException {
        
        Stage stage; 
        Parent root;
        stage = (Stage) wyloguj.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("logowanie.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    private void wstecz() throws IOException {
        
        Stage stage; 
        Parent root;
        stage = (Stage) wstecz.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("panelAdmin.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void wyloguj(ActionEvent event) {
    }
    
}
