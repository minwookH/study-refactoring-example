package expensereport.expense;

import expensereport.money.Penny;

public class BreakfastExpense implements Expense {

    private static final int OVER_AMOUNT = 1000;
    private Penny amount;

    public BreakfastExpense(int amount) {
        this.amount = new Penny(amount);
    }

    @Override
    public String getName() {
        return "Breakfast";
    }

    @Override
    public Penny getAmount() {
        return amount;
    }

    @Override
    public Penny getMealAmount() {
        return amount;
    }

    @Override
    public boolean isMarker() {
        return amount.getPennies() > OVER_AMOUNT;
    }
}
