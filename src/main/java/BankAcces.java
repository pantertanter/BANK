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
        String username = requestString("Please enter your username"); // Console method to get user input
        db.connect();
        ResultSet rs = db.getResults("SELECT * FROM users WHERE username = '" + username + "'");
        try { // to find a matching user
            while (rs.next()) {
                if (rs.getString(2).equals(username)) {
                    pass(username);
                    return; // Exit without closing db upon user match
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        db.close();
    }

    public void pass(String username) {
        System.out.println("PASSWORD STAGE: " + username);
    }
}
