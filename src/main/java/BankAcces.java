import console.Console;
import db.Database;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BankAcces extends Console {
    Database db;

    public BankAcces(boolean start) {
        super();
        db = new Database();
        if (start) start();
    }

    public void start() {
        login();
    }

    public void login() {
        String username = requestString("Please enter your username");
        db.connect();
        ResultSet rs = db.getResults("SELECT * FROM users WHERE username LIKE '%" + username + "%'");
        while (true) {
            try {
                if (!rs.next()) {
                    System.out.println("No user match");
                    break;
                } else if (rs.getString("username") == username) pass(username);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        db.close();
    }

    public void pass(String username) {
        System.out.println("PASSWORD STAGE: " + username);
    }
}
