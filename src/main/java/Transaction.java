import java.util.Date;

public class Transaction {
    private Account origin;
    private Account destination;
    private int amount;

    public Transaction(int amount, Account account) {
        if (amount > 0) destination = account;
        else origin = account;
        this.amount = Math.abs(amount);
    }
    public Transaction(int amount, Account origin, Account destination) {
        this.amount = Math.abs(amount);
        this.origin = origin;
        this.destination = destination;
    }

    public int getAmount() {
        return amount;
    }

    public Account getOrigin() {
        return origin;
    }

    public Account getDestination() {
        return destination;
    }
}
