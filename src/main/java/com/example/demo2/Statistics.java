package com.example.demo2;


import javafx.fxml.FXML;
import javafx.scene.control.TextField;



public class Statistics {
    @FXML
    TextField textFieldDoxod;
    @FXML
    TextField textFieldRasxod;

    private  double totalIncome = 0;
    private  double totalConsumption = 0;

    @FXML
    protected void clickButtonAdd() {
        try {

            double income = Double.parseDouble(textFieldDoxod.getText());
            totalIncome += income;

            double consumption = Double.parseDouble(textFieldRasxod.getText());
            totalConsumption += consumption;
            System.out.println("Доходы: " + totalIncome);
            System.out.println("Расходы: " + totalConsumption);
        }catch (NumberFormatException e){
            System.out.println("Введите числовое значение");
        }

    }


    }

