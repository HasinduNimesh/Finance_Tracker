package loginandsignup;

import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TableUpdate {
    //Method to insert income into the database
    public static void setIncome(String email,String incomeType, double incomeAmount, String dateChooser, String note) {
        
        String insertQuery = "INSERT INTO  "+email+"_income(income_type, income_amount, income_date, income_note) VALUES VALUES (?, ?, ?, ?)";
         try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(insertQuery)) {
            
            stmt.setString(1, incomeType);
          //  stmt.setString(2, incomeAmount);
            stmt.setString(3, email);
            stmt.setString(4, dateChooser);
            stmt.executeUpdate();
            System.out.println("User inserted successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }




}
