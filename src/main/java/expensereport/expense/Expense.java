package expensereport.expense;

import expensereport.money.Penny;

public interface Expense {

    String getName();

    Penny getAmount();

    Penny getMealAmount();

    boolean isMarker();
}
