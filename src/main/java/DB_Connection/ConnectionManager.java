package DB_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectionManager {

    public Connection connection;
    public Statement statement;

    public ConnectionManager() {
        String urlString = "jdbc:mysql:///<Database_Name>";
        final String username = "root";
        final String password = "<Password>";

        try {
            // 1. Register the Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2. Create Connection
            connection = DriverManager.getConnection(urlString, username, password);
            // 3. Create statement
            statement = connection.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
