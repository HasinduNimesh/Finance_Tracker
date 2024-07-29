/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccessOfDatabase;

/**
 *
 * @author ASUS
 */
public class ValueGetterFromElems {
    //variable
    private String Income_Type=null,Date_Chooser=null,Note=null;
    private double Income_Amount=0.0;
    
    private void getIncome_Type(String Income_Type){
        this.Income_Type=Income_Type;
    }
    private void getDate_Chooser(String Date_Chooser){
        this.Date_Chooser=Date_Chooser;
    }
    private void getNote(String Note){
        this.Note=Note;
    }
    private void getAmount(double Income_Amount){
        this.Income_Amount=Income_Amount;
    }
    public ValueGetterFromElems(String Income_Type,String Date_Chooser,String Note,double Income_Amount){
        this.Income_Type=Income_Type;
        this.Date_Chooser=Date_Chooser;
        this.Note=Note;
        this.Income_Amount=Income_Amount;
    }
}
