import console.Console;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DbAcces extends Console {
    Database db;
    Account account;
    Account target;

    public DbAcces(boolean start) {
        super();
        db = new Database();
        if (start) start();
    }

    public void start() {
        String name = requestString("Please enter your name or type 'q' to quit");
        if (!name.equals("q")) account = getAccountByName(name);
    }

    public Account getAccountByName(String customerName) {
        Account dba = null;
        db.connect();
        ResultSet dbAccount = db.getResults("SELECT * FROM accounts WHERE customer = '" + customerName + "'");
        try {
            if (dbAccount.next() && dbAccount.getString("customer").equals(customerName)) {
                dba = new Account(new Customer(customerName));
                dba.setId(dbAccount.getInt("uid"));
                ResultSet dbCustomer = db.getResults("SELECT * FROM customers WHERE name = '" + customerName + "'");
                if (dbCustomer.next() && dbCustomer.getString("name").equals(customerName)) {
                    dba.getCustomer().setId(dbCustomer.getInt("cid"));
                } else System.out.println("No customer match.");
            } else System.out.println("No account match.");
        } catch (
                SQLException throwables) {
            throwables.printStackTrace();
        }
        db.close();
        return dba;
    }

    public void printAccountData(Account dba) {
        System.out.println("Account loaded from database: " +
                "  uid: " + dba.getId() +
                "  customer: " + dba.getCustomer().getName() +
                "  cid: " + dba.getCustomer().getId());
        start();
    }
}
