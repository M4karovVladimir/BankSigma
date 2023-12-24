package Bank;

public class IncomeExpenseItem {
    private String name;
    private double amount;

    public IncomeExpenseItem(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }
}
