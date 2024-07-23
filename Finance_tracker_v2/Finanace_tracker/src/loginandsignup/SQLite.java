
package loginandsignup;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class SQLite {
    
     static boolean userAuthentication(String username, String password) {
        String jdbcUrl = "jdbc:sqlite:C:\\Users\\ASUS\\OneDrive - General Sir John Kotelawala Defence University\\Documents\\NetBeansProjects\\Finanace_tracker\\src\\loginandsignup\\databse\\userPasswords.db";
       // String path = System.getProperty("user.dir") + "/src/loginandsignup/database/userPasswords.db";
       // String jdbcUrl = "jdbc:sqlite:" + path;
        String errorMessage="";
        try {
            Class.forName("org.sqlite.JDBC");
            Connection connection = DriverManager.getConnection(jdbcUrl);
            System.out.println("Connected to database");

            String sql = "SELECT * FROM user WHERE name = '" + username + "'";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            if (resultSet.next()) {
                String storedPassword = resultSet.getString("password");
                if (password.equals(storedPassword)) {
                    System.out.println("User Authenticated");
                    return true;
                } else {
                    System.out.println("Incorrect password");//change this to "Incorrect username or password" in production
                    errorMessage="Incorrect user name or password";
                    return false;
                }
            } else {
                System.out.println("User not found");//change this to "Incorrect username or password" in production
                errorMessage="Incorrect user name or password";
                return false;
            }

        } 
        catch (ClassNotFoundException e) {
            System.out.println("SQLite JDBC driver not found");
            e.printStackTrace(); // remove this line in production
            return false;
        } 
        catch (SQLException e) {
            System.out.println("Error connecting to database");
            e.printStackTrace(); // remove this line in production
            errorMessage="Error connecting !! Restart the application or please contact ";
            return false;
        }
    }
}
