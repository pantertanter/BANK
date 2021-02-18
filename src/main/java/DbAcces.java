import console.Console;
import db.Database;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DbAcces extends Console {
    Database db;
    Account originAccount;

    public DbAcces(boolean start) {
        super();
        db = new Database();
        if (start) start();
    }

    public void start() {
        originAccount = null;
        login();
    }

    public void login() {
        String customerName = requestString("Please enter your name or type 'q' to quit");
        if (customerName.equals("q")) return;
        db.connect();
        ResultSet dbAccount = db.getResults("SELECT * FROM accounts WHERE customer = '" + customerName + "'");
        try {
            if (dbAccount.next() && dbAccount.getString("customer").equals(customerName)) {
                originAccount = new Account(new Customer(customerName));
                originAccount.setId(dbAccount.getInt("uid"));
                ResultSet dbCustomer = db.getResults("SELECT * FROM customers WHERE name = '" + customerName + "'");
                if (dbCustomer.next() && dbCustomer.getString("name").equals(customerName)) {
                    originAccount.getCustomer().setId(dbCustomer.getInt("cid"));
                } else System.out.println("No customer match.");
                pass(originAccount);
                // return; // Exit without closing db upon user match
            } else System.out.println("No account match.");
        } catch (
                SQLException throwables) {
            throwables.printStackTrace();
        }
        db.close();
    }

    public void pass(Account originAccount) {
        System.out.println("Account loaded from database: " +
                "  uid: " + originAccount.getId() +
                "  customer: " + originAccount.getCustomer().getName() +
                "  cid: " + originAccount.getCustomer().getId());
        login();
    }
}
