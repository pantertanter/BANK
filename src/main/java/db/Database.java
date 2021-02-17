package db;

import java.sql.*;

public class Database {
    private Connection con;
    Statement stmt;
    private ResultSet rs;

    public Database() {
    }

    public void connect(String database, String user, String pass) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/" + database, user, pass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void connect() { // default connection
        connect("c4bank", "root", "mq224jok");
    }

    public void close() {
        try {
            con.close();
            rs.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public ResultSet getResults(String query) {
        stmt = null;
        rs = null;
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rs;
    }
}