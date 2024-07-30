/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccessOfDatabase;

import loginandsignup.SQLite;
import loginandsignup.UserAuthentication;

import java.sql.Date;

/**
 * This class provides methods to interact with the database.
 * It uses the SQLite class to perform various database operations.
 * 
 * @author ASUS
 */
public class ValueSetterToDatabase {
    
    // Method to set income in the database sqlite
    public static void setIncomePerform_sqlite(String incomeType, double incomeAmount, String dateChooser, String note) {
        SQLite.setIncome(incomeType, incomeAmount, dateChooser, note);
    }
    // Method to set income in the database from H2 tested working fine
    public static void setIncomePerform_h2(String email,String incomeType, double incomeAmount, String dateChooser, String note) {
        String incomingEmail= UserAuthentication.convertEmailToPlainString(email);
        UserAuthentication.setIncome(incomingEmail, incomeType, incomeAmount, dateChooser, note);
    }




    
    // Method to set expense in the database
    public static void setExpensePerform_slite(String expenseType, double expenseAmount, String dateChooser, String note) {
        SQLite.setExpense(expenseType, expenseAmount, dateChooser, note);
    }
    // Method to set expense in the database H2
    public static void setExpensePerform_h2(String email, String expenseType, double expenseAmount, String dateChooser, String note) {
        SQLite.setExpense(expenseType, expenseAmount, dateChooser, note);
        String incomingEmail= UserAuthentication.convertEmailToPlainString(email);
        UserAuthentication.setExpenses(incomingEmail, expenseType, expenseAmount, dateChooser, note);
    }
    


    // Method to set investment in the database
    public static void setInvestmentPerform_sqlite(String investmentType, double investmentAmount, String dateChooser, String note) {
        SQLite.setInvestment(investmentType, investmentAmount, dateChooser, note);
    }
    // Method to set investment in the database h2
    public static void setInvestmentPerform_h2(String email,String investmentType, double investmentAmount, String dateChooser, String note) {
        String incomingEmail= UserAuthentication.convertEmailToPlainString(email);
        //    public static boolean setInvestments(String email, String investmentType, double investmentAmount, String investmentDate, String investmentNote) {
        UserAuthentication.setInvestments(incomingEmail,investmentType, investmentAmount, dateChooser, note);
    }



    // Method to set income goal in the database
    public static void setGoalIncomePerform_slqite(double incomeGoalAmount, String startDate, String endDate) {
        SQLite.setIncomeGoal(incomeGoalAmount, startDate, endDate);
    }
    // Method to set income goal in the database
    public static void setGoalIncomePerform_h2(String email,double incomeGoalAmount, String startDate, String endDate) {
        String incomingEmail= UserAuthentication.convertEmailToPlainString(email);
        UserAuthentication.setIncomeGoal(incomingEmail, incomeGoalAmount, startDate, endDate);
    }
    



    // Method to set expense goal in the database
    public static void setGoalExpensePerform_sqlite(double expenseGoalAmount, String startDate, String endDate) {
        SQLite.setExpenseGoal(expenseGoalAmount, startDate, endDate);
    }
    // Method to set expense goal in the database
    public static void setGoalExpensePerform_h2(String email,double expenseGoalAmount, String startDate, String endDate) {
        String incomingEmail= UserAuthentication.convertEmailToPlainString(email);
        UserAuthentication.setExpenseGoal(incomingEmail, expenseGoalAmount, startDate, endDate);
    }
    
    //
}
