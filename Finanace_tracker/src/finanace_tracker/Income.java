/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package finanace_tracker;

import com.formdev.flatlaf.FlatClientProperties;
import raven_cell.TableActionButtonRender;

/**
 *
 * @author ASUS
 */
public class Income extends javax.swing.JPanel {

    /**
     * Creates new form Expenses
     */
    public Income() {
        initComponents();
        IncomeShowTable.getColumnModel().getColumn(3).setCellRenderer(new TableActionButtonRender());
        
        //Color changes of table
        IncomeShowTable.setDefaultRenderer(Object.class, new TableGradientFun());
        tablePanel.putClientProperty(FlatClientProperties.STYLE,"border:1,1,1,1,$TableHeader.bottomSeparatorColor,,10");
        IncomeShowTable.getTableHeader().putClientProperty(FlatClientProperties.STYLE, "hoverBackground:null;"
                + "pressedBackground:null;"
                + "separatorColor:$TableHeader.background");
        TableScroll.putClientProperty(FlatClientProperties.STYLE, "border:3,0,3,0,$Table.background,10,10");
        TableScroll.getVerticalScrollBar().putClientProperty(FlatClientProperties.STYLE,"hoverTrackColor:null");
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
        jLabel7 = new javax.swing.JLabel();
        income_goal_defict_kGradientPanel3 = new keeptoo.KGradientPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        add_new_income_jLabel = new javax.swing.JLabel();
        method_jLabel = new javax.swing.JLabel();
        salary_type_jComboBox = new javax.swing.JComboBox<>();
        amount_jLabel = new javax.swing.JLabel();
        note_jLabel = new javax.swing.JLabel();
        amount_enter_jTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        note_taker_jTextArea = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        date_jLabel = new javax.swing.JLabel();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        tablePanel = new javax.swing.JPanel();
        TableScroll = new javax.swing.JScrollPane();
        IncomeShowTable = new javax.swing.JTable();

        kGradientPanel1.setkEndColor(new java.awt.Color(51, 0, 102));
        kGradientPanel1.setkStartColor(new java.awt.Color(85, 77, 222));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("TOTAL INCOME");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("0.00");

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
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tot_income_kGradientPanel2Layout.setVerticalGroup(
            tot_income_kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tot_income_kGradientPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel6.setText("INCOME GOAL DEFICIT");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("0.00");

        javax.swing.GroupLayout income_goal_defict_kGradientPanel3Layout = new javax.swing.GroupLayout(income_goal_defict_kGradientPanel3);
        income_goal_defict_kGradientPanel3.setLayout(income_goal_defict_kGradientPanel3Layout);
        income_goal_defict_kGradientPanel3Layout.setHorizontalGroup(
            income_goal_defict_kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(income_goal_defict_kGradientPanel3Layout.createSequentialGroup()
                .addGroup(income_goal_defict_kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(income_goal_defict_kGradientPanel3Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        kGradientPanel4.setkStartColor(new java.awt.Color(29, 103, 103));

        add_new_income_jLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        add_new_income_jLabel.setText("ADD NEW INCOME");

        method_jLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        method_jLabel.setText("Method");

        salary_type_jComboBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        salary_type_jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Basic Salary", "Overtime", "Bonus", "Commission", "Allowances", "Rental Income", "Investment Income", "Freelance Work", "Business Income", "Pension/Retirement Benefits", "Other" }));

        amount_jLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        amount_jLabel.setText("Amount");

        note_jLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        note_jLabel.setText("Note");

        amount_enter_jTextField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        note_taker_jTextArea.setColumns(20);
        note_taker_jTextArea.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        note_taker_jTextArea.setRows(5);
        jScrollPane1.setViewportView(note_taker_jTextArea);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/dollar.png"))); // NOI18N

        date_jLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        date_jLabel.setText("Date");

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
                        .addComponent(jLabel9)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
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

        tablePanel.setBackground(new java.awt.Color(51, 0, 102));

        IncomeShowTable.setBackground(new java.awt.Color(153, 255, 255));
        IncomeShowTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        IncomeShowTable.setForeground(new java.awt.Color(0, 0, 0));
        IncomeShowTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Index", "Date", "Income Type", "Note", "Amount", "Edit"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        IncomeShowTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        IncomeShowTable.setGridColor(new java.awt.Color(0, 0, 0));
        IncomeShowTable.setRowHeight(40);
        TableScroll.setViewportView(IncomeShowTable);

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TableScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
                .addContainerGap())
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(18, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable IncomeShowTable;
    private javax.swing.JScrollPane TableScroll;
    private javax.swing.JLabel add_new_income_jLabel;
    private javax.swing.JTextField amount_enter_jTextField;
    private javax.swing.JLabel amount_jLabel;
    private javax.swing.JLabel date_jLabel;
    private keeptoo.KGradientPanel income_goal_defict_kGradientPanel3;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel4;
    private javax.swing.JLabel method_jLabel;
    private javax.swing.JLabel note_jLabel;
    private javax.swing.JTextArea note_taker_jTextArea;
    private javax.swing.JComboBox<String> salary_type_jComboBox;
    private javax.swing.JPanel tablePanel;
    private keeptoo.KGradientPanel tot_income_kGradientPanel2;
    // End of variables declaration//GEN-END:variables
}
