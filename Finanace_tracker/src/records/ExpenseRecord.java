/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package records;

/**
 *
 * @author ASUS
 */
public class ExpenseRecord {
    private int id;
    private String expenseType;
    private double expenseAmount;
    private String dateChooser;
    private String note;

    public ExpenseRecord(int id, String expenseType, double expenseAmount, String dateChooser, String note) {
        this.id = id;
        this.expenseType = expenseType;
        this.expenseAmount = expenseAmount;
        this.dateChooser = dateChooser;
        this.note = note;
    }

    public int getId() { return id; }
    public String getExpenseType() { return expenseType; }
    public double getExpenseAmount() { return expenseAmount; }
    public String getDateChooser() { return dateChooser; }
    public String getNote() { return note; }
}
