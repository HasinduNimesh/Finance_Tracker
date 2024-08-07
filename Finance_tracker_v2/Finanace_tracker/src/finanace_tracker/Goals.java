/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package finanace_tracker;

import java.sql.Date;
import java.text.SimpleDateFormat;


/**
 *
 * @author ASUS
 */
public class Goals extends javax.swing.JPanel {

    /**
     * Creates new form Expenses
     */
    public Goals() {
        initComponents();
    }
    
    //variables
    double incomeGoal=0.0;
    double expenseGoal=0.0;
    
    //progress shower
    private void progress_shower(){
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        income_goal_setter_kGradientPanel = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        income_amount_txtfield = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        start_jDateChooser_income = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        end_jDateChooser_income = new com.toedter.calendar.JDateChooser();
        income_goal_setter_button = new javax.swing.JLabel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        income_goal_jProgressBar = new javax.swing.JProgressBar();
        incomeGoalAchievementLable = new javax.swing.JLabel();
        expense_goal_setter_kGradientPanel = new keeptoo.KGradientPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        expense_amount_txtfield = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        start_jDateChooser_expense = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        end_jDateChooser_expense = new com.toedter.calendar.JDateChooser();
        expense_goal_setter_button = new javax.swing.JLabel();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        expense_goal_jProgressBar = new javax.swing.JProgressBar();
        ExpenseGoalAchievementLable = new javax.swing.JLabel();

        kGradientPanel1.setkEndColor(new java.awt.Color(51, 0, 102));
        kGradientPanel1.setkStartColor(new java.awt.Color(85, 77, 222));

        income_goal_setter_kGradientPanel.setkGradientFocus(1000);
        income_goal_setter_kGradientPanel.setkStartColor(new java.awt.Color(29, 103, 103));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SET INCOME GOAL");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Amount");

        income_amount_txtfield.setBackground(new java.awt.Color(255, 255, 255));
        income_amount_txtfield.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        income_amount_txtfield.setDisabledTextColor(new java.awt.Color(40, 40, 40));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Start Date");

        start_jDateChooser_income.setBackground(new java.awt.Color(0, 0, 0));
        start_jDateChooser_income.setForeground(new java.awt.Color(255, 255, 255));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("End Date");

        end_jDateChooser_income.setBackground(new java.awt.Color(0, 0, 0));
        end_jDateChooser_income.setForeground(new java.awt.Color(255, 255, 255));

        income_goal_setter_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add.png"))); // NOI18N
        income_goal_setter_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        income_goal_setter_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                income_goal_setter_buttonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout income_goal_setter_kGradientPanelLayout = new javax.swing.GroupLayout(income_goal_setter_kGradientPanel);
        income_goal_setter_kGradientPanel.setLayout(income_goal_setter_kGradientPanelLayout);
        income_goal_setter_kGradientPanelLayout.setHorizontalGroup(
            income_goal_setter_kGradientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, income_goal_setter_kGradientPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(income_goal_setter_kGradientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(income_goal_setter_kGradientPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, income_goal_setter_kGradientPanelLayout.createSequentialGroup()
                        .addGroup(income_goal_setter_kGradientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(income_goal_setter_kGradientPanelLayout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(start_jDateChooser_income, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(income_goal_setter_kGradientPanelLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                .addComponent(income_amount_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(income_goal_setter_kGradientPanelLayout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(end_jDateChooser_income, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(27, 27, 27))))
            .addGroup(income_goal_setter_kGradientPanelLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(income_goal_setter_button)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        income_goal_setter_kGradientPanelLayout.setVerticalGroup(
            income_goal_setter_kGradientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(income_goal_setter_kGradientPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(income_goal_setter_kGradientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(income_amount_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(income_goal_setter_kGradientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(start_jDateChooser_income, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(income_goal_setter_kGradientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(end_jDateChooser_income, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(income_goal_setter_button)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        kGradientPanel2.setkStartColor(new java.awt.Color(191, 0, 255));

        incomeGoalAchievementLable.setBackground(new java.awt.Color(255, 255, 255));
        incomeGoalAchievementLable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        incomeGoalAchievementLable.setForeground(new java.awt.Color(255, 255, 255));
        incomeGoalAchievementLable.setText("INCOME GOAL ACHIEVEMENT");

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(income_goal_jProgressBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(incomeGoalAchievementLable, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(incomeGoalAchievementLable, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(income_goal_jProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        expense_goal_setter_kGradientPanel.setkGradientFocus(1000);
        expense_goal_setter_kGradientPanel.setkStartColor(new java.awt.Color(29, 103, 103));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("SET EXPENSE GOAL");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Amount");

        expense_amount_txtfield.setBackground(new java.awt.Color(255, 255, 255));
        expense_amount_txtfield.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        expense_amount_txtfield.setForeground(new java.awt.Color(0, 0, 0));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Start Date");

        start_jDateChooser_expense.setBackground(new java.awt.Color(0, 0, 0));
        start_jDateChooser_expense.setForeground(new java.awt.Color(255, 255, 255));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("End Date");

        end_jDateChooser_expense.setBackground(new java.awt.Color(0, 0, 0));
        end_jDateChooser_expense.setForeground(new java.awt.Color(255, 255, 255));

        expense_goal_setter_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add.png"))); // NOI18N
        expense_goal_setter_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        expense_goal_setter_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                expense_goal_setter_buttonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout expense_goal_setter_kGradientPanelLayout = new javax.swing.GroupLayout(expense_goal_setter_kGradientPanel);
        expense_goal_setter_kGradientPanel.setLayout(expense_goal_setter_kGradientPanelLayout);
        expense_goal_setter_kGradientPanelLayout.setHorizontalGroup(
            expense_goal_setter_kGradientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, expense_goal_setter_kGradientPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(expense_goal_setter_kGradientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(expense_goal_setter_kGradientPanelLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, expense_goal_setter_kGradientPanelLayout.createSequentialGroup()
                        .addGroup(expense_goal_setter_kGradientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(expense_goal_setter_kGradientPanelLayout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(end_jDateChooser_expense, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(expense_goal_setter_kGradientPanelLayout.createSequentialGroup()
                                .addGroup(expense_goal_setter_kGradientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(expense_goal_setter_kGradientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(expense_amount_txtfield)
                                    .addComponent(start_jDateChooser_expense, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(27, 27, 27))))
            .addGroup(expense_goal_setter_kGradientPanelLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(expense_goal_setter_button)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        expense_goal_setter_kGradientPanelLayout.setVerticalGroup(
            expense_goal_setter_kGradientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(expense_goal_setter_kGradientPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(expense_goal_setter_kGradientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(expense_amount_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(expense_goal_setter_kGradientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(start_jDateChooser_expense, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(expense_goal_setter_kGradientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(end_jDateChooser_expense, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(expense_goal_setter_button)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        kGradientPanel3.setkStartColor(new java.awt.Color(191, 0, 255));

        ExpenseGoalAchievementLable.setBackground(new java.awt.Color(255, 255, 255));
        ExpenseGoalAchievementLable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ExpenseGoalAchievementLable.setForeground(new java.awt.Color(255, 255, 255));
        ExpenseGoalAchievementLable.setText("EXPENSES GOAL ACHIEVEMENT");

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ExpenseGoalAchievementLable, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                    .addComponent(expense_goal_jProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel3Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(ExpenseGoalAchievementLable, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(expense_goal_jProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(income_goal_setter_kGradientPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(expense_goal_setter_kGradientPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(expense_goal_setter_kGradientPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(income_goal_setter_kGradientPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(229, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void income_goal_setter_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_income_goal_setter_buttonMouseClicked
        //enter income goal
        try{
        incomeGoal = Double.parseDouble(income_amount_txtfield.getText());
        }catch(Exception e){
            e.printStackTrace();
        }
        //start date getter
        java.util.Date selectedStartDate_Income = start_jDateChooser_income.getDate();
        //end date getter
        java.util.Date selectEndDate_Income = end_jDateChooser_income.getDate();
        // Format the date to a readable format
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        //save income startdate to Date
        String income_start_date = dateFormat.format(selectedStartDate_Income);
        //save income enddate to Date
        String income_end_date = dateFormat.format(selectEndDate_Income);
        
        //send goal to the database
        AccessOfDatabase.ValueSetterToDatabase.setGoalIncomePerform(incomeGoal, income_start_date, income_end_date);
    }//GEN-LAST:event_income_goal_setter_buttonMouseClicked

    private void expense_goal_setter_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_expense_goal_setter_buttonMouseClicked
        //enter income goal
        try{
        expenseGoal = Double.parseDouble(expense_amount_txtfield.getText());
        }catch(Exception e){
            e.printStackTrace();
        }
        //start date getter
        java.util.Date selectedStartDate_Expense = start_jDateChooser_expense.getDate();
        //end date getter
        java.util.Date selectEndDate_Expense = end_jDateChooser_expense.getDate();
        // Format the date to a readable format
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        //save income startdate to Date
        String expense_start_date = dateFormat.format(selectedStartDate_Expense);
        //save income enddate to Date
        String expense_end_date = dateFormat.format(selectEndDate_Expense);
        
         //send goal to the database
        AccessOfDatabase.ValueSetterToDatabase.setGoalExpensePerform(incomeGoal, expense_start_date, expense_end_date);
        
    }//GEN-LAST:event_expense_goal_setter_buttonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ExpenseGoalAchievementLable;
    private com.toedter.calendar.JDateChooser end_jDateChooser_expense;
    private com.toedter.calendar.JDateChooser end_jDateChooser_income;
    private javax.swing.JTextField expense_amount_txtfield;
    private javax.swing.JProgressBar expense_goal_jProgressBar;
    private javax.swing.JLabel expense_goal_setter_button;
    private keeptoo.KGradientPanel expense_goal_setter_kGradientPanel;
    private javax.swing.JLabel incomeGoalAchievementLable;
    private javax.swing.JTextField income_amount_txtfield;
    private javax.swing.JProgressBar income_goal_jProgressBar;
    private javax.swing.JLabel income_goal_setter_button;
    private keeptoo.KGradientPanel income_goal_setter_kGradientPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    private com.toedter.calendar.JDateChooser start_jDateChooser_expense;
    private com.toedter.calendar.JDateChooser start_jDateChooser_income;
    // End of variables declaration//GEN-END:variables
}
