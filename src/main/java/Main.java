import db.Database;

import java.sql.*;

public class Main {


    public static void main(String[] args) {
        Database db = new Database();
        MultiUser mu = new MultiUser();
        Boot b = new Boot();


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

    }
}
