import db.Database;

import java.sql.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Database db = new Database();
        ResultSet rs = db.getResults("SELECT * FROM users");

        System.out.println("rs");
        MultiUser multiuser = new MultiUser();
        Customer c1 = new Customer(multiuser.UserMenu());
        Account account = new Account(c1);

        int newBalance = account.depositAmount(125);
        System.out.println(String.format("Ny balance: %,d", newBalance));

        newBalance = account.depositAmount(325);
        System.out.println(String.format("Ny balance: %,d", newBalance));

        newBalance = account.depositAmount(2000000);
        System.out.println(String.format("Ny balance: %,d", newBalance));

    }
}
