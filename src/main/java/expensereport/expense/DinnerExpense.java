package expensereport.expense;

import expensereport.money.Penny;

public class DinnerExpense implements Expense {

    private static final int OVER_AMOUT = 5000;
    private Penny amount;

    public DinnerExpense(int amount) {
        this.amount = new Penny(amount);
    }

    @Override
    public String getName() {
        return "Dinner";
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
        return amount.getPennies() > OVER_AMOUT;
    }
}
