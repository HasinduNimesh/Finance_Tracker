/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package finanace_tracker;
import java.awt.Color;
import java.util.List;
import javaswingdev.chart.ModelPieChart;
import javaswingdev.chart.PieChart;
import javax.swing.JPanel;
import loginandsignup.SQLite;
import static loginandsignup.SQLite.getFirstCurrencyType;
import static loginandsignup.SQLite.getTotalExpense;
import static loginandsignup.SQLite.getTotalIncome;

/**
 *
 * @author ASUS
 */
public class Dashboard extends javax.swing.JPanel {

    private SQLite sqlite;
    String currency=getFirstCurrencyType();
    
    /**
     * Creates new form Dashboard
     */
   public Dashboard() {
        initComponents();
        sqlite = new SQLite();
        updateIncomeChart();
        updateExpenseChart();

        pieChart1 = new PieChart();
        pieChart1.setChartType(PieChart.PeiChartType.DONUT_CHART);

        pieChart2 = new PieChart();
        pieChart2.setChartType(PieChart.PeiChartType.DONUT_CHART);
    }
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
   
   
     @Override
    public void addNotify() {
        super.addNotify();
        updateValues();
    }

    // Update income pie chart
    private void updateIncomeChart() {
        List<ModelPieChart> incomeData = sqlite.getIncomeData();
        pieChart1.clearData();

        for (ModelPieChart data : incomeData) {
            pieChart1.addData(data);
        }

        pieChart1.repaint();
    }

    // Update expense pie chart
    private void updateExpenseChart() {
        List<ModelPieChart> expenseData = sqlite.getExpenseData();
        pieChart2.clearData();

        for (ModelPieChart data : expenseData) {
            pieChart2.addData(data);
        }

        pieChart2.repaint();
    }

    // Update values for the labels
    private void updateValues() {
        double totalIncome = getTotalIncome();
        double totalExpense = getTotalExpense();
        double remainder = totalIncome - totalExpense;

        income_label.setText(currency+". "+String.format("%.2f", totalIncome));
        expense_label.setText(currency+". "+String.format("%.2f", totalExpense));
        remainder_label.setText(currency+". "+String.format("%.2f", remainder));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        income_label = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        remainder_label = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        expense_label = new javax.swing.JLabel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        pieChart1 = new javaswingdev.chart.PieChart();
        jLabel7 = new javax.swing.JLabel();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        pieChart2 = new javaswingdev.chart.PieChart();
        jLabel8 = new javax.swing.JLabel();

        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(788, 600));

        kGradientPanel1.setForeground(new java.awt.Color(153, 153, 153));
        kGradientPanel1.setkEndColor(new java.awt.Color(51, 0, 102));
        kGradientPanel1.setkGradientFocus(700);
        kGradientPanel1.setkStartColor(new java.awt.Color(85, 77, 222));

        jPanel4.setBackground(new java.awt.Color(0, 153, 102));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("MS PGothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Income");

        income_label.setBackground(new java.awt.Color(255, 255, 255));
        income_label.setFont(new java.awt.Font("MS PGothic", 1, 18)); // NOI18N
        income_label.setForeground(new java.awt.Color(255, 255, 255));
        income_label.setText("0.00");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(income_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(income_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setForeground(new java.awt.Color(0, 255, 0));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("MS PGothic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Remainder");

        remainder_label.setBackground(new java.awt.Color(255, 255, 255));
        remainder_label.setFont(new java.awt.Font("MS PGothic", 1, 18)); // NOI18N
        remainder_label.setForeground(new java.awt.Color(255, 255, 255));
        remainder_label.setText("0.00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel3)
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(remainder_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(remainder_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 51, 0));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("MS PGothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Expenses");

        expense_label.setBackground(new java.awt.Color(255, 255, 255));
        expense_label.setFont(new java.awt.Font("MS PGothic", 1, 18)); // NOI18N
        expense_label.setForeground(new java.awt.Color(255, 255, 255));
        expense_label.setText("0.00");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                .addGap(31, 31, 31))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(expense_label, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(expense_label, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kGradientPanel2.setkEndColor(new java.awt.Color(0, 0, 0));
        kGradientPanel2.setkStartColor(new java.awt.Color(0, 102, 255));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("INCOMES");

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pieChart1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel7)
                .addContainerGap(131, Short.MAX_VALUE))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pieChart1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        kGradientPanel3.setkEndColor(new java.awt.Color(0, 0, 0));
        kGradientPanel3.setkStartColor(new java.awt.Color(0, 102, 255));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("EXPENSES");

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pieChart2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel3Layout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(121, 121, 121))
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pieChart2, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 48, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel expense_label;
    private javax.swing.JLabel income_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    private javaswingdev.chart.PieChart pieChart1;
    private javaswingdev.chart.PieChart pieChart2;
    private javax.swing.JLabel remainder_label;
    // End of variables declaration//GEN-END:variables
}
