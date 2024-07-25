package AccessOfDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import loginandsignup.DatabaseUtil;

public class UserDetailsManager {

    public static boolean createUserDetailsTable(int userId) throws SQLException {
        try (Connection conn = DatabaseUtil.getConnection()) {
            String query = "CREATE TABLE user_details_" + userId + " (" +
                    "detail_id INT AUTO_INCREMENT PRIMARY KEY," +
                    "detail_type VARCHAR(255) NOT NULL," +
                    "amount DECIMAL(10, 2) NOT NULL," +
                    "date TIMESTAMP DEFAULT CURRENT_TIMESTAMP" +
                    ")";
            PreparedStatement stmt = conn.prepareStatement(query);
            return stmt.execute();
        }
    }

    public static boolean addUserDetail(int userId, String detailType, double amount) throws SQLException {
        try (Connection conn = DatabaseUtil.getConnection()) {
            String query = "INSERT INTO user_details_" + userId + " (detail_type, amount) VALUES (?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, detailType);
            stmt.setDouble(2, amount);
            return stmt.executeUpdate() > 0;
        }
    }

    // Additional methods for fetching and updating user details can be added here
}
