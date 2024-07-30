package loginandsignup;

import java.awt.Color;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import records.IncomeRecord;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;
import javaswingdev.chart.ModelPieChart;
import records.ExpenseRecord;
import records.InvestmentRecord;


import records.IncomeRecord;

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

    public static boolean authenticateUser_old(String email, String password) throws SQLException, NoSuchAlgorithmException {
        String hashedPassword = hashPassword(password);
        try (Connection conn = DatabaseUtil.getConnection()) {
            String query = "SELECT * FROM users WHERE email = ? AND password_hash = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, email);
            stmt.setString(2, hashedPassword);
            ResultSet rs = stmt.executeQuery();
            //for defugging
           
            return rs.next();
        }
    }
    public static String authenticateUser( String password,String email) throws SQLException, NoSuchAlgorithmException {
        String hashedPassword = hashPassword(password);
        try (Connection conn = DatabaseUtil.getConnection()) {
            String query = "SELECT email FROM users WHERE email = ? AND password_hash = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, email);
            stmt.setString(2, hashedPassword);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getString("email");
            } else {
                return null;
            }
        }
    }
    // Method to insert a new user into the database
    public static void insertUser(String firstName, String lastName, String email, String password) {
        String insertQuery = "INSERT INTO users ( PASSWORD_HASH ,EMAIL,F_NAME,L_NAME) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(insertQuery)) {
            String hashedPassword = hashPassword(password);
            stmt.setString(3, firstName);
            stmt.setString(4, lastName);
            stmt.setString(2, email);
            stmt.setString(1, hashedPassword);
            stmt.executeUpdate();
            System.out.println("User inserted successfully");
        } catch (SQLException | NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    public static String getUserFullName(String email) throws SQLException {
        try (Connection conn = DatabaseUtil.getConnection()) {
            String query = "SELECT f_name, l_name FROM users WHERE email = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String firstName = rs.getString("f_name");
                String lastName = rs.getString("l_name");
                return firstName + " " + lastName;
            } else {
                return null;
            }
        }
    }

    public static Boolean settingUpTablesPerUser(String email) throws SQLException {
        settingUpUserPreference(email);
        settingUpSetIncomeTable(email);
        settingUpIncomeGoalsTable(email);
        settingUpSetExpenseTable(email);
        settingUpExpenseGoalsTable(email);
        settingUpInvestmentsTable(email);
        

        return true;
    }

    public static Boolean settingUpSetIncomeTable(String email){
        try (Connection conn = DatabaseUtil.getConnection()) {
            String query = "CREATE TABLE IF NOT EXISTS "+email+"_income (id INT PRIMARY KEY AUTO_INCREMENT, income_type VARCHAR(255) not null, income_amount DECIMAL(10,2) not null, income_date VARCHAR(255) NOT NULL , income_note VARCHAR(255))";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;}

        //tested and working

        public static boolean setIncome(String email, String incomeType, double incomeAmount, String incomeDate, String incomeNote) {
            try (Connection conn = DatabaseUtil.getConnection()) {
                String query = "INSERT INTO " + email + "_income (income_type, income_amount, income_date, income_note) VALUES (?, ?, ?, ?)";
                PreparedStatement stmt = conn.prepareStatement(query);
                stmt.setString(1, incomeType);
                stmt.setDouble(2, incomeAmount);
                stmt.setString(3, incomeDate);
                stmt.setString(4, incomeNote);
                stmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }
            return true;

    }
    public static Boolean settingUpSetExpenseTable(String email){
        try (Connection conn = DatabaseUtil.getConnection()) {
            String query = "CREATE TABLE IF NOT EXISTS "+email+"_expense (id INT PRIMARY KEY AUTO_INCREMENT, expense_type VARCHAR(255) not null, expense_amount DECIMAL(10,2) not null, expense_date VARCHAR(255) NOT NULL , expense_note VARCHAR(255))";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;

        //tested and working

    }
    public static boolean setExpenses(String email, String expenseType, double expenseAmount, String expenseDate, String expenseNote) {
        try (Connection conn = DatabaseUtil.getConnection()) {
            String query = "INSERT INTO " + email + "_expense (expense_type, expense_amount, expense_date, expense_note) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, expenseType);
            stmt.setDouble(2, expenseAmount);
            stmt.setString(3, expenseDate);
            stmt.setString(4, expenseNote);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public static boolean settingUpIncomeGoalsTable(String email){
        try (Connection conn = DatabaseUtil.getConnection()) {
            String query = "CREATE TABLE IF NOT EXISTS "+email+"_income_goals (id INT PRIMARY KEY AUTO_INCREMENT, income_goal_amount DECIMAL(10,2) not null, income_goal_date VARCHAR(255) NOT NULL ,income_goal_end_date VARCHAR(255) NOT NULL)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;

        //tested and working

    }
    public static boolean setIncomeGoal(String email, double incomeGoalAmount, String incomeGoalDate, String incomeGoalEndDate) {
        try (Connection conn = DatabaseUtil.getConnection()) {
            String query = "INSERT INTO " + email + "_income_goals (income_goal_amount, income_goal_date, income_goal_end_date) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setDouble(1, incomeGoalAmount);
            stmt.setString(2,incomeGoalDate);
            stmt.setString(3, incomeGoalEndDate);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    

    public static boolean settingUpExpenseGoalsTable(String email){
        try (Connection conn = DatabaseUtil.getConnection()) {
            String query = "CREATE TABLE IF NOT EXISTS "+email+"_expense_goals (id INT PRIMARY KEY AUTO_INCREMENT, expense_goal_amount DECIMAL(10,2) not null, expense_goal_date VARCHAR(255) NOT NULL ,expense_goal_end_date VARCHAR(255) NOT NULL)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;

        //tested and working

    }
    public static boolean setExpenseGoal(String email, double expenseGoalAmount, String expenseGoalDate, String expenseGoalEndDate) {
        try (Connection conn = DatabaseUtil.getConnection()) {
            String query = "INSERT INTO " + email + "_expense_goals (expense_goal_amount, expense_goal_date, expense_goal_end_date) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setDouble(1, expenseGoalAmount);
            stmt.setString(2,expenseGoalDate);
            stmt.setString(3, expenseGoalEndDate);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static boolean settingUpInvestmentsTable(String email){
        try (Connection conn = DatabaseUtil.getConnection()) {
            String query = "CREATE TABLE IF NOT EXISTS "+email+"_investments (id INT PRIMARY KEY AUTO_INCREMENT, investment_type VARCHAR(255) not null, investment_amount DECIMAL(10,2) not null, investment_date VARCHAR(255) NOT NULL , investment_note VARCHAR(255))";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;

        //tested and working

    }
    public static boolean setInvestments(String email, String investmentType, double investmentAmount, String investmentDate, String investmentNote) {
        try (Connection conn = DatabaseUtil.getConnection()) {
            String query = "INSERT INTO " + email + "_investments (investment_type, investment_amount, investment_date, investment_note) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, investmentType);
            stmt.setDouble(2, investmentAmount);
            stmt.setString(3, investmentDate);
            stmt.setString(4, investmentNote);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public static boolean settingUpUserPreference(String email){
        try(Connection conn=DatabaseUtil.getConnection()){
            String query="CREATE TABLE IF NOT EXISTS "+email+"_user_preference (id INT PRIMARY KEY AUTO_INCREMENT, currency VARCHAR(255) not null , theme VARCHAR(255) not null)";
            PreparedStatement stmt=conn.prepareStatement(query);
            stmt.executeUpdate();
    }
    catch(Exception e){
        System.out.println(e);
        return false;
    }
    return true;
}
//accessing tables 

    public static void viewIncome(String email) {
        try (Connection conn = DatabaseUtil.getConnection()) {
            String query = "SELECT * FROM " + email + "_income";
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println("Income Type: " + rs.getString("income_type"));
                System.out.println("Income Amount: " + rs.getDouble("income_amount"));
                System.out.println("Income Date: " + rs.getString("income_date"));
                System.out.println("Income Note: " + rs.getString("income_note"));
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
}
    }
    public static void viewExpenses(String email) {
        try (Connection conn = DatabaseUtil.getConnection()) {
            String query = "SELECT * FROM " + email + "_expense";
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println("Expense Type: " + rs.getString("expense_type"));
                System.out.println("Expense Amount: " + rs.getDouble("expense_amount"));
                System.out.println("Expense Date: " + rs.getString("expense_date"));
                System.out.println("Expense Note: " + rs.getString("expense_note"));
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
}
    }
    public static void viewIncomeGoals(String email) {
        try (Connection conn = DatabaseUtil.getConnection()) {
            String query = "SELECT * FROM " + email + "_income_goals";
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println("Income Goal Amount: " + rs.getDouble("income_goal_amount"));
                System.out.println("Income Goal Date: " + rs.getString("income_goal_date"));
                System.out.println("Income Goal End Date: " + rs.getString("income_goal_end_date"));
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
}
    }
    public static void viewExpenseGoals(String email) {
        try (Connection conn = DatabaseUtil.getConnection()) {
            String query = "SELECT * FROM " + email + "_expense_goals";
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println("Expense Goal Amount: " + rs.getDouble("expense_goal_amount"));
                System.out.println("Expense Goal Date: " + rs.getString("expense_goal_date"));
                System.out.println("Expense Goal End Date: " + rs.getString("expense_goal_end_date"));
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
}
    }
    public static void viewInvestments(String email) {
        try (Connection conn = DatabaseUtil.getConnection()) {
            String query = "SELECT * FROM " + email + "_investments";
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println("Investment Type: " + rs.getString("investment_type"));
                System.out.println("Investment Amount: " + rs.getDouble("investment_amount"));
                System.out.println("Investment Date: " + rs.getString("investment_date"));
                System.out.println("Investment Note: " + rs.getString("investment_note"));
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // Method to retrieve income records to table
    public static List<IncomeRecord> getIncomeRecords(String email) {
        List<IncomeRecord> incomeRecords = new ArrayList<>();
        try (Connection conn = DatabaseUtil.getConnection()) {
            String query = "SELECT * FROM " + email + "_income";
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String incomeType = rs.getString("income_type");
                double incomeAmount = rs.getDouble("income_amount");
                String incomeDate = rs.getString("income_date");
                String incomeNote = rs.getString("income_note");
                incomeRecords.add(new IncomeRecord(id, incomeType, incomeAmount, incomeDate, incomeNote));
                //public IncomeRecord(int id, String incomeType, double incomeAmount, String dateChooser, String note) {
            }
        } catch (SQLException e) {
            e.printStackTrace();
    
        }
        return incomeRecords;

}

public static List<ExpenseRecord> getExpenseRecords(String email) {
    List<ExpenseRecord> expenseRecords = new ArrayList<>();
    try (Connection conn = DatabaseUtil.getConnection()) {
        String query = "SELECT * FROM " + email + "_expense";
        PreparedStatement stmt = conn.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            int id = rs.getInt("id");
            String expenseType = rs.getString("expense_type");
            double expenseAmount = rs.getDouble("expense_amount");
            String expenseDate = rs.getString("expense_date");
            String expenseNote = rs.getString("expense_note");
            expenseRecords.add(new ExpenseRecord(id, expenseType, expenseAmount, expenseDate ,expenseNote));
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return expenseRecords;


}


 // Method to retrieve investment records to table
 public static List<InvestmentRecord> getInvestmentRecords(String email) {
    List<InvestmentRecord> investmentRecords = new ArrayList<>();
    try (Connection conn = DatabaseUtil.getConnection()) {
        String query = "SELECT * FROM " + email + "_investments";
        PreparedStatement stmt = conn.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            int id = rs.getInt("id");
            String investmentType = rs.getString("investment_type");
            double investmentAmount = rs.getDouble("investment_amount");
            String investmentDate = rs.getString("investment_date");
            String investmentNote = rs.getString("investment_note");
            investmentRecords.add(new InvestmentRecord(id, investmentType, investmentAmount, investmentDate, investmentNote));
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return investmentRecords;

 }


  // get total for the dashboard 
    // Method to get total income
public static double getTotalIncome(String email) {
    double totalIncome = 0;
    try (Connection conn = DatabaseUtil.getConnection()) {
        String query = "SELECT SUM(income_amount) AS total_income FROM " + email + "_income";
        PreparedStatement stmt = conn.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            totalIncome = rs.getDouble("total_income");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return totalIncome;
}

// Method to get total expense
public static double getTotalExpense(String email) {
    double totalExpense = 0;
    try (Connection conn = DatabaseUtil.getConnection()) {
        String query = "SELECT SUM(expense_amount) AS total_expense FROM " + email + "_expense";
        PreparedStatement stmt = conn.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            totalExpense = rs.getDouble("total_expense");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return totalExpense;
}


// Method to get total income goals
public static double getTotalIncomeGoals(String email) {
    double totalIncomeGoals = 0;
    try (Connection conn = DatabaseUtil.getConnection()) {
        String query = "SELECT SUM(income_goal_amount) AS total_income_goals FROM " + email + "_income_goals";
        PreparedStatement stmt = conn.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            totalIncomeGoals = rs.getDouble("total_income_goals");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return totalIncomeGoals;
}

    // Method to get total expense goals
public static double getTotalExpenseGoals(String email) {
    double totalExpenseGoals = 0;
    try (Connection conn = DatabaseUtil.getConnection()) {
        String query = "SELECT SUM(expense_goal_amount) AS total_expense_goals FROM " + email + "_expense_goals";
        PreparedStatement stmt = conn.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            totalExpenseGoals = rs.getDouble("total_expense_goals");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return totalExpenseGoals;}


    //total investment
public static double getTotalInvestment(String email) {
    double totalInvestment = 0;
    try (Connection conn = DatabaseUtil.getConnection()) {
        String query = "SELECT SUM(investment_amount) AS total_investment FROM " + email + "_investments";
        PreparedStatement stmt = conn.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            totalInvestment = rs.getDouble("total_investment");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return totalInvestment;
}

//color returner
private Color getRandomColor() {
    // Generate a random color
    int r = (int) (Math.random() * 256);
    int g = (int) (Math.random() * 256);
    int b = (int) (Math.random() * 256);
    return new Color(r, g, b);
}

//value passing for pie chart
public List<ModelPieChart> getIncomeData(String email) {
    List<ModelPieChart> incomeData = new ArrayList<>();
    try (Connection conn = DatabaseUtil.getConnection()) {
        String query = "SELECT income_type, SUM(income_amount) AS total_income FROM " + email + "_income GROUP BY income_type";
        PreparedStatement stmt = conn.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();     
        while (rs.next()) {
            String incomeType = rs.getString("income_type");
            double totalIncome = rs.getDouble("total_income");
            Color color = getRandomColor(); // Generate random colors or use predefined colors
            incomeData.add(new ModelPieChart(incomeType, totalIncome, color));
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return incomeData;


}
public List<ModelPieChart> getExpenseData(String email){
    List<ModelPieChart> expenseData = new ArrayList<>();
    try (Connection conn = DatabaseUtil.getConnection()) {
        String query = "SELECT expense_type, SUM(expense_amount) AS total_expense FROM " + email + "_expense GROUP BY expense_type";
        PreparedStatement stmt = conn.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            String expenseType = rs.getString("expense_type");
            double totalExpense = rs.getDouble("total_expense");
            Color color = getRandomColor(); // Generate random colors or use predefined colors
            expenseData.add(new ModelPieChart(expenseType, totalExpense, color));
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return expenseData;


}

public static String convertEmailToPlainString(String email) {
    String plainString = email.replace("@", "").replace(".", "");
    return plainString;


}

}