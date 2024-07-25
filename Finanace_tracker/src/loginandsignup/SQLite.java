
package loginandsignup;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;



public class SQLite {
    public static String jdbcUrl = "jdbc:sqlite:C:\\Users\\ASUS\\OneDrive - General Sir John Kotelawala Defence University\\Documents\\NetBeansProjects\\Finanace_tracker\\src\\loginandsignup\\database\\userPasswords.db";

    
    static boolean userAuthentication(String username, String password) {
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
                    return false;
                }
            } else {
                System.out.println("User not found");//change this to "Incorrect username or password" in production
                return false;
            }

        } 
        catch (ClassNotFoundException e) {
            System.out.println("SQLite JDBC driver not found");
            e.printStackTrace();
            return false;
        } 
        catch (SQLException e) {
            System.out.println("Error connecting to database");
            e.printStackTrace(); // remove this line in production
            return false;
        }
    }
     
    // Method to insert income into the database
    public static void setIncome(String incomeType, double incomeAmount, String dateChooser, String note) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            // Load SQLite JDBC driver
            Class.forName("org.sqlite.JDBC");

            // Establish database connection
            connection = DriverManager.getConnection(jdbcUrl);
            System.out.println("Connected to database");

            // SQL statement to insert income record
            String sql = "INSERT INTO setIncome (income_type, income_amount, date_chooser, note) VALUES (?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(sql);

            // Set values for the placeholders
            preparedStatement.setString(1, incomeType);
            preparedStatement.setDouble(2, incomeAmount);
            preparedStatement.setString(3, dateChooser);
            preparedStatement.setString(4, note);

            // Execute the insert statement
            preparedStatement.executeUpdate();
            System.out.println("Income record inserted successfully");

        } catch (ClassNotFoundException e) {
            System.out.println("SQLite JDBC driver not found");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error connecting to database");
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    // Method to insert expense into the database
    public static void setExpense(String expenseType, double expenseAmount, String dateChooser, String note) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            // Load SQLite JDBC driver
            Class.forName("org.sqlite.JDBC");

            // Establish database connection
            connection = DriverManager.getConnection(jdbcUrl);
            System.out.println("Connected to database");

            // SQL statement to insert income record
            String sql = "INSERT INTO setExpense (expense_type, expense_amount, date_chooser, note) VALUES (?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(sql);

            // Set values for the placeholders
            preparedStatement.setString(1, expenseType);
            preparedStatement.setDouble(2, expenseAmount);
            preparedStatement.setString(3, dateChooser);
            preparedStatement.setString(4, note);
   
            // Execute the insert statement
            preparedStatement.executeUpdate();
            System.out.println("Income record inserted successfully");

        } catch (ClassNotFoundException e) {
            System.out.println("SQLite JDBC driver not found");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error connecting to database");
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    // Method to insert a goal into the database
    public static void setIncomeGoal(double incomeGoalAmount, Date startDate, Date endDate) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            // Load SQLite JDBC driver
            Class.forName("org.sqlite.JDBC");

            // Establish database connection
            connection = DriverManager.getConnection(jdbcUrl);
            System.out.println("Connected to database");

            // SQL statement to insert goal record
            String sql = "INSERT INTO IncomeGoal (goal_amount, start_date, end_date) VALUES (?, ?, ?)";
            preparedStatement = connection.prepareStatement(sql);

            // Set values for the placeholders
            preparedStatement.setDouble(1, incomeGoalAmount);
            preparedStatement.setDate(2, (java.sql.Date) startDate);
            preparedStatement.setDate(3, (java.sql.Date) endDate);

            // Execute the insert statement
            preparedStatement.executeUpdate();
            System.out.println("Goal record inserted successfully");

        } catch (ClassNotFoundException e) {
            System.out.println("SQLite JDBC driver not found");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error connecting to database");
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
   // Method to insert a goal into the database
    public static void setExpenseGoal(double expenseGoalAmount, Date startDate, Date endDate) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            // Load SQLite JDBC driver
            Class.forName("org.sqlite.JDBC");

            // Establish database connection
            connection = DriverManager.getConnection(jdbcUrl);
            System.out.println("Connected to database");

            // SQL statement to insert goal record
            String sql = "INSERT INTO expenseGoals (goal_amount, start_date, end_date) VALUES (?, ?, ?)";
            preparedStatement = connection.prepareStatement(sql);

            // Set values for the placeholders
            preparedStatement.setDouble(1, expenseGoalAmount);
            preparedStatement.setDate(2, new java.sql.Date(startDate.getTime()));
            preparedStatement.setDate(3, new java.sql.Date(endDate.getTime()));

            // Execute the insert statement
            preparedStatement.executeUpdate();
            System.out.println("Expense goal record inserted successfully");

        } catch (ClassNotFoundException e) {
            System.out.println("SQLite JDBC driver not found");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error connecting to database");
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
