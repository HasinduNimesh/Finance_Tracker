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
public class Settings extends javax.swing.JPanel {

    /**
     * Creates new form Expenses
     */
    public Settings() {
        initComponents();
     
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
        btn_load_dashboard = new javax.swing.JButton();

        kGradientPanel1.setkEndColor(new java.awt.Color(51, 0, 102));
        kGradientPanel1.setkStartColor(new java.awt.Color(85, 77, 222));

        btn_load_dashboard.setBackground(new java.awt.Color(255, 255, 255));
        btn_load_dashboard.setFont(new java.awt.Font("MS PGothic", 1, 18)); // NOI18N
        btn_load_dashboard.setForeground(new java.awt.Color(0, 0, 0));
        btn_load_dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/dashboard (1).png"))); // NOI18N
        btn_load_dashboard.setText("EDIT USER DETAILS");
        btn_load_dashboard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 10));
        btn_load_dashboard.setBorderPainted(false);
        btn_load_dashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_load_dashboard.setFocusPainted(false);
        btn_load_dashboard.setFocusable(false);
        btn_load_dashboard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_load_dashboard.setIconTextGap(25);
        btn_load_dashboard.setMargin(new java.awt.Insets(10, 20, 10, 20));
        btn_load_dashboard.setPreferredSize(new java.awt.Dimension(50, 20));
        btn_load_dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_load_dashboardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btn_load_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(510, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btn_load_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(531, Short.MAX_VALUE))
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

    private void btn_load_dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_load_dashboardActionPerformed

    }//GEN-LAST:event_btn_load_dashboardActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_load_dashboard;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
