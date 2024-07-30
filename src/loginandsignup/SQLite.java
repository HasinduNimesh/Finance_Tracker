
package loginandsignup;
import java.awt.Color;
import records.IncomeRecord;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javaswingdev.chart.ModelPieChart;
import records.ExpenseRecord;
import records.InvestmentRecord;



public class SQLite {
    public static String jdbcUrlLogin = "jdbc:sqlite:C:\\Users\\ASUS\\OneDrive - General Sir John Kotelawala Defence University\\Documents\\NetBeansProjects\\Finanace_tracker\\src\\loginandsignup\\database\\userPasswords.db";
  //  public static String jdbcUrl = "jdbc:sqlite:/E:/Gitrep/Finance_Tracker/src/loginandsignup/database/userDetailDatabase.db";
    public static String jdbcUrl = "jdbc:sqlite:./src/loginandsignup/database/userDetailDatabase.db";

    
    static boolean userAuthentication(String username, String password) {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection connection = DriverManager.getConnection(jdbcUrlLogin);
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
    
      // Method to insert a new user into the database
    static boolean insertUser(String fName, String lName, String email, String password) {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection connection = DriverManager.getConnection(jdbcUrlLogin);
            System.out.println("Connected to database");

            String sql = "INSERT INTO signup_user (fName, lName, email, password) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, fName);
            preparedStatement.setString(2, lName);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, password);

            int rowsAffected = preparedStatement.executeUpdate();

            connection.close();

            if (rowsAffected > 0) {
                System.out.println("User inserted successfully");
                return true;
            } else {
                System.out.println("Failed to insert user");
                return false;
            }

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC driver not found");
            e.printStackTrace();
            return false;
        } catch (SQLException e) {
            System.out.println("Error connecting to database");
            e.printStackTrace(); // remove this line in production
            return false;
        }
    }
     
    // Method to insert income into the database  //!replacing this
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
    
    // Method to insert investment into the database
    public static void setInvestment(String investmentType, double investmentAmount, String dateChooser, String note) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            // Load SQLite JDBC driver
            Class.forName("org.sqlite.JDBC");

             // Establish database connection
             connection = DriverManager.getConnection(jdbcUrl);
            System.out.println("Connected to database");

            // SQL statement to insert investment record
            String sql = "INSERT INTO setInvestment (investment_type, investment_amount, date_chooser, note) VALUES (?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(sql);

             // Set values for the placeholders
            preparedStatement.setString(1, investmentType);
            preparedStatement.setDouble(2, investmentAmount);
            preparedStatement.setString(3, dateChooser);
            preparedStatement.setString(4, note);

            // Execute the insert statement
            preparedStatement.executeUpdate();
            System.out.println("Investment record inserted successfully");

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
    public static void setIncomeGoal(double incomeGoalAmount, String startDate, String endDate) {
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
            preparedStatement.setString(2, startDate);
            preparedStatement.setString(3, endDate);

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
    public static void setExpenseGoal(double expenseGoalAmount, String startDate, String endDate) {
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
            preparedStatement.setString(2, startDate);
            preparedStatement.setString(3, endDate);

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
    
    // Method to view income records
    public static void viewIncome() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Load SQLite JDBC driver
            Class.forName("org.sqlite.JDBC");

            // Establish database connection
            connection = DriverManager.getConnection(jdbcUrl);
            System.out.println("Connected to database");

            // SQL statement to retrieve income records
            String sql = "SELECT * FROM income";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            // Process the result set
            while (resultSet.next()) {
                String incomeType = resultSet.getString("income_type");
                double incomeAmount = resultSet.getDouble("income_amount");
                String dateChooser = resultSet.getString("date_chooser");
                String note = resultSet.getString("note");

                // Display the income record
                System.out.println("Income Type: " + incomeType);
                System.out.println("Income Amount: " + incomeAmount);
                System.out.println("Date: " + dateChooser);
                System.out.println("Note: " + note);
                System.out.println("------------------------------");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("SQLite JDBC driver not found");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error connecting to database");
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    // Method to retrieve income records to table
    public static List<IncomeRecord> getIncomeRecords() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        List<IncomeRecord> incomeRecords = new ArrayList<>();

        try {
            // Load SQLite JDBC driver
            Class.forName("org.sqlite.JDBC");

            // Establish database connection
            connection = DriverManager.getConnection(jdbcUrl);
            System.out.println("Connected to database");

            // SQL statement to retrieve income records
            String sql = "SELECT * FROM setIncome";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            // Process the result set
            while (resultSet.next()) {
                int id = resultSet.getInt("Index"); // Primary key
                String incomeType = resultSet.getString("income_type");
                double incomeAmount = resultSet.getDouble("income_amount");
                String dateChooser = resultSet.getString("date_chooser");
                String note = resultSet.getString("note");

                incomeRecords.add(new IncomeRecord(id, incomeType, incomeAmount, dateChooser, note));
            }

        } catch (ClassNotFoundException e) {
            System.out.println("SQLite JDBC driver not found");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error connecting to database");
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return incomeRecords;
    }
        
         public static List<ExpenseRecord> getExpenseRecords() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        List<ExpenseRecord> expenseRecords = new ArrayList<>();

        try {
            // Load SQLite JDBC driver
            Class.forName("org.sqlite.JDBC");

            // Establish database connection
            connection = DriverManager.getConnection(jdbcUrl);
            System.out.println("Connected to database");
            
            String sql = "SELECT * FROM setExpense";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("Index");
                String expenseType = resultSet.getString("expense_type");
                double expenseAmount = resultSet.getDouble("expense_amount");
                String dateChooser = resultSet.getString("date_chooser");
                String note = resultSet.getString("note");

                expenseRecords.add(new ExpenseRecord(id, expenseType, expenseAmount, dateChooser, note));
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return expenseRecords;
    }
         
         // Method to retrieve investment records to table
        public static List<InvestmentRecord> getInvestmentRecords() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        List<InvestmentRecord> investmentRecords = new ArrayList<>();

        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection(jdbcUrl);
            String sql = "SELECT * FROM setInvestment"; // Updated table name
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int index = resultSet.getInt("Index"); // Updated column name
                String investmentType = resultSet.getString("investment_type");
                double investmentAmount = resultSet.getDouble("investment_amount");
                String dateChooser = resultSet.getString("date_chooser");
                String note = resultSet.getString("note");

                investmentRecords.add(new InvestmentRecord(index, investmentType, investmentAmount, dateChooser, note));
            }
        } catch (ClassNotFoundException e) {
            System.out.println("SQLite JDBC driver not found");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error connecting to database");
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return investmentRecords;
    }

    // Method to view expense records
    public static void viewExpense() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Load SQLite JDBC driver
            Class.forName("org.sqlite.JDBC");

            // Establish database connection
            connection = DriverManager.getConnection(jdbcUrl);
            System.out.println("Connected to database");

            // SQL statement to retrieve expense records
            String sql = "SELECT * FROM expense";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            // Process the result set
            while (resultSet.next()) {
                String expenseType = resultSet.getString("expense_type");
                double expenseAmount = resultSet.getDouble("expense_amount");
                String dateChooser = resultSet.getString("date_chooser");
                String note = resultSet.getString("note");

                // Display the expense record
                System.out.println("Expense Type: " + expenseType);
                System.out.println("Expense Amount: " + expenseAmount);
                System.out.println("Date: " + dateChooser);
                System.out.println("Note: " + note);
                System.out.println("------------------------------");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("SQLite JDBC driver not found");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error connecting to database");
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    // Method to view income goals
    public static void viewIncomeGoals() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Load SQLite JDBC driver
            Class.forName("org.sqlite.JDBC");

            // Establish database connection
            connection = DriverManager.getConnection(jdbcUrl);
            System.out.println("Connected to database");

            // SQL statement to retrieve income goal records
            String sql = "SELECT * FROM income_goals";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            // Process the result set
            while (resultSet.next()) {
                double goalAmount = resultSet.getDouble("goal_amount");
                String startDate = resultSet.getString("start_date");
                String endDate = resultSet.getString("end_date");

                // Display the income goal record
                System.out.println("Goal Amount: " + goalAmount);
                System.out.println("Start Date: " + startDate);
                System.out.println("End Date: " + endDate);
                System.out.println("------------------------------");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("SQLite JDBC driver not found");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error connecting to database");
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    // Method to view expense goals
    public static void viewExpenseGoals() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Load SQLite JDBC driver
            Class.forName("org.sqlite.JDBC");

            // Establish database connection
            connection = DriverManager.getConnection(jdbcUrl);
            System.out.println("Connected to database");

            // SQL statement to retrieve expense goal records
            String sql = "SELECT * FROM expense_goals";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            // Process the result set
            while (resultSet.next()) {
                double goalAmount = resultSet.getDouble("goal_amount");
                String startDate = resultSet.getString("start_date");
                String endDate = resultSet.getString("end_date");

                // Display the expense goal record
                System.out.println("Goal Amount: " + goalAmount);
                System.out.println("Start Date: " + startDate);
                System.out.println("End Date: " + endDate);
                System.out.println("------------------------------");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("SQLite JDBC driver not found");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error connecting to database");
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    


   // get total for the dashboard 
    // Method to get total income
public static double getTotalIncome() {
    double totalIncome = 0.0;
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

    try {
        // Load SQLite JDBC driver
        Class.forName("org.sqlite.JDBC");

        // Establish database connection
        connection = DriverManager.getConnection(jdbcUrl);
        System.out.println("Connected to database");

        // SQL statement to get total income
        String sql = "SELECT SUM(income_amount) AS total_income FROM setIncome";
        statement = connection.createStatement();
        resultSet = statement.executeQuery(sql);

        if (resultSet.next()) {
            totalIncome = resultSet.getDouble("total_income");
        }

    } catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
    } finally {
        // Close resources
        try {
            if (resultSet != null) resultSet.close();
            if (statement != null) statement.close();
            if (connection != null) connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return totalIncome;
}

// Method to get total expense
public static double getTotalExpense() {
    double totalExpense = 0.0;
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

    try {
        // Load SQLite JDBC driver
        Class.forName("org.sqlite.JDBC");

        // Establish database connection
        connection = DriverManager.getConnection(jdbcUrl);
        System.out.println("Connected to database");

        // SQL statement to get total expense
        String sql = "SELECT SUM(expense_amount) AS total_expense FROM setExpense";
        statement = connection.createStatement();
        resultSet = statement.executeQuery(sql);

        if (resultSet.next()) {
            totalExpense = resultSet.getDouble("total_expense");
        }

    } catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
    } finally {
        // Close resources
        try {
            if (resultSet != null) resultSet.close();
            if (statement != null) statement.close();
            if (connection != null) connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return totalExpense;
}

// Method to get total income goals
public static double getTotalIncomeGoals() {
    double totalIncomeGoals = 0.0;
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

    try {
        // Load SQLite JDBC driver
        Class.forName("org.sqlite.JDBC");

        // Establish database connection
        connection = DriverManager.getConnection(jdbcUrl);
        System.out.println("Connected to database");

        // SQL statement to get total income goals
        String sql = "SELECT SUM(goal_amount) AS total_income_goals FROM IncomeGoal";
        statement = connection.createStatement();
        resultSet = statement.executeQuery(sql);

        if (resultSet.next()) {
            totalIncomeGoals = resultSet.getDouble("total_income_goals");
        }

    } catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
    } finally {
        // Close resources
        try {
            if (resultSet != null) resultSet.close();
            if (statement != null) statement.close();
            if (connection != null) connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return totalIncomeGoals;
}

// Method to get total expense goals
public static double getTotalExpenseGoals() {
    double totalExpenseGoals = 0.0;
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

    try {
        // Load SQLite JDBC driver
        Class.forName("org.sqlite.JDBC");

        // Establish database connection
        connection = DriverManager.getConnection(jdbcUrl);
        System.out.println("Connected to database");

        // SQL statement to get total expense goals
        String sql = "SELECT SUM(goal_amount) AS total_expense_goals FROM expenseGoals";
        statement = connection.createStatement();
        resultSet = statement.executeQuery(sql);

        if (resultSet.next()) {
            totalExpenseGoals = resultSet.getDouble("total_expense_goals");
        }

    } catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
    } finally {
        // Close resources
        try {
            if (resultSet != null) resultSet.close();
            if (statement != null) statement.close();
            if (connection != null) connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return totalExpenseGoals;
}
//total investment
public static double getTotalInvestment() {
    double totalInvestment = 0.0;
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

    try {
        // Load SQLite JDBC driver
        Class.forName("org.sqlite.JDBC");

        // Establish database connection
        connection = DriverManager.getConnection(jdbcUrl);
        System.out.println("Connected to database");

        // SQL statement to get total investment
        String sql = "SELECT SUM(investment_amount) AS total_investment FROM setInvestment";
        statement = connection.createStatement();
        resultSet = statement.executeQuery(sql);

        if (resultSet.next()) {
            totalInvestment = resultSet.getDouble("total_investment");
        }

    } catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
    } finally {
        // Close resources
        try {
            if (resultSet != null) resultSet.close();
            if (statement != null) statement.close();
            if (connection != null) connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return totalInvestment;
}



    //value passing for pie chart
    public List<ModelPieChart> getIncomeData() {
        List<ModelPieChart> data = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(jdbcUrl);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT income_type, SUM(income_amount) AS total_income FROM setIncome GROUP BY income_type")) {

            while (resultSet.next()) {
                String type = resultSet.getString("income_type");
                double amount = resultSet.getDouble("total_income");
                Color color = getRandomColor(); // Generate random colors or use predefined colors

                data.add(new ModelPieChart(type, amount, color));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return data;
    }
    
    public List<ModelPieChart> getExpenseData() {
        List<ModelPieChart> data = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(jdbcUrl);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT expense_type, SUM(expense_amount) AS total_expense FROM setExpense GROUP BY expense_type")) {

            while (resultSet.next()) {
                String type = resultSet.getString("expense_type");
                double amount = resultSet.getDouble("total_expense");
                Color color = getRandomColor(); // Generate random colors or use predefined colors

                data.add(new ModelPieChart(type, amount, color));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return data;
    }
    //color returner
     private Color getRandomColor() {
        // Generate a random color
        int r = (int) (Math.random() * 256);
        int g = (int) (Math.random() * 256);
        int b = (int) (Math.random() * 256);
        return new Color(r, g, b);
    }
     
   public static void updateCurrencyOfFirstIndex(String newCurrency) {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    boolean success = false;

    try {
        // Load SQLite JDBC driver
        Class.forName("org.sqlite.JDBC");

        // Establish database connection
        connection = DriverManager.getConnection(jdbcUrl);
        System.out.println("Connected to database");

        // Begin a transaction
        connection.setAutoCommit(false);

        // Retrieve the id of the first record (smallest id)
        String getIdSQL = "SELECT id FROM currency ORDER BY id ASC LIMIT 1";
        preparedStatement = connection.prepareStatement(getIdSQL);
        resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            int firstId = resultSet.getInt("id");

            // Update the currency value for the record with the smallest id
            String updateSQL = "UPDATE currency SET currency = ? WHERE id = ?";
            preparedStatement = connection.prepareStatement(updateSQL);
            preparedStatement.setString(1, newCurrency);
            preparedStatement.setInt(2, firstId); // Set the id parameter
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                success = true;
                // Commit the transaction
                connection.commit();
            } else {
                throw new SQLException("Failed to update currency.");
            }
        } else {
            throw new SQLException("No records found to update.");
        }

    } catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
        // Rollback the transaction in case of an error
        if (connection != null) {
            try {
                connection.rollback();
            } catch (SQLException rollbackEx) {
                rollbackEx.printStackTrace();
            }
        }
    } finally {
        // Close resources
        try {
            if (resultSet != null) resultSet.close();
            if (preparedStatement != null) preparedStatement.close();
            if (connection != null) connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Print success status
    if (success) {
        System.out.println("Currency updated to: " + newCurrency);
    }
}
   
   //currency type getter 
   public static String getFirstCurrencyType() {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    String currency = null;

    try {
        // Load SQLite JDBC driver
        Class.forName("org.sqlite.JDBC");

        // Establish database connection
        connection = DriverManager.getConnection(jdbcUrl);
        System.out.println("Connected to database");

        // SQL statement to get the currency of the record with the smallest id
        String getCurrencySQL = "SELECT currency FROM currency ORDER BY id ASC LIMIT 1";
        preparedStatement = connection.prepareStatement(getCurrencySQL);
        resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            currency = resultSet.getString("currency");
        } else {
            System.out.println("No records found in the currency table.");
        }

    } catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
    } finally {
        // Close resources
        try {
            if (resultSet != null) resultSet.close();
            if (preparedStatement != null) preparedStatement.close();
            if (connection != null) connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    return currency;
}



}
