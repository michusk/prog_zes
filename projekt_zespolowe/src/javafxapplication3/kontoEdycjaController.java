/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication3;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.apache.commons.dbutils.DbUtils;

/**
 * FXML Controller class
 *
 * @author sony vaio
 */
public class kontoEdycjaController implements Initializable {

    @FXML
    private Button wstecz;
    @FXML
    private Button zapiszZmiany;
    @FXML
    private Button wyloguj;
    @FXML
    private PasswordField passwordtb;
    @FXML
    private TextField imietb;
    @FXML
    private TextField nazwiskotb;
    @FXML
    private TextField emailtb;
    @FXML
    private TextField adrestb;
    @FXML
    private TextField telefontb;
    
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
        root = FXMLLoader.load(getClass().getResource("kontoWidok.fxml"));
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
    private void zapiszzmiany(ActionEvent event) {
         Connection connection = null;
        try {
            connection = new Driver().getConnection();
            Statement statement = null;
            String login = FXMLDocumentController.log;
            String insertTableSQL = "UPDATE uzytkownicy" + " set Imie ='"+imietb.getText()+"', Nazwisko ='"+nazwiskotb.getText()+"', Email ='"+ emailtb.getText()+"', Haslo ='"+passwordtb.getText()+"', Telefon ='"+telefontb.getText()+"', Adres ='"+adrestb.getText()+"'" + " where " + "Email ='"+ login +"'";
				//+ "(Imie, Nazwisko, Email, Haslo, Telefon, Adres) " + "VALUES "
				//+ "('"+imietb.getText()+"', '"+nazwiskotb.getText()+"', '"+ emailtb.getText()+"', '"+passwordtb.getText()+"', '"+telefontb.getText()+"', '"+adrestb.getText()+"') ";
            statement = connection.createStatement();
            statement.executeUpdate(insertTableSQL);
            //ResultSet  rs = statement.executeUpdate(insertTableSQL);
           // int zetem = statement.executeUpdate(insertTableSQL);
           // System.out.println("numberOfRowsUpdated=" + zetem);
           //rs.next();
            
            
            //PreparedStatement preparedStatement = connection.prepareStatement("insert into uzytkownicy"+" (Imie, Nazwisko, Email, Adres, Telefon, Haslo) values"+ "(q, w, e, r, 4, y);");
//            preparedStatement.setString(1, imietb.getText());
//            preparedStatement.setString(2, nazwiskotb.getText());
//            preparedStatement.setString(3, emailtb.getText());
//            preparedStatement.setString(4, adrestb.getText());
//            preparedStatement.setString(5, telefontb.getText());
//            preparedStatement.setString(6, passwordtb.getText());
//preparedStatement .executeUpdate();
           // ResultSet rs = preparedStatement.executeQuery();
           
    }
        catch (SQLException ex) {
           new Alert(Alert.AlertType.WARNING,"Problem z bazą").show();
           ex.printStackTrace();
        } finally {
            DbUtils.closeQuietly(connection);
        }}}
    

    