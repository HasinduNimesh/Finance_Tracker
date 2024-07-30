/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package finanace_tracker;

import records.IncomeRecord;
import com.formdev.flatlaf.FlatClientProperties;

import loginandsignup.UserAuthentication;

import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import org.h2.engine.User;

import static loginandsignup.SQLite.getFirstCurrencyType;
import static loginandsignup.SQLite.getIncomeRecords;
import static loginandsignup.SQLite.getTotalIncome;
import static loginandsignup.SQLite.getTotalIncomeGoals;
import raven_cell.TableActionButtonRender;
import tableCellUpdate.TableActionCellEditor;
import tableCellUpdate.TableActionCellRender;
import tableCellUpdate.TableActionEvent;

/**
 *
 * @author ASUS
 */
public class Income extends javax.swing.JPanel {

    /**
     * Creates new form Expenses
     */
    
    //VARIABLES 
    String type=null,note=null;
    double income_amount=0.00;
    String currency=getFirstCurrencyType();
    double incomegoalDefict;
    String email;
    
    public Income(String email) {
        initComponents();
        incomegoalDefict=UserAuthentication.getTotalIncome(email)-UserAuthentication.getTotalIncomeGoals(email);
        currency=UserAuthentication.getUserCurrency(email);
        
        
       dynamicTableUpdater();
       
       //lableupdater
        updateLableUpdate();
        
        //table action button
        tableActionSetter();
    }
    
     public void tableActionSetter(){
                 TableActionEvent event = new TableActionEvent() {
            @Override
            public void onEdit(int row) {
                System.out.println("Edit row : " + row);
                
            }

            @Override
            public void onDelete(int row) {
                if (IncomeShowTable.isEditing()) {
                    IncomeShowTable.getCellEditor().stopCellEditing();
                }
                DefaultTableModel model = (DefaultTableModel) IncomeShowTable.getModel();
                model.removeRow(row);
            }

            @Override
            public void onView(int row) {
                System.out.println("View row : " + row);
            }
        };
        IncomeShowTable.getColumnModel().getColumn(5).setCellRenderer(new TableActionCellRender());
        IncomeShowTable.getColumnModel().getColumn(5).setCellEditor(new TableActionCellEditor(event));
        IncomeShowTable.getColumnModel().getColumn(0).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
                setHorizontalAlignment(SwingConstants.RIGHT);
                return super.getTableCellRendererComponent(jtable, o, bln, bln1, i, i1);
            }
        });
    }
 

    public void dynamicTableUpdater(){
         // Fetch and update the table data
       // List<IncomeRecord> incomeRecords = getIncomeRecords();
        List<IncomeRecord> incomeRecords = UserAuthentication.getIncomeRecords(email);
        updateIncomeTable(incomeRecords);
    }
    // Method to update the table model
    public void updateIncomeTable(List<IncomeRecord> incomeRecords) {
        DefaultTableModel model = (DefaultTableModel) IncomeShowTable.getModel();
        model.setRowCount(0); // Clear existing rows

        for (IncomeRecord record : incomeRecords) {
            Object[] rowData = {
                record.getId(),
                record.getDateChooser(),
                record.getIncomeType(),
                record.getNote(),
                record.getIncomeAmount()
            };
            model.addRow(rowData);
        }
    }

    public void updateLableUpdate(){
        incomegoal_defict.setText(currency+". "+incomegoalDefict);
        totalincome_lbl.setText(currency+". "+UserAuthentication.getTotalIncome(email));
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
        tot_income_kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel5 = new javax.swing.JLabel();
        totalincome_lbl = new javax.swing.JLabel();
        income_goal_defict_kGradientPanel3 = new keeptoo.KGradientPanel();
        jLabel6 = new javax.swing.JLabel();
        incomegoal_defict = new javax.swing.JLabel();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        add_new_income_jLabel = new javax.swing.JLabel();
        method_jLabel = new javax.swing.JLabel();
        salary_type_jComboBox = new javax.swing.JComboBox<>();
        amount_jLabel = new javax.swing.JLabel();
        note_jLabel = new javax.swing.JLabel();
        amount_enter_jTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        note_taker_jTextArea = new javax.swing.JTextArea();
        income_Button = new javax.swing.JLabel();
        date_jLabel = new javax.swing.JLabel();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        tablePanel = new javax.swing.JPanel();
        JScrollPanel1 = new javax.swing.JScrollPane();
        IncomeShowTable = new javax.swing.JTable();

        kGradientPanel1.setkEndColor(new java.awt.Color(51, 0, 102));
        kGradientPanel1.setkStartColor(new java.awt.Color(85, 77, 222));

        tot_income_kGradientPanel2.setkGradientFocus(600);
        tot_income_kGradientPanel2.setkStartColor(new java.awt.Color(191, 0, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("TOTAL INCOME");

        totalincome_lbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        totalincome_lbl.setText("0.00");

        javax.swing.GroupLayout tot_income_kGradientPanel2Layout = new javax.swing.GroupLayout(tot_income_kGradientPanel2);
        tot_income_kGradientPanel2.setLayout(tot_income_kGradientPanel2Layout);
        tot_income_kGradientPanel2Layout.setHorizontalGroup(
            tot_income_kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tot_income_kGradientPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(tot_income_kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(tot_income_kGradientPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(totalincome_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tot_income_kGradientPanel2Layout.setVerticalGroup(
            tot_income_kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tot_income_kGradientPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalincome_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        income_goal_defict_kGradientPanel3.setkGradientFocus(600);
        income_goal_defict_kGradientPanel3.setkStartColor(new java.awt.Color(191, 0, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel6.setText("INCOME GOAL DEFICIT");

        incomegoal_defict.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        incomegoal_defict.setText("0.00");

        javax.swing.GroupLayout income_goal_defict_kGradientPanel3Layout = new javax.swing.GroupLayout(income_goal_defict_kGradientPanel3);
        income_goal_defict_kGradientPanel3.setLayout(income_goal_defict_kGradientPanel3Layout);
        income_goal_defict_kGradientPanel3Layout.setHorizontalGroup(
            income_goal_defict_kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(income_goal_defict_kGradientPanel3Layout.createSequentialGroup()
                .addGroup(income_goal_defict_kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(income_goal_defict_kGradientPanel3Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(incomegoal_defict, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(income_goal_defict_kGradientPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        income_goal_defict_kGradientPanel3Layout.setVerticalGroup(
            income_goal_defict_kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(income_goal_defict_kGradientPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(incomegoal_defict, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        kGradientPanel4.setkGradientFocus(1000);
        kGradientPanel4.setkStartColor(new java.awt.Color(28, 88, 90));

        add_new_income_jLabel.setBackground(new java.awt.Color(255, 255, 255));
        add_new_income_jLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        add_new_income_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        add_new_income_jLabel.setText("ADD NEW INCOME");

        method_jLabel.setBackground(new java.awt.Color(255, 255, 255));
        method_jLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        method_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        method_jLabel.setText("Method");

        salary_type_jComboBox.setBackground(new java.awt.Color(255, 255, 255));
        salary_type_jComboBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        salary_type_jComboBox.setForeground(new java.awt.Color(0, 0, 0));
        salary_type_jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Basic Salary", "Overtime", "Bonus", "Commission", "Allowances", "Rental Income", "Investment Income", "Freelance Work", "Business Income", "Pension/Retirement Benefits", "Other" }));
        salary_type_jComboBox.setBorder(null);
        salary_type_jComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        amount_jLabel.setBackground(new java.awt.Color(255, 255, 255));
        amount_jLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        amount_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        amount_jLabel.setText("Amount");

        note_jLabel.setBackground(new java.awt.Color(255, 255, 255));
        note_jLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        note_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        note_jLabel.setText("Note");

        amount_enter_jTextField.setBackground(new java.awt.Color(255, 255, 255));
        amount_enter_jTextField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        amount_enter_jTextField.setForeground(new java.awt.Color(0, 0, 0));

        note_taker_jTextArea.setBackground(new java.awt.Color(255, 255, 255));
        note_taker_jTextArea.setColumns(20);
        note_taker_jTextArea.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        note_taker_jTextArea.setForeground(new java.awt.Color(0, 0, 0));
        note_taker_jTextArea.setRows(5);
        jScrollPane1.setViewportView(note_taker_jTextArea);

        income_Button.setForeground(new java.awt.Color(255, 255, 255));
        income_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/dollar.png"))); // NOI18N
        income_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        income_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                income_ButtonMouseClicked(evt);
            }
        });

        date_jLabel.setBackground(new java.awt.Color(255, 255, 255));
        date_jLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        date_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        date_jLabel.setText("Date");

        jDateChooser.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(add_new_income_jLabel)
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(method_jLabel)
                            .addComponent(amount_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(salary_type_jComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 1, Short.MAX_VALUE)
                            .addComponent(amount_enter_jTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(date_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(note_jLabel))
                        .addGap(0, 0, 0)
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(income_Button)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(income_Button)
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addComponent(add_new_income_jLabel)
                        .addGap(12, 12, 12)
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(method_jLabel)
                            .addComponent(salary_type_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(amount_jLabel)
                            .addComponent(amount_enter_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(date_jLabel)
                            .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                                .addComponent(note_jLabel)
                                .addGap(30, 30, 30))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        amount_enter_jTextField.getAccessibleContext().setAccessibleParent(amount_enter_jTextField);

        tablePanel.setBackground(new java.awt.Color(51, 0, 102));

        IncomeShowTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", null, "A", "001", null, null},
                {"2", null, "B", "002", null, null},
                {"3", null, "C", "003", null, null},
                {"4", null, "D", "004", null, null}
            },
            new String [] {
                "Index", "Date", "Income Type", "Note", "Amount", "Edit"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        IncomeShowTable.setMinimumSize(new java.awt.Dimension(90, 160));
        IncomeShowTable.setPreferredSize(new java.awt.Dimension(450, 160));
        IncomeShowTable.setRowHeight(40);
        IncomeShowTable.setSelectionBackground(new java.awt.Color(56, 138, 112));
        JScrollPanel1.setViewportView(IncomeShowTable);

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JScrollPanel1)
                .addContainerGap())
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JScrollPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(kGradientPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(income_goal_defict_kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tot_income_kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(45, 45, 45))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kGradientPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(tot_income_kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(income_goal_defict_kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
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

    private void income_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_income_ButtonMouseClicked
    // Retrieve income type
    String type = (String) salary_type_jComboBox.getSelectedItem();
        if (type == null) {
            JOptionPane.showMessageDialog(this, "Please select an income type.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

    // Retrieve income amount
    double income_amount;
    try {
        income_amount = Double.parseDouble(amount_enter_jTextField.getText());
        if (income_amount < 0) {
            throw new NumberFormatException("Income amount cannot be negative.");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid income amount. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Retrieve and format the date
    Date selectedDate = jDateChooser.getDate();
    if (selectedDate == null) {
         JOptionPane.showMessageDialog(this, "Please select a date.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = dateFormat.format(selectedDate);

        // Retrieve note
        String note = note_taker_jTextArea.getText();
        
        //send values to the database

        AccessOfDatabase.ValueSetterToDatabase.setIncomePerform_h2(email,type, income_amount, dateString, note);
        
        //update table
        dynamicTableUpdater();
        
        //lableupdater
        updateLableUpdate();
    }//GEN-LAST:event_income_ButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable IncomeShowTable;
    private javax.swing.JScrollPane JScrollPanel1;
    private javax.swing.JLabel add_new_income_jLabel;
    private javax.swing.JTextField amount_enter_jTextField;
    private javax.swing.JLabel amount_jLabel;
    private javax.swing.JLabel date_jLabel;
    private javax.swing.JLabel income_Button;
    private keeptoo.KGradientPanel income_goal_defict_kGradientPanel3;
    private javax.swing.JLabel incomegoal_defict;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel4;
    private javax.swing.JLabel method_jLabel;
    private javax.swing.JLabel note_jLabel;
    private javax.swing.JTextArea note_taker_jTextArea;
    private javax.swing.JComboBox<String> salary_type_jComboBox;
    private javax.swing.JPanel tablePanel;
    private keeptoo.KGradientPanel tot_income_kGradientPanel2;
    private javax.swing.JLabel totalincome_lbl;
    // End of variables declaration//GEN-END:variables
}
