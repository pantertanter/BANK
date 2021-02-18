import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {
    private int id;
    private List<Transaction> transactions;
    private Customer customer;

    public Account(Customer customer) {
        this.transactions = new ArrayList<>();
        this.customer = customer;
    }

    public int getBalance() {
        // TODO: skal debugges
        int sum = 0;
        for (Transaction transaction : transactions) {
            sum += transaction.getAmount();
        }
        return sum;
    }

    public int withDrawAmount(int amount) {
        // TODO: skal kodes og returnere ny saldo. Smid fejl hvis amount > saldo
        if (amount > getBalance()) {
            System.out.println("You dont have enough money on your account");

        } else if (amount <= getBalance()) {
            System.out.println("Hævningen er fuldført");
            transactions.add(new Transaction(-amount, new Date()));
        }
        return getBalance();
    }

    public int depositAmount(int amount) {
        // TODO: skal debugges og returnere ny saldo. Smid fejl hvis amount < 0.
        if (amount <= 0) {
            System.out.println("you can only deposit positive amounts!");

        } else if (amount > 0) {
            System.out.println("deposit complete");
            transactions.add(new Transaction(amount, new Date()));
        }

        return getBalance();
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
