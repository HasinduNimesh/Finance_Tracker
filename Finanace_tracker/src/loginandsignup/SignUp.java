package loginandsignup;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.JFrame;


public class SignUp extends javax.swing.JFrame {

    public SignUp() {
        initComponents();
        //Setting the Header Icon
        Image headerIcon = new ImageIcon(this.getClass().getResource("logo.png")).getImage();
        this.setIconImage(headerIcon);
        
        //setting password hide character
        signUpPassword.setEchoChar('\u25cf');
        signUpPasswordConf.setEchoChar('\u25cf');
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lastName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        signUpEmail = new javax.swing.JTextField();
        signUpPassword = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        signUpPasswordConf = new javax.swing.JPasswordField();
        signUpButton = new javax.swing.JButton();
        signInRedirectButton = new javax.swing.JButton();
        fNameLbl = new javax.swing.JLabel();
        lNameLbl = new javax.swing.JLabel();
        signUpEmailLbl = new javax.swing.JLabel();
        signUpPasswordLbl = new javax.swing.JLabel();
        signUpPassConfLbl = new javax.swing.JLabel();
        noticeLbl = new javax.swing.JLabel();
        passConfToggleButton = new javax.swing.JToggleButton();
        passToggleButton = new javax.swing.JToggleButton();
        closeButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign Up");
        setMinimumSize(new java.awt.Dimension(800, 500));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginandsignup/logo.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(0, 102, 102));
        jLabel2.setFont(new java.awt.Font("Viner Hand ITC", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Finance Tracker");

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Copyright @FinanceTracker All Rights Reserved");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(77, 77, 77))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel6)
                .addGap(0, 64, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(55, 55, 55))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 400, 500);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Sign Up");

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("First Name");

        firstName.setBackground(new java.awt.Color(255, 255, 255));
        firstName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        firstName.setForeground(new java.awt.Color(0, 0, 0));
        firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameActionPerformed(evt);
            }
        });
        firstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                firstNameKeyPressed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Last Name");

        lastName.setBackground(new java.awt.Color(255, 255, 255));
        lastName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lastName.setForeground(new java.awt.Color(0, 0, 0));
        lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameActionPerformed(evt);
            }
        });
        lastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lastNameKeyPressed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(102, 102, 102));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Email");

        jLabel8.setBackground(new java.awt.Color(102, 102, 102));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Password");

        signUpEmail.setBackground(new java.awt.Color(255, 255, 255));
        signUpEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        signUpEmail.setForeground(new java.awt.Color(0, 0, 0));
        signUpEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpEmailActionPerformed(evt);
            }
        });
        signUpEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                signUpEmailKeyPressed(evt);
            }
        });

        signUpPassword.setBackground(new java.awt.Color(255, 255, 255));
        signUpPassword.setForeground(new java.awt.Color(0, 0, 0));
        signUpPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpPasswordActionPerformed(evt);
            }
        });
        signUpPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                signUpPasswordKeyPressed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(102, 102, 102));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Confirm Password");

        signUpPasswordConf.setBackground(new java.awt.Color(255, 255, 255));
        signUpPasswordConf.setForeground(new java.awt.Color(0, 0, 0));
        signUpPasswordConf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpPasswordConfActionPerformed(evt);
            }
        });
        signUpPasswordConf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                signUpPasswordConfKeyPressed(evt);
            }
        });

        signUpButton.setBackground(new java.awt.Color(0, 102, 102));
        signUpButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        signUpButton.setForeground(new java.awt.Color(255, 255, 255));
        signUpButton.setText("Sign Up");
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });

        signInRedirectButton.setBackground(new java.awt.Color(255, 255, 255));
        signInRedirectButton.setForeground(new java.awt.Color(255, 51, 51));
        signInRedirectButton.setText("Back");
        signInRedirectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInRedirectButtonActionPerformed(evt);
            }
        });

        fNameLbl.setBackground(new java.awt.Color(255, 255, 255));
        fNameLbl.setForeground(new java.awt.Color(255, 0, 0));

        lNameLbl.setBackground(new java.awt.Color(255, 255, 255));
        lNameLbl.setForeground(new java.awt.Color(255, 0, 0));

        signUpEmailLbl.setBackground(new java.awt.Color(255, 255, 255));
        signUpEmailLbl.setForeground(new java.awt.Color(255, 0, 0));

        signUpPasswordLbl.setBackground(new java.awt.Color(255, 255, 255));
        signUpPasswordLbl.setForeground(new java.awt.Color(255, 0, 0));

        signUpPassConfLbl.setBackground(new java.awt.Color(255, 255, 255));
        signUpPassConfLbl.setForeground(new java.awt.Color(255, 0, 0));

        noticeLbl.setBackground(new java.awt.Color(255, 255, 255));
        noticeLbl.setForeground(new java.awt.Color(255, 0, 0));

        passConfToggleButton.setBackground(new java.awt.Color(255, 255, 255));
        passConfToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginandsignup/eye-line.png"))); // NOI18N
        passConfToggleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passConfToggleButtonMouseClicked(evt);
            }
        });
        passConfToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passConfToggleButtonActionPerformed(evt);
            }
        });

        passToggleButton.setBackground(new java.awt.Color(255, 255, 255));
        passToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginandsignup/eye-line.png"))); // NOI18N
        passToggleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passToggleButtonMouseClicked(evt);
            }
        });
        passToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passToggleButtonActionPerformed(evt);
            }
        });

        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cross (2).png"))); // NOI18N
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(noticeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 57, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(101, 101, 101)
                        .addComponent(closeButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(signUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(signInRedirectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(signUpEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(signUpPasswordConf, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(signUpPassword, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(passConfToggleButton)
                                    .addComponent(passToggleButton))))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(signUpEmailLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(signUpPasswordLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(signUpPassConfLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)))
                        .addGap(10, 10, 10))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addComponent(closeButton))
                .addGap(11, 11, 11)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(signUpEmailLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signUpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(signUpPassword)
                    .addComponent(signUpPasswordLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passToggleButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(signUpPassConfLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(signUpPasswordConf)
                    .addComponent(passConfToggleButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addComponent(noticeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signInRedirectButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(400, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameActionPerformed

    private void lastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameActionPerformed

    private void signUpEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signUpEmailActionPerformed

    private void signUpPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signUpPasswordActionPerformed

    private void signUpPasswordConfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpPasswordConfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signUpPasswordConfActionPerformed

    //'?' and label remover
    private void emptySymbolRemover(){
            fNameLbl.setText("");
            lNameLbl.setText("");
            signUpEmailLbl.setText("");
            signUpPasswordLbl.setText("");
            signUpPassConfLbl.setText("");
            noticeLbl.setText("");
    }
    
    //This method is used to perform the sign up procedure
    private void signUpActionPerformer(){
        String dbfName, dblName, dbEmail, dbPassword, querry;
        
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MySQL://localhost:3306/java_user_database";
        SUser = "root";
        SPass = "";
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();
            
            if(firstName.getText().trim().isEmpty() && (lastName.getText().trim().isEmpty()) && (signUpEmail.getText().trim().isEmpty()) && (signUpPassword.getText().trim().isEmpty()) && (signUpPasswordConf.getText().trim().isEmpty())){
            fNameLbl.setText("?");
            lNameLbl.setText("?");
            signUpEmailLbl.setText("?");
            signUpPasswordLbl.setText("?");
            signUpPassConfLbl.setText("?");
            noticeLbl.setText("'?' shows the required fields");
            //JOptionPane.showMessageDialog(this, "Registration Failed!");
        }else if(firstName.getText().trim().isEmpty()){
            fNameLbl.setText("?");
            lNameLbl.setText("");
            signUpEmailLbl.setText("");
            signUpPasswordLbl.setText("");
            signUpPassConfLbl.setText("");
            noticeLbl.setText("'?' shows the required fields");
        }else if(lastName.getText().trim().isEmpty()){
            fNameLbl.setText("");
            lNameLbl.setText("?");
            signUpEmailLbl.setText("");
            signUpPasswordLbl.setText("");
            signUpPassConfLbl.setText("");
            noticeLbl.setText("'?' shows the required fields");
        }else if(signUpEmail.getText().trim().isEmpty()){
            fNameLbl.setText("");
            lNameLbl.setText("");
            signUpEmailLbl.setText("?");
            signUpPasswordLbl.setText("");
            signUpPassConfLbl.setText("");
            noticeLbl.setText("'?' shows the required fields");
        }else if(signUpPassword.getText().trim().isEmpty()){
            fNameLbl.setText("");
            lNameLbl.setText("");
            signUpEmailLbl.setText("");
            signUpPasswordLbl.setText("?");
            signUpPassConfLbl.setText("");
            noticeLbl.setText("'?' shows the required fields");
        }else if(signUpPasswordConf.getText().trim().isEmpty()){
            fNameLbl.setText("");
            lNameLbl.setText("");
            signUpEmailLbl.setText("");
            signUpPasswordLbl.setText("");
            signUpPassConfLbl.setText("?");
            noticeLbl.setText("'?' shows the required fields");
        }else if(ValidateData.validateNames(firstName)=="Invalid"){
            emptySymbolRemover();
            JOptionPane.showMessageDialog(new JFrame(), "First Name is Invalid", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(ValidateData.validateNames(lastName)=="Invalid"){
            emptySymbolRemover();
            JOptionPane.showMessageDialog(new JFrame(), "Last Name is Invalid", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(ValidateData.validateEmail(signUpEmail)=="Invalid"){
            emptySymbolRemover();
            JOptionPane.showMessageDialog(new JFrame(), "Email is Invalid", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(ValidateData.validatePassword(signUpPassword)=="Invalid"){
            emptySymbolRemover();
            JOptionPane.showMessageDialog(new JFrame(), "Your password must have 8 or more characters including at least one uppercase letter, one lowercase letter,"
                    + " one digit, and one special character for added security. Please re-enter your password ",
                    "Error", JOptionPane.ERROR_MESSAGE);
            signUpPassword.setText("");
            signUpPasswordConf.setText("");
        }else if(!(new String(signUpPassword.getPassword()).equals(new String(signUpPasswordConf.getPassword())))){
            emptySymbolRemover();
            JOptionPane.showMessageDialog(new JFrame(), "Passwords do not match!", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            emptySymbolRemover();
            
            dbfName = firstName.getText();
            dblName = lastName.getText();
            dbEmail = signUpEmail.getText();
            dbPassword = signUpPassword.getText();
            
            UserAuthentication.registerUser(dbfName, dblName, dbEmail, dbPassword);
            querry = "INSERT INTO signup_user(fName, lName, email, password)"+"VALUES('"+dbfName+"','"+dblName+"','"+dbEmail+"','"+dbPassword+"')";
            st.execute(querry);
            
            firstName.setText("");
            lastName.setText("");
            signUpEmail.setText("");
            signUpPassword.setText("");
            signUpPasswordConf.setText("");
            
            JOptionPane.showMessageDialog(this, "Your Account has been created Successfully!");
        }
            
        }catch(Exception e){
            System.out.println("Error!"+ e.getMessage());
        }
        
    }
    
    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        // TODO add your handling code here:
        signUpActionPerformer();
        signUpActionPerformerH2();
        
    }//GEN-LAST:event_signUpButtonActionPerformed

    private void signUpActionPerformerH2() {
        
        
    }


    private void signInRedirectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInRedirectButtonActionPerformed
        Login LogInFrame = new Login();
        LogInFrame.setVisible(true);
        LogInFrame.pack();
        LogInFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_signInRedirectButtonActionPerformed

    private void firstNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstNameKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        lastName.requestFocus();
    }//GEN-LAST:event_firstNameKeyPressed

    private void lastNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastNameKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        signUpEmail.requestFocus();
    }//GEN-LAST:event_lastNameKeyPressed

    private void signUpEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_signUpEmailKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        signUpPassword.requestFocus();
    }//GEN-LAST:event_signUpEmailKeyPressed

    private void signUpPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_signUpPasswordKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        signUpPasswordConf.requestFocus();
    }//GEN-LAST:event_signUpPasswordKeyPressed

    private void signUpPasswordConfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_signUpPasswordConfKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           signUpActionPerformer();
        }
    }//GEN-LAST:event_signUpPasswordConfKeyPressed

    private void passToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passToggleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passToggleButtonActionPerformed

    private void passConfToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passConfToggleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passConfToggleButtonActionPerformed

    private void passToggleButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passToggleButtonMouseClicked
        // TODO add your handling code here:
        if(passToggleButton.isSelected()){
            signUpPassword.setEchoChar((char)0);
            passToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("eye-close-line.png")));
        }else{
            signUpPassword.setEchoChar('\u25cf');
            passToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("eye-line.png")));
        }
    }//GEN-LAST:event_passToggleButtonMouseClicked

    private void passConfToggleButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passConfToggleButtonMouseClicked
        // TODO add your handling code here:
        if(passConfToggleButton.isSelected()){
            signUpPasswordConf.setEchoChar((char)0);
            passConfToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("eye-close-line.png")));
        }else{
            signUpPasswordConf.setEchoChar('\u25cf');
            passConfToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("eye-line.png")));
        }
    }//GEN-LAST:event_passConfToggleButtonMouseClicked

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        dispose();
    }//GEN-LAST:event_closeButtonMouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closeButton;
    private javax.swing.JLabel fNameLbl;
    private javax.swing.JTextField firstName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lNameLbl;
    private javax.swing.JTextField lastName;
    private javax.swing.JLabel noticeLbl;
    private javax.swing.JToggleButton passConfToggleButton;
    private javax.swing.JToggleButton passToggleButton;
    private javax.swing.JButton signInRedirectButton;
    private javax.swing.JButton signUpButton;
    private javax.swing.JTextField signUpEmail;
    private javax.swing.JLabel signUpEmailLbl;
    private javax.swing.JLabel signUpPassConfLbl;
    private javax.swing.JPasswordField signUpPassword;
    private javax.swing.JPasswordField signUpPasswordConf;
    private javax.swing.JLabel signUpPasswordLbl;
    // End of variables declaration//GEN-END:variables
}
