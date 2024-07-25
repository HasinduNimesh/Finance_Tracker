/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccessOfDatabase;

import loginandsignup.SQLite;
import java.sql.Date;

/**
 * This class provides methods to interact with the database.
 * It uses the SQLite class to perform various database operations.
 * 
 * @author ASUS
 */
public class ValueSetterToDatabase {
    
    // Method to set income in the database
    public static void setIncomePerform(String incomeType, double incomeAmount, String dateChooser, String note) {
        SQLite.setIncome(incomeType, incomeAmount, dateChooser, note);
    }
    
    // Method to set expense in the database
    public static void setExpensePerform(String expenseType, double expenseAmount, String dateChooser, String note) {
        SQLite.setExpense(expenseType, expenseAmount, dateChooser, note);
    }
    
    // Method to set income goal in the database
    public static void setGoalIncomePerform(double incomeGoalAmount, Date startDate, Date endDate) {
        SQLite.setIncomeGoal(incomeGoalAmount, startDate, endDate);
    }
    
    // Method to set expense goal in the database
    public static void setGoalExpensePerform(double expenseGoalAmount, Date startDate, Date endDate) {
        SQLite.setExpenseGoal(expenseGoalAmount, startDate, endDate);
    }
}
