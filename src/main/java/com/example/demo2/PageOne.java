package com.example.demo2;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class PageOne implements Initializable {
    @FXML
    public Label usernameText;

    public void setUsers() {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        setUsers();
    }
    @FXML
    protected void clickButtonNewChet() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("bank.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 580, 440);
        stage.setTitle("Bank");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected  void clickButtonNewDoxod() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("statistics.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 580, 440);
        stage.setTitle("Statistic");
        stage.setScene(scene);
        stage.show();

    }
    @FXML
    protected  void clickButtonNewStatistic() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("grafic.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 580, 440);
        stage.setTitle("Graphics");
        stage.setScene(scene);
        stage.show();
    }
}
