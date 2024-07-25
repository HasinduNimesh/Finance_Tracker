package loginandsignup;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserAuthentication {

    public static String hashPassword(String password) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hash = md.digest(password.getBytes());
        StringBuilder hexString = new StringBuilder();
        for (byte b : hash) {
            hexString.append(String.format("%02x", b));
        }
        return hexString.toString();
    }

    public static boolean registerUser( String password, String  email, String f_name, String l_name) throws SQLException, NoSuchAlgorithmException {
        String hashedPassword = hashPassword(password);
        try (Connection conn = DatabaseUtil.getConnection()) {
            String query = "INSERT INTO users (password_hash,email ,f_name ,l_name) VALUES (?, ?,?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, hashedPassword);
            stmt.setString(2, email);
            stmt.setString(3, f_name);
            stmt.setString(4, l_name);


            return stmt.executeUpdate() > 0;
        }
    }

    public static boolean authenticateUser_old(String username, String password) throws SQLException, NoSuchAlgorithmException {
        String hashedPassword = hashPassword(password);
        try (Connection conn = DatabaseUtil.getConnection()) {
            String query = "SELECT * FROM users WHERE username = ? AND password_hash = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, username);
            stmt.setString(2, hashedPassword);
            ResultSet rs = stmt.executeQuery();
            //for defugging
           
            return rs.next();
        }
    }
    public static String authenticateUser( String password,String email) throws SQLException, NoSuchAlgorithmException {
        String hashedPassword = hashPassword(password);
        try (Connection conn = DatabaseUtil.getConnection()) {
            String query = "SELECT username FROM users WHERE email = ? AND password_hash = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, email);
            stmt.setString(2, hashedPassword);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getString("username");
            } else {
                return null;
            }
        }
    }
}
