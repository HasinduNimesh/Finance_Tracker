/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finanace_tracker;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import loginandsignup.Login;
import loginandsignup.UserAuthentication;

public class Home extends javax.swing.JFrame {

    private String email;
    
    public Home() {
        initComponents();
    }
    
    public Home(String email){
        this.email=email;
        initComponents();
        lbl_accemail.setText(email);
        try {
            lbl_username.setText(UserAuthentication.getUserFullName(email));
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     void SetButtonColor(JButton btn)
    {
        ResetButtonColor();
        btn.setBackground( new Color(0,0,102));
        btn.setForeground(Color.WHITE);
    }
    
    void ResetButtonColor()
    {
        btn_load_dashboard.setBackground( Color.WHITE);
        btn_load_dashboard.setForeground(Color.BLACK);
        
        btn_load_income.setBackground( Color.WHITE);
        btn_load_income.setForeground(Color.BLACK);
        
        btn_load_expenses.setBackground( Color.WHITE);
        btn_load_expenses.setForeground(Color.BLACK);
        
        btn_load_goals.setBackground( Color.WHITE);
        btn_load_goals.setForeground(Color.BLACK);
        
        btn_load_reports.setBackground( Color.WHITE);
        btn_load_reports.setForeground(Color.BLACK);
        
        btn_load_investments.setBackground( Color.WHITE);
        btn_load_investments.setForeground(Color.BLACK);
    }
    
     /*void ShowAccDetials()
    {
        CHome ch = new CHome();
        lbl_accemail.setText(acc_email);
        lbl_username.setText(ch.getFirstName(acc_email) + " " + ch.getLastName(acc_email));
    }*/
    
    public void panelPreprocessor() {
        // Assuming pane_load_ui is a JPanel
        JLayeredPane pane_load_ui = new JLayeredPane();
        // Use BorderLayout or another layout manager of your choice
        pane_load_ui.setLayout(new BorderLayout());
    }

    public void panelResetter(JPanel pnl) {
        mainPane.removeAll(); // Remove all components from mainPane
        mainPane.add(pnl, BorderLayout.CENTER); // Add pnl to mainPane
        mainPane.revalidate(); // Revalidate the mainPane to reflect the changes
        mainPane.repaint(); // Repaint the mainPane to reflect the changes
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_design1 = new javax.swing.JPanel();
        pnl_menu = new keeptoo.KGradientPanel();
        pnl_profile_info = new javax.swing.JPanel();
        lbl_pfp = new javax.swing.JLabel();
        lbl_username = new javax.swing.JLabel();
        lbl_accemail = new javax.swing.JLabel();
        btn_load_income = new javax.swing.JButton();
        btn_load_expenses = new javax.swing.JButton();
        btn_load_dashboard = new javax.swing.JButton();
        btn_load_goals = new javax.swing.JButton();
        btn_load_reports = new javax.swing.JButton();
        btn_load_logout = new javax.swing.JButton();
        btn_load_calculator = new javax.swing.JButton();
        btn_load_settings = new javax.swing.JButton();
        btn_load_investments = new javax.swing.JButton();
        mainPane = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        closeButton = new javax.swing.JLabel();
        closeButton1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnl_design1.setBackground(new java.awt.Color(0, 51, 51));
        pnl_design1.setForeground(new java.awt.Color(0, 102, 102));
        pnl_design1.setToolTipText("");

        pnl_menu.setkEndColor(new java.awt.Color(51, 0, 102));
        pnl_menu.setkGradientFocus(700);
        pnl_menu.setkStartColor(new java.awt.Color(85, 77, 222));

        pnl_profile_info.setBackground(new java.awt.Color(255, 255, 255));

        lbl_pfp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/programmer (1).png"))); // NOI18N
        lbl_pfp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_username.setFont(new java.awt.Font("MS PGothic", 1, 12)); // NOI18N
        lbl_username.setForeground(new java.awt.Color(0, 0, 0));
        lbl_username.setText("User Name");

        lbl_accemail.setFont(new java.awt.Font("MS PGothic", 0, 8)); // NOI18N
        lbl_accemail.setForeground(new java.awt.Color(0, 0, 0));
        lbl_accemail.setText("user@email.com");

        javax.swing.GroupLayout pnl_profile_infoLayout = new javax.swing.GroupLayout(pnl_profile_info);
        pnl_profile_info.setLayout(pnl_profile_infoLayout);
        pnl_profile_infoLayout.setHorizontalGroup(
            pnl_profile_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_profile_infoLayout.createSequentialGroup()
                .addComponent(lbl_pfp, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_profile_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_accemail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnl_profile_infoLayout.createSequentialGroup()
                        .addComponent(lbl_username, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 4, Short.MAX_VALUE))))
        );
        pnl_profile_infoLayout.setVerticalGroup(
            pnl_profile_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_profile_infoLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lbl_username)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_accemail)
                .addContainerGap(15, Short.MAX_VALUE))
            .addComponent(lbl_pfp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        btn_load_income.setBackground(new java.awt.Color(255, 255, 255));
        btn_load_income.setFont(new java.awt.Font("MS PGothic", 1, 18)); // NOI18N
        btn_load_income.setForeground(new java.awt.Color(0, 0, 0));
        btn_load_income.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cash.png"))); // NOI18N
        btn_load_income.setText("Incomes");
        btn_load_income.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 10));
        btn_load_income.setBorderPainted(false);
        btn_load_income.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_load_income.setFocusPainted(false);
        btn_load_income.setFocusable(false);
        btn_load_income.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_load_income.setIconTextGap(25);
        btn_load_income.setMargin(new java.awt.Insets(10, 20, 10, 20));
        btn_load_income.setPreferredSize(new java.awt.Dimension(50, 20));
        btn_load_income.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_load_incomeActionPerformed(evt);
            }
        });

        btn_load_expenses.setBackground(new java.awt.Color(255, 255, 255));
        btn_load_expenses.setFont(new java.awt.Font("MS PGothic", 1, 18)); // NOI18N
        btn_load_expenses.setForeground(new java.awt.Color(0, 0, 0));
        btn_load_expenses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/spending.png"))); // NOI18N
        btn_load_expenses.setText("Expenses");
        btn_load_expenses.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 10));
        btn_load_expenses.setBorderPainted(false);
        btn_load_expenses.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_load_expenses.setFocusPainted(false);
        btn_load_expenses.setFocusable(false);
        btn_load_expenses.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_load_expenses.setIconTextGap(25);
        btn_load_expenses.setMargin(new java.awt.Insets(10, 20, 10, 20));
        btn_load_expenses.setPreferredSize(new java.awt.Dimension(50, 20));
        btn_load_expenses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_load_expensesActionPerformed(evt);
            }
        });

        btn_load_dashboard.setBackground(new java.awt.Color(255, 255, 255));
        btn_load_dashboard.setFont(new java.awt.Font("MS PGothic", 1, 18)); // NOI18N
        btn_load_dashboard.setForeground(new java.awt.Color(0, 0, 0));
        btn_load_dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/dashboard (1).png"))); // NOI18N
        btn_load_dashboard.setText("Dashboard");
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

        btn_load_goals.setBackground(new java.awt.Color(255, 255, 255));
        btn_load_goals.setFont(new java.awt.Font("MS PGothic", 1, 18)); // NOI18N
        btn_load_goals.setForeground(new java.awt.Color(0, 0, 0));
        btn_load_goals.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/goal.png"))); // NOI18N
        btn_load_goals.setText("Goals");
        btn_load_goals.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 10));
        btn_load_goals.setBorderPainted(false);
        btn_load_goals.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_load_goals.setFocusPainted(false);
        btn_load_goals.setFocusable(false);
        btn_load_goals.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_load_goals.setIconTextGap(25);
        btn_load_goals.setMargin(new java.awt.Insets(10, 20, 10, 20));
        btn_load_goals.setPreferredSize(new java.awt.Dimension(50, 20));
        btn_load_goals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_load_goalsActionPerformed(evt);
            }
        });

        btn_load_reports.setBackground(new java.awt.Color(255, 255, 255));
        btn_load_reports.setFont(new java.awt.Font("MS PGothic", 1, 18)); // NOI18N
        btn_load_reports.setForeground(new java.awt.Color(0, 0, 0));
        btn_load_reports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/seo-report (1).png"))); // NOI18N
        btn_load_reports.setText("Reports");
        btn_load_reports.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 10));
        btn_load_reports.setBorderPainted(false);
        btn_load_reports.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_load_reports.setFocusPainted(false);
        btn_load_reports.setFocusable(false);
        btn_load_reports.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_load_reports.setIconTextGap(25);
        btn_load_reports.setMargin(new java.awt.Insets(10, 20, 10, 20));
        btn_load_reports.setPreferredSize(new java.awt.Dimension(50, 20));
        btn_load_reports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_load_reportsActionPerformed(evt);
            }
        });

        btn_load_logout.setBackground(new java.awt.Color(255, 255, 255));
        btn_load_logout.setFont(new java.awt.Font("MS PGothic", 1, 18)); // NOI18N
        btn_load_logout.setForeground(new java.awt.Color(0, 0, 0));
        btn_load_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/logout (1).png"))); // NOI18N
        btn_load_logout.setText("Log Out");
        btn_load_logout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 10));
        btn_load_logout.setBorderPainted(false);
        btn_load_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_load_logout.setFocusPainted(false);
        btn_load_logout.setFocusable(false);
        btn_load_logout.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_load_logout.setIconTextGap(25);
        btn_load_logout.setMargin(new java.awt.Insets(10, 20, 10, 20));
        btn_load_logout.setPreferredSize(new java.awt.Dimension(50, 20));
        btn_load_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_load_logoutActionPerformed(evt);
            }
        });

        btn_load_calculator.setBackground(new java.awt.Color(255, 255, 255));
        btn_load_calculator.setFont(new java.awt.Font("MS PGothic", 1, 18)); // NOI18N
        btn_load_calculator.setForeground(new java.awt.Color(0, 0, 0));
        btn_load_calculator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/budget.png"))); // NOI18N
        btn_load_calculator.setText("Calculator");
        btn_load_calculator.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 10));
        btn_load_calculator.setBorderPainted(false);
        btn_load_calculator.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_load_calculator.setFocusPainted(false);
        btn_load_calculator.setFocusable(false);
        btn_load_calculator.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_load_calculator.setIconTextGap(25);
        btn_load_calculator.setMargin(new java.awt.Insets(10, 20, 10, 20));
        btn_load_calculator.setPreferredSize(new java.awt.Dimension(50, 20));
        btn_load_calculator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_load_calculatorActionPerformed(evt);
            }
        });

        btn_load_settings.setBackground(new java.awt.Color(255, 255, 255));
        btn_load_settings.setFont(new java.awt.Font("MS PGothic", 1, 18)); // NOI18N
        btn_load_settings.setForeground(new java.awt.Color(0, 0, 0));
        btn_load_settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/gear.png"))); // NOI18N
        btn_load_settings.setText("Settings");
        btn_load_settings.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 10));
        btn_load_settings.setBorderPainted(false);
        btn_load_settings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_load_settings.setFocusPainted(false);
        btn_load_settings.setFocusable(false);
        btn_load_settings.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_load_settings.setIconTextGap(25);
        btn_load_settings.setMargin(new java.awt.Insets(10, 20, 10, 20));
        btn_load_settings.setPreferredSize(new java.awt.Dimension(50, 20));
        btn_load_settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_load_settingsActionPerformed(evt);
            }
        });

        btn_load_investments.setBackground(new java.awt.Color(255, 255, 255));
        btn_load_investments.setFont(new java.awt.Font("MS PGothic", 1, 18)); // NOI18N
        btn_load_investments.setForeground(new java.awt.Color(0, 0, 0));
        btn_load_investments.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/earning.png"))); // NOI18N
        btn_load_investments.setText("Investments");
        btn_load_investments.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 10));
        btn_load_investments.setBorderPainted(false);
        btn_load_investments.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_load_investments.setFocusPainted(false);
        btn_load_investments.setFocusable(false);
        btn_load_investments.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_load_investments.setIconTextGap(25);
        btn_load_investments.setMargin(new java.awt.Insets(10, 20, 10, 20));
        btn_load_investments.setPreferredSize(new java.awt.Dimension(50, 20));
        btn_load_investments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_load_investmentsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_menuLayout = new javax.swing.GroupLayout(pnl_menu);
        pnl_menu.setLayout(pnl_menuLayout);
        pnl_menuLayout.setHorizontalGroup(
            pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_menuLayout.createSequentialGroup()
                .addGroup(pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_load_logout, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_load_reports, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_load_dashboard, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_load_income, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_load_expenses, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_load_goals, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_profile_info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_load_calculator, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_load_settings, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_load_investments, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_menuLayout.setVerticalGroup(
            pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_menuLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(pnl_profile_info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btn_load_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_load_income, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_load_expenses, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_load_investments, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_load_goals, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_load_reports, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_load_calculator, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(btn_load_settings, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_load_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout pnl_design1Layout = new javax.swing.GroupLayout(pnl_design1);
        pnl_design1.setLayout(pnl_design1Layout);
        pnl_design1Layout.setHorizontalGroup(
            pnl_design1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_design1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(pnl_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        pnl_design1Layout.setVerticalGroup(
            pnl_design1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mainPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mainPane.setMaximumSize(new java.awt.Dimension(788, 600));
        mainPane.setPreferredSize(new java.awt.Dimension(788, 600));
        mainPane.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setForeground(new java.awt.Color(0, 51, 51));
        jPanel1.setToolTipText("");

        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cross (2).png"))); // NOI18N
        closeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });

        closeButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/web-page.png"))); // NOI18N
        closeButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(724, Short.MAX_VALUE)
                .addComponent(closeButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closeButton)
                .addGap(5, 5, 5))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(closeButton)
                    .addComponent(closeButton1))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_design1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(pnl_design1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_load_incomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_load_incomeActionPerformed
        panelPreprocessor();
        ResetButtonColor();
        SetButtonColor(btn_load_income);
        // Assuming pnl is an instance of the Dashboard panel 
        Income pnl = new Income();
        panelResetter(pnl);
    }//GEN-LAST:event_btn_load_incomeActionPerformed

    private void btn_load_expensesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_load_expensesActionPerformed
        panelPreprocessor();
        ResetButtonColor();
        SetButtonColor(btn_load_expenses);
        // Assuming pnl is an instance of the Dashboard panel 
        Expenses pnl = new Expenses(email);
        panelResetter(pnl);
    }//GEN-LAST:event_btn_load_expensesActionPerformed

    private void btn_load_dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_load_dashboardActionPerformed
        panelPreprocessor();
        ResetButtonColor();
        SetButtonColor(btn_load_dashboard);
        // Assuming pnl is an instance of the Dashboard panel 
        Dashboard pnl = new Dashboard(email);
        panelResetter(pnl);
    }//GEN-LAST:event_btn_load_dashboardActionPerformed

    private void btn_load_goalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_load_goalsActionPerformed
        panelPreprocessor();
        ResetButtonColor();
        SetButtonColor(btn_load_goals);
        // Assuming pnl is an instance of the Dashboard panel 
        Goals pnl = new Goals(email );
        panelResetter(pnl);
    }//GEN-LAST:event_btn_load_goalsActionPerformed

    private void btn_load_reportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_load_reportsActionPerformed

    }//GEN-LAST:event_btn_load_reportsActionPerformed

    private void btn_load_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_load_logoutActionPerformed
        dispose();
        Login LogInFrame = new Login();
        LogInFrame.setVisible(true);
        LogInFrame.pack();
    }//GEN-LAST:event_btn_load_logoutActionPerformed

    private void btn_load_calculatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_load_calculatorActionPerformed
        panelPreprocessor();
        ResetButtonColor();
        SetButtonColor(btn_load_calculator);
        // Assuming pnl is an instance of the Dashboard panel 
        Calculator pnl = new Calculator();
        panelResetter(pnl);
    }//GEN-LAST:event_btn_load_calculatorActionPerformed

    private void btn_load_settingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_load_settingsActionPerformed
        panelPreprocessor();
        ResetButtonColor();
        SetButtonColor(btn_load_settings);
        // Assuming pnl is an instance of the Dashboard panel 
        Settings pnl = new Settings(email);
        panelResetter(pnl);
    }//GEN-LAST:event_btn_load_settingsActionPerformed

    private void btn_load_investmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_load_investmentsActionPerformed
        panelPreprocessor();
        ResetButtonColor();
        SetButtonColor(btn_load_investments);
        // Assuming pnl is an instance of the Dashboard panel 
        Investment pnl = new Investment();
        panelResetter(pnl);
    }//GEN-LAST:event_btn_load_investmentsActionPerformed

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        dispose();
    }//GEN-LAST:event_closeButtonMouseClicked

    private void closeButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButton1MouseClicked
        setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_closeButton1MouseClicked

    

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_load_calculator;
    private javax.swing.JButton btn_load_dashboard;
    private javax.swing.JButton btn_load_expenses;
    private javax.swing.JButton btn_load_goals;
    private javax.swing.JButton btn_load_income;
    private javax.swing.JButton btn_load_investments;
    private javax.swing.JButton btn_load_logout;
    private javax.swing.JButton btn_load_reports;
    private javax.swing.JButton btn_load_settings;
    private javax.swing.JLabel closeButton;
    private javax.swing.JLabel closeButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_accemail;
    private javax.swing.JLabel lbl_pfp;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JLayeredPane mainPane;
    private javax.swing.JPanel pnl_design1;
    private keeptoo.KGradientPanel pnl_menu;
    private javax.swing.JPanel pnl_profile_info;
    // End of variables declaration//GEN-END:variables
}
