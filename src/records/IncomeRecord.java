/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package records;

/**
 *
 * @author ASUS
 */
public class IncomeRecord {
    private int id;
    private String incomeType;
    private double incomeAmount;
    private String dateChooser;
    private String note;

    public IncomeRecord(int id, String incomeType, double incomeAmount, String dateChooser, String note) {
        this.id = id;
        this.incomeType = incomeType;
        this.incomeAmount = incomeAmount;
        this.dateChooser = dateChooser;
        this.note = note;
    }

    // Getters for each field
    public int getId() { return id; }
    public String getIncomeType() { return incomeType; }
    public double getIncomeAmount() { return incomeAmount; }
    public String getDateChooser() { return dateChooser; }
    public String getNote() { return note; }
}

