package db;

import java.sql.*;

public class Database {
    Connection con;
    public Database() {
    }
    private void connect(String database, String user, String pass) {
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
    public ResultSet getResults(String query) {
        connect("c4bank", "root", "mq224jok");
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rs;
    }
}