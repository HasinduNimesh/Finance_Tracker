package loginandsignup.database;

import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

import loginandsignup.UserAuthentication;

public class DatabaseConfig {

 /*   "CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) NOT NULL UNIQUE,
    password_hash VARCHAR(255) NOT NULL
);" */
public static void main(String[] args) {
 //   String jdbcURL = "jdbc:h2:.\\src\\loginandsignup\\database\\UserAuth";
   //String USER = "sa";
   /// String PASSWORD = "1234";

    try {
      //  Connection connection= DriverManager.getConnection(jdbcURL, USER, PASSWORD);
     System.out.println("Connected to H2 database");
     System.out.println(UserAuthentication.getUserFullName("Admin1"));
     //UserAuthentication.insertUser("Admin1","Lastname", "Admin1", "StrongPassword123");
        UserAuthentication.authenticateUser("Admin", "StrongPassword123");

       // connection.close();

    } catch (SQLException | NoSuchAlgorithmException e) {
        e.printStackTrace();
    }


}
}
 
