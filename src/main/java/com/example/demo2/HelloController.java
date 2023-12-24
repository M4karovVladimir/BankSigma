package com.example.demo2;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private PasswordField passwordField;
    @FXML
    private TextField textField;
    @FXML
    private Button entry;
    @FXML
    private Button registration;
    DBConnector dbConnector = new DBConnector();
    @FXML
    protected void registrationButtonClick() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("registration.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 580, 440);
        stage.setTitle("Registration");
        stage.setScene(scene);
        stage.show();
        passwordField.getScene().getWindow().hide();
    }
    @FXML
    protected void loginButtonClick() throws IOException {
        String login = textField.getText();
        String password = passwordField.getText();
        if(DBConnector.FindUser(login,password) != null){
            entry();
            textField.getScene().getWindow().hide();
        }
    }
    public void entry() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("pageOne.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 580, 440);
        stage.setTitle("Деньгииии");
        stage.setScene(scene);
        stage.show();

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        dbConnector.connect();
    }
}