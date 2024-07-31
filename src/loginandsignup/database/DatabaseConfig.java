package loginandsignup.database;

import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

import loginandsignup.SQLite;
import loginandsignup.UserAuthentication;

public class DatabaseConfig {

 /*   "CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) NOT NULL UNIQUE,
    password_hash VARCHAR(255) NOT NULL
);" */
public static void main(String[] args) {
   // String jdbcURL = "jdbc:h2:.\\src\\loginandsignup\\database\\UserAuth";
   // String USER = "sa";
    //String PASSWORD = "1234";

    try {
      //  Connection connection= DriverManager.getConnection(jdbcURL, USER, PASSWORD);
       // System.out.println("Connected to H2 database");
    //done UserAuthentication.registerUser("Admin1", "StrongPassword123", "admin@kdu.ac.lk");
       UserAuthentication.authenticateUser("StrongPassword123","Admin1" );
      //  UserAuthentication.insertUser("Admin2", "lastname", "Admin2@kdu.ac.lk","StrongPassword123");
        //UserAuthentication.authenticateUser( "StrongPassword123","thasruha@kdu.lk");
       // connection.close();
      // UserAuthentication.settingUpTablesPerUser("Admin2@kdu.ac.lk");
      UserAuthentication.editUserFirstName("Admin2@kdu.ac.lk", "newFirstName");
      // UserAuthentication.setExpenses("Admin2kduaclk", "food", 1760," 2021/20/10", "mytest");
      // AccessOfDatabase.ValueSetterToDatabase.setIncomePerform_h2("thasruhakduu", "ddp", 15000," 2021/20/10", "mytest");
      //  System.out.println(UserAuthentication.getIncomeRecords("thasruhakduu"));
      //System.out.println(  UserAuthentication.getTotalIncome("thasruhakduu"));
     // UserAuthentication authtest = new UserAuthentication();
     // System.out.println(authtest.getIncomeData("thasruhakduu"));
      //AccessOfDatabase.ValueSetterToDatabase.setInvestmentPerform_h2("thasruhakduu@kdu.ac.lk", "ddp", 15000," 2021/20/10", "mytest");
      //AccessOfDatabase.ValueGetterFromElems.
    } catch (SQLException | NoSuchAlgorithmException e) {
        e.printStackTrace();
    }


}
}
