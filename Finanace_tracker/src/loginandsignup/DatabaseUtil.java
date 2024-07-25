package loginandsignup;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {
    //private static final String URL = "jdbc:h2:~\\database\\userAuthH2.db";
   // private static final String URL = "jdbc:h2:~/test";
    private static final String URL ="jdbc:h2:.\\src\\loginandsignup\\database\\UserAuth";
    private static final String USER = "sa";
    private static final String PASSWORD = "1234";

    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}



