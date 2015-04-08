package expensereport;

import java.util.ArrayList;
import java.util.List;

import expensereport.expense.Expense;


public class ExpenseReport {
    private List<Expense> expenses = new ArrayList<Expense>();

    public void printReport(ReportPrinter printer) {

        ReportBuilder reportBuilder = new ReportBuilder();

        for (Expense expense : expenses) {
            reportBuilder.addExpense(expense);
        }

        reportBuilder.build(printer);
    }


    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

}