package expensereport;

import java.util.ArrayList;
import java.util.List;

import expensereport.expense.Expense;
import expensereport.money.Penny;

/**
 * Created by Bill Minwook Heo on 15. 4. 8..
 */
class ReportBuilder {

    private Penny total = new Penny();
    private Penny mealExpenses = new Penny();
    private List<Expense> expenses = new ArrayList<Expense>();

    ////
    // branch branch//

    public String getDate() {
        return "9/12/2002";
    }

    public String getHeader() {
        StringBuffer buffer = new StringBuffer();
        return buffer.append("Expenses ").append(getDate()).append("\n").toString();
    }

    public String getContent(Expense expense) {

        return String.format("%s\t%s\t$%.02f\n",
                expense.isMarker() ? "X" : " ",
                expense.getName(), expense.getAmount().getDollar());
    }

    public String getMealFooter() {
        return String.format("\nMeal expenses $%.02f", mealExpenses.getDollar());
    }

    public String getTotalFooter() {
        return String.format("\nTotal $%.02f", total.getDollar());
    }

    public void calc(int amount, int mealAmount) {
        total.addPennies(amount);
        mealExpenses.addPennies(mealAmount);
    }

    public void addExpense(Expense expense) {
        this.expenses.add(expense);
    }

    public ReportPrinter build(ReportPrinter printer) {

        printer.print(getHeader());
        for (Expense expense : expenses) {
            printer.print(getContent(expense));
            calc(expense.getAmount().getPennies(), expense.getMealAmount().getPennies());

        }
        printer.print(getMealFooter());
        printer.print(getTotalFooter());

        return printer;
    }
}
