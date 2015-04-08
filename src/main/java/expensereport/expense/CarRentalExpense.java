package expensereport.expense;

import expensereport.money.Penny;

public class CarRentalExpense implements Expense {

    private Penny amount;

    public CarRentalExpense(int amount) {
        this.amount = new Penny(amount);
    }

    @Override
    public String getName() {
        return "Car Rental";
    }

    @Override
    public Penny getAmount() {
        return amount;
    }

    @Override
    public Penny getMealAmount() {
        return new Penny();
    }

    @Override
    public boolean isMarker() {
        return false;
    }
}
