import java.sql.*;

public class Database {
    private Connection con;
    private Statement stmt;
    private ResultSet rs;

    public Database() {
    }

    public void connect() { // default connection
        connect("c4bank", "bank", "c4c4c4");
    }

    public void connect(String database, String user, String pass) { // Connect to database
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/" + database, user, pass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        System.out.println("db open.");
    }

    public void close() { // Close database connection
        try {
            con.close();
            rs.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        System.out.println("db closed.");
    }

    public ResultSet getResults() { // Get the last ResultSet generated.
        return rs;
    }

    public ResultSet getResults(String query) { // Generate and get a new ResultSet
        genResults(query);
        return rs;
    }

    public void genResults(String query) { // Generate a new ResultSet
        stmt = null;
        rs = null;
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void insertTransaction(Transaction transaction) {
        stmt = null;
        try {
            stmt = con.createStatement();
            stmt.execute(getTransactionInsertStatement(transaction));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public String getTransactionInsertStatement(Transaction transaction) {
        boolean originExist = transaction.getOrigin() != null;
        boolean destinationExist = transaction.getDestination() != null;
        StringBuilder sql = new StringBuilder("INSERT INTO transactions (amount, ");
        if (originExist) sql.append("origin");
        if (originExist && destinationExist) sql.append(", ");
        if (destinationExist) sql.append("destination");
        sql.append("VALUES (");
        sql.append(transaction.getAmount());
        sql.append(", ");
        if (originExist) sql.append(transaction.getOrigin());
        if (originExist && destinationExist) sql.append(", ");
        if (destinationExist) sql.append(transaction.getDestination());
        sql.append(");");
        return sql.toString();
    }
}