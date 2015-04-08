package expensereport.money;

/**
 * Created by Bill Minwook Heo on 15. 4. 8..
 */
public class Penny {
    private int amount;

    public Penny() {
        this.amount = 0;
    }

    public Penny(int amount) {
        this.amount = amount;
    }

    public void addPennies(int added) {
        amount += added;
    }

    public int getPennies() {
        return amount;
    }

    public double getDollar() {
        return amount / 100d;
    }
}
