package db;

// Modify to create connection on first call
public class Connection {
    public static Connection thisConnection = new Connection();
    private Connection() {
        getConnection();
    }
    public static Connection getConnection() {
        return thisConnection;
    }
}
