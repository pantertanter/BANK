import db.Database;

import java.sql.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Database db = new Database();
<<<<<<< HEAD
        ResultSet rs = db.getResults("SELECT * FROM users");
=======
        try {
            db.connect();
            ResultSet rs = db.getResults("SELECT * FROM users");
            while (rs.next()) {
                System.out.println(rs.getInt(1)); // get uid
                System.out.println(rs.getString(2)); // get username
                System.out.println(rs.getInt(4)); // get balance
            }
            db.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        //Customer c1 = new Customer("Jon");
        /*
>>>>>>> 10d61ba41ae4fe76dab574c14bda4dc4f94b24f7
        MultiUser multiuser = new MultiUser();
        Customer c1 = new Customer(multiuser.UserMenu());
        Account account = new Account(c1);

        int newBalance = account.depositAmount(125);
        System.out.println(String.format("Ny balance: %,d", newBalance));

        newBalance = account.depositAmount(325);
        System.out.println(String.format("Ny balance: %,d", newBalance));

        newBalance = account.depositAmount(2000000);
        System.out.println(String.format("Ny balance: %,d", newBalance));
        */
    }
}
