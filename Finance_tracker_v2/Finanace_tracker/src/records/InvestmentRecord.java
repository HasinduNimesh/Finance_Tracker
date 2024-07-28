/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package records;

/**
 *
 * @author ASUS
 */
public class InvestmentRecord {
    private int index; // Changed from id to index
    private String investmentType;
    private double investmentAmount;
    private String dateChooser;
    private String note;

    public InvestmentRecord(int index, String investmentType, double investmentAmount, String dateChooser, String note) {
        this.index = index;
        this.investmentType = investmentType;
        this.investmentAmount = investmentAmount;
        this.dateChooser = dateChooser;
        this.note = note;
    }

    public int getIndex() { return index; } // Changed from getId to getIndex
    public String getInvestmentType() { return investmentType; }
    public double getInvestmentAmount() { return investmentAmount; }
    public String getDateChooser() { return dateChooser; }
    public String getNote() { return note; }
}
