import db.Database;

import java.sql.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Database db = new Database();
        
        ResultSet rs = db.getResults("SELECT * FROM users");

        try {
            db.connect();
            rs = db.getResults("SELECT * FROM users");
            while (rs.next()) {
                System.out.println(rs.getInt(1)); // get uid
                System.out.println(rs.getString(2)); // get username
                System.out.println(rs.getInt(4)); // get balance
            }
            db.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
