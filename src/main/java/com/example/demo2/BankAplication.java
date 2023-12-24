package com.example.demo2;

import Bank.BankAccount;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class BankAplication {

    @FXML
    private Button buttonBalance;
    @FXML
    private TextField textFieldBalance;
    @FXML
    private TextField textFieldNumberAccount;

    @FXML
    protected void addBalance() throws IOException {
        BankAccount bankAccount = new BankAccount(textFieldBalance.getText(), textFieldNumberAccount.getText());
        System.out.println("Баланс создан");
        entry();
        System.out.println("Баланс сохранен");

    }
    public void entry() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("pageOne.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 580, 440);
        stage.setScene(scene);
        stage.show();
    }

}

