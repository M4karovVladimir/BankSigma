package com.example.demo2;

import Bank.IncomeExpenseItem;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class StatisticalFinanceConroller {
    @FXML
    private BarChart<String, Number> barChart;
    @FXML
    private TextField itemName;
    @FXML
    private TextField itemAmount;

    private ObservableList <XYChart.Series<String, Number>> data = FXCollections.observableArrayList();

    private ArrayList<IncomeExpenseItem> incomeExpenseItems = new ArrayList<>();
    private ArrayList<IncomeExpenseItem> incomeItems = new ArrayList<>();

    @FXML
    private void updateButtonAction(){
        data.clear();
        XYChart.Series<String, Number> incomeSerias = new XYChart.Series<>();
        incomeSerias.setName("Доходы");

        for (IncomeExpenseItem item : incomeItems){
            incomeSerias.getData().add(new XYChart.Data<>(item.getName(), item.getAmount()));
        }
        XYChart.Series<String, Number> incomeSeriasExpense = new XYChart.Series<>();
        incomeSeriasExpense.setName("Расходы");
        for (IncomeExpenseItem item : incomeExpenseItems){
            incomeSeriasExpense.getData().add(new XYChart.Data<>(item.getName(), item.getAmount()));
        }
        data.add(incomeSerias);
        data.add(incomeSeriasExpense);
        barChart.setData(data);

    }
    @FXML
    private  void  addItemButtonAction(){
        String name = itemName.getText();
        double amount = Double.parseDouble(itemAmount.getText());
        IncomeExpenseItem incomeItem = new IncomeExpenseItem(name, amount);
        incomeItems.add(incomeItem);
        updateButtonAction();
    }
    @FXML
    private void addExpenseButtonAction(){
        String name = itemName.getText();
        double amount = Double.parseDouble(itemAmount.getText());
        IncomeExpenseItem expenseItem = new IncomeExpenseItem(name, amount);
        incomeExpenseItems.add(expenseItem);
        updateButtonAction();
    }

    @FXML
    private void removeItemButtonAction() {
        String remuve = itemName.getText();
        incomeItems.removeIf(item -> item.getName().equals(remuve));
        incomeExpenseItems.removeIf(item -> item.getName().equals(remuve));
        updateButtonAction();
    }
}
