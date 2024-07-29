/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package finanace_tracker;


import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import loginandsignup.UserAuthentication;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.SQLException;


public class Report extends javax.swing.JPanel {

    private String userName = "";
    private String email = "";

    public Report(String email) {
    initComponents();
    this.email = email;

    PDF.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            generatePDF();
        }
    });

    Refresh.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            refreshTable();
        }
    });

    // Call saveDataToFile to read data from the database and save it to a .txt file
    saveDataToFile();
} 


    private void generatePDF() {
        String path = "";
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x = j.showSaveDialog(null);

        if (x == JFileChooser.APPROVE_OPTION) {
            path = j.getSelectedFile().getAbsolutePath();
        } else {
            return;
        }

        Document doc = new Document();

        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path + "\\Expense.pdf"));
            doc.open();

            // Add user details
            doc.add(new Paragraph("User Name  : " + userName));
            doc.add(new Paragraph("User ID        : " + email));
            doc.add(new Paragraph(" ")); // Add a blank line

            // Add title and subtitle
            Paragraph title = new Paragraph("Finance Tracker");
            title.setAlignment(Paragraph.ALIGN_CENTER);
            doc.add(title);

            Paragraph subtitle = new Paragraph("Monthly Report");
            subtitle.setAlignment(Paragraph.ALIGN_CENTER);
            doc.add(subtitle);

            doc.add(new Paragraph(" ")); // Add a blank line

            doc.add(new Paragraph("||         Income Table"));// Add a blank line
            doc.add(new Paragraph(" "));
            
            // Add Income Table
            PdfPTable incomeTbl = new PdfPTable(4); // Create a table with 5 columns
            incomeTbl.addCell("Income Type");
            incomeTbl.addCell("Amount");
            incomeTbl.addCell("Date");
            incomeTbl.addCell("Note");

            DefaultTableModel incomeModel = (DefaultTableModel) Income_Table.getModel();
            for (int i = 0; i < incomeModel.getRowCount(); i++) {
                for (int k = 0; k < incomeModel.getColumnCount(); k++) {
                    incomeTbl.addCell(incomeModel.getValueAt(i, k).toString());
                }
            }
            doc.add(incomeTbl);
            
            
            doc.add(new Paragraph(" ")); // Add a blank line
            doc.add(new Paragraph(" ")); // Add a blank line
            doc.add(new Paragraph("||         Expense Table"));// Add a blank line
            doc.add(new Paragraph(" "));
            
            // Add Expense Table
            PdfPTable expenseTbl = new PdfPTable(4); // Create a table with 5 columns
            expenseTbl.addCell("Expense Type");
            expenseTbl.addCell("Amount");
            expenseTbl.addCell("Date");
            expenseTbl.addCell("Note");

            DefaultTableModel expenseModel = (DefaultTableModel) Expences_Table.getModel();
            for (int i = 0; i < expenseModel.getRowCount(); i++) {
                for (int k = 0; k < expenseModel.getColumnCount(); k++) {
                    expenseTbl.addCell(expenseModel.getValueAt(i, k).toString());
                }
            }
            doc.add(expenseTbl);

            doc.add(new Paragraph(" ")); // Add a blank line
            doc.add(new Paragraph(" ")); // Add a blank line
            doc.add(new Paragraph("||         Goal Table"));// Add a blank line
            doc.add(new Paragraph(" "));
            
            // Add Goal Table
            PdfPTable goalTbl = new PdfPTable(4); // Create a table with 5 columns
            goalTbl.addCell("Goal Type");
            goalTbl.addCell("Amount");
            goalTbl.addCell("Start Date");
            goalTbl.addCell("End Date");

            DefaultTableModel goalModel = (DefaultTableModel) Goal_Table.getModel();
            for (int i = 0; i < goalModel.getRowCount(); i++) {
                for (int k = 0; k < goalModel.getColumnCount(); k++) {
                    goalTbl.addCell(goalModel.getValueAt(i, k).toString());
                }
            }
            doc.add(goalTbl);

            doc.add(new Paragraph(" ")); // Add a blank line
            doc.add(new Paragraph(" ")); // Add a blank line
            doc.add(new Paragraph("||         Investment Table"));// Add a blank line
            doc.add(new Paragraph(" "));
            
            // Add Investment Table
            PdfPTable investmentTbl = new PdfPTable(4); // Create a table with 5 columns
            investmentTbl.addCell("Investment Type");
            investmentTbl.addCell("Amount");
            investmentTbl.addCell("Date");
            investmentTbl.addCell("Note");

            DefaultTableModel investmentModel = (DefaultTableModel) Invesment_Table.getModel();
            for (int i = 0; i < investmentModel.getRowCount(); i++) {
                for (int k = 0; k < investmentModel.getColumnCount(); k++) {
                    investmentTbl.addCell(investmentModel.getValueAt(i, k).toString());
                }
            }
            doc.add(investmentTbl);

            JOptionPane.showMessageDialog(null, "PDF Generated");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Something went wrong: " + e.getMessage());
        } finally {
            if (doc != null) {
                doc.close();
            }
        }
    }

    private void refreshTable() {
        String filePath = System.getProperty("user.dir") + "/Table.txt";
        File file = new File(filePath);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            // Read user details
            String userLine = br.readLine();
            String[] userDetails = userLine.split("/");
            userName = userDetails[1];
            email = userDetails[2];

            DefaultTableModel incomeModel = (DefaultTableModel) Income_Table.getModel();
            DefaultTableModel expenseModel = (DefaultTableModel) Expences_Table.getModel();
            DefaultTableModel goalModel = (DefaultTableModel) Goal_Table.getModel();
            DefaultTableModel investmentModel = (DefaultTableModel) Invesment_Table.getModel();

            incomeModel.setRowCount(0);
            expenseModel.setRowCount(0);
            goalModel.setRowCount(0);
            investmentModel.setRowCount(0);

            String line;
            while ((line = br.readLine()) != null) {
                String[] dataRow = line.split("/");
                switch (dataRow[0]) {
                    case "Income":
                        incomeModel.addRow(new Object[]{dataRow[1], dataRow[2], dataRow[3], dataRow[4]});
                        break;
                    case "Expense":
                        expenseModel.addRow(new Object[]{dataRow[1], dataRow[2], dataRow[3], dataRow[4]});
                        break;
                    case "Goal":
                        goalModel.addRow(new Object[]{dataRow[1], dataRow[2], dataRow[3], dataRow[4], dataRow[5]});
                        break;
                    case "Investment":
                        investmentModel.addRow(new Object[]{dataRow[1], dataRow[2], dataRow[3], dataRow[4]});
                        break;
                }
            }

        } catch (IOException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void saveDataToFile() {
        /* 
    String url = "jdbc:mysql://localhost:3306/yourdatabase"; // Update with your database URL
    String user = "yourusername"; // Update with your database username
    String password = "yourpassword"; // Update with your database password
*/
String jdbcUrlLogin = "jdbc:sqlite:C:\\Users\\ASUS\\OneDrive - General Sir John Kotelawala Defence University\\Documents\\NetBeansProjects\\Finanace_tracker\\src\\loginandsignup\\database\\userPasswords.db";
String jdbcUrl = "jdbc:sqlite:C:\\Users\\ASUS\\OneDrive - General Sir John Kotelawala Defence University\\Documents\\NetBeansProjects\\Finanace_tracker\\src\\loginandsignup\\database\\userDetailDatabase.db";


     String fullname=UserAuthentication.getUserFullName(email);



   // String filePath = "D:\\Documents\\oop lab sheets\\Practicle exam\\Reporter\\src\\reporter\\Table.txt"; // Path to the file
    String filePath = System.getProperty("user.dir") + "/Table.txt";


   // try (Connection conn = DriverManager.getConnection(url, user, password);
    //     Statement stmt = conn.createStatement();
     //    BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
        // Query to get user details
        String userQuery = "SELECT * FROM UserDetails WHERE email = 1"; // Adjust the query as per your database schema
      //  ResultSet userRs = stmt.executeQuery(userQuery);
       // if (userRs.next()) {
       //     userName = userRs.getString("userName");
           // email = userRs.getString("email");
            writer.write("User/" + fullname + "/" + email);
            writer.newLine();
        //}
        Connection connection = null;
        Statement statement = null;
        try {
            // Load SQLite JDBC driver
            Class.forName("org.sqlite.JDBC");

            // Establish database connection
            connection = DriverManager.getConnection(jdbcUrl);
            System.out.println("Connected to database");
            
            statement = connection.createStatement();

          
        // Query to get income details // CONNECT TO HASII
        String incomeQuery = "SELECT * FROM setIncome";
        ResultSet incomeRs = statement.executeQuery(incomeQuery);
        while (incomeRs.next()) {
            writer.write("Income/" + incomeRs.getString("Income_Type") + "/" + incomeRs.getString("Amount") + "/"
                    + incomeRs.getString("Date") + "/" + incomeRs.getString("Note"));
            writer.newLine();
        }

        // Query to get expense details
        String expenseQuery = "SELECT * FROM setExpenses";
        ResultSet expenseRs = statement.executeQuery(expenseQuery);
        while (expenseRs.next()) {
            writer.write("Expense/" + expenseRs.getString("Expense_Type") + "/" + expenseRs.getString("Amount") + "/"
                    + expenseRs.getString("Date") + "/" + expenseRs.getString("Note"));
            writer.newLine();
        }

        // Query to get income_goal details
        String incomegoalQuery = "SELECT * FROM incomeGoals";
        ResultSet incomegoalRs = statement.executeQuery(incomegoalQuery);
        while (incomegoalRs.next()) {
            writer.write("Goal/" + incomegoalRs.getString("Goal_Type") + "/" + goalRs.getString("Amount") + "/"
                    + incomegoalRs.getString("Start_Date") + "/" + incomegoalRs.getString("End_Date"));
            writer.newLine();
        }
         // Query to get expense_goal details
         String expensesgoalQuery = "SELECT * FROM expensesGoals";
         ResultSet expensegoalRs = statement.executeQuery(expensesgoalQuery);
         while (expensegoalRs.next()) {
             writer.write("Goal/" + expensegoalRs.getString("Goal_Type") + "/" + goalRs.getString("Amount") + "/"
                     + expensegoalRs.getString("Start_Date") + "/" + goalRs.getString("End_Date"));
             writer.newLine();
         }
 

        // Query to get investment details
        String investmentQuery = "SELECT * FROM setInvestments";
        ResultSet investmentRs = statement.executeQuery(investmentQuery);
        while (investmentRs.next()) {
            writer.write("Investment/" + investmentRs.getString("Investment_Type") + "/" + investmentRs.getString("Amount") + "/"
                    + investmentRs.getString("Date") + "/" + investmentRs.getString("Note"));
            writer.newLine();
        }

        JOptionPane.showMessageDialog(null, "Data saved to file successfully");

    } catch (SQLException | IOException e) {
        Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, e);
        JOptionPane.showMessageDialog(null, "Something went wrong: " + e.getMessage());
    }
}

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        jLabel9 = new javax.swing.JLabel();
        PDF = new javax.swing.JButton();
        Refresh = new javax.swing.JButton();
        TableScroll = new javax.swing.JScrollPane();
        Income_Table = new javax.swing.JTable();
        TableScroll2 = new javax.swing.JScrollPane();
        Expences_Table = new javax.swing.JTable();
        TableScroll3 = new javax.swing.JScrollPane();
        Goal_Table = new javax.swing.JTable();
        TableScroll4 = new javax.swing.JScrollPane();
        Invesment_Table = new javax.swing.JTable();

        kGradientPanel1.setkEndColor(new java.awt.Color(51, 0, 102));
        kGradientPanel1.setkStartColor(new java.awt.Color(85, 77, 222));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(788, 588));

        kGradientPanel4.setkStartColor(new java.awt.Color(29, 103, 103));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/pdf-file.png"))); // NOI18N

        PDF.setBackground(new java.awt.Color(0, 102, 255));
        PDF.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        PDF.setText("GET PDF");
        PDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PDFActionPerformed(evt);
            }
        });

        Refresh.setBackground(new java.awt.Color(0, 102, 255));
        Refresh.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        Refresh.setText("REFRESH");

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(PDF, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(PDF, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                        .addComponent(Refresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        Income_Table.setBackground(new java.awt.Color(153, 255, 255));
        Income_Table.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Income_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Income_Type", "Amount", "Date", "Note"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Income_Table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Income_Table.setGridColor(new java.awt.Color(0, 0, 0));
        Income_Table.setRowHeight(40);
        TableScroll.setViewportView(Income_Table);

        Expences_Table.setBackground(new java.awt.Color(153, 255, 255));
        Expences_Table.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Expences_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Expences_Type", "Amount", "Date", "Note"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Expences_Table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Expences_Table.setGridColor(new java.awt.Color(0, 0, 0));
        Expences_Table.setRowHeight(40);
        TableScroll2.setViewportView(Expences_Table);

        Goal_Table.setBackground(new java.awt.Color(153, 255, 255));
        Goal_Table.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Goal_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Goal_Type", "Amount", "Start_Date", "End_Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Goal_Table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Goal_Table.setGridColor(new java.awt.Color(0, 0, 0));
        Goal_Table.setRowHeight(40);
        TableScroll3.setViewportView(Goal_Table);

        Invesment_Table.setBackground(new java.awt.Color(153, 255, 255));
        Invesment_Table.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Invesment_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Invesment_Type", "Amount", "Date", "Note"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Invesment_Table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Invesment_Table.setGridColor(new java.awt.Color(0, 0, 0));
        Invesment_Table.setRowHeight(40);
        TableScroll4.setViewportView(Invesment_Table);

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(TableScroll3, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(TableScroll4, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(TableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TableScroll2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(kGradientPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(kGradientPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TableScroll2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TableScroll3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TableScroll4, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PDFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PDFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Expences_Table;
    private javax.swing.JTable Goal_Table;
    private javax.swing.JTable Income_Table;
    private javax.swing.JTable Invesment_Table;
    private javax.swing.JButton PDF;
    private javax.swing.JButton Refresh;
    private javax.swing.JScrollPane TableScroll;
    private javax.swing.JScrollPane TableScroll2;
    private javax.swing.JScrollPane TableScroll3;
    private javax.swing.JScrollPane TableScroll4;
    private javax.swing.JLabel jLabel9;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel4;
    // End of variables declaration//GEN-END:variables
}



