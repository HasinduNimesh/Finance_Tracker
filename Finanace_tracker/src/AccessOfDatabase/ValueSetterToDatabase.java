/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccessOfDatabase;

import loginandsignup.SQLite;

/**
 *
 * @author ASUS
 */
public class ValueSetterToDatabase {
    public void setIncomePerform(String Income_Type,double Income_Amount,String Date_Chooser,String Note){
        SQLite.setIncome(Income_Type, Income_Amount, Date_Chooser, Note);
    }
    
    public void setExpensePerform(String expense_Type,double expense_Amount,String Date_Chooser,String Note){
        SQLite.setIncome(expense_Type, expense_Amount, Date_Chooser, Note);
    }
    
    

}
