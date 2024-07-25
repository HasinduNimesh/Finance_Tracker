/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finanace_tracker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.toedter.calendar.JDateChooser;

public class Investment extends JPanel {
    private JComboBox<String> methodComboBox;
    private JTextField amountTextField;
    private JDateChooser dateChooser;
    private JTextArea noteTextArea;
    private JTable investmentTable;
    private Connection connection;

    public Investment() {
        initComponents();
        connectDatabase();
    }

    private void initComponents() {
        setLayout(new BorderLayout());

        // Top Panel for Adding Investment
        JPanel topPanel = new JPanel(new GridBagLayout());
        topPanel.setBackground(new Color(0, 0, 128));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel methodLabel = new JLabel("Method");
        methodLabel.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 0;
        topPanel.add(methodLabel, gbc);

        methodComboBox = new JComboBox<>(new String[] {"Savings Account", "Stocks", "Bonds", "Real Estate"});
        gbc.gridx = 1;
        gbc.gridy = 0;
        topPanel.add(methodComboBox, gbc);

        JLabel amountLabel = new JLabel("Amount");
        amountLabel.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 1;
        topPanel.add(amountLabel, gbc);

        amountTextField = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 1;
        topPanel.add(amountTextField, gbc);

        JLabel dateLabel = new JLabel("Date");
        dateLabel.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 2;
        topPanel.add(dateLabel, gbc);

        dateChooser = new JDateChooser();
        gbc.gridx = 1;
        gbc.gridy = 2;
        topPanel.add(dateChooser, gbc);

        JLabel noteLabel = new JLabel("Note");
        noteLabel.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 3;
        topPanel.add(noteLabel, gbc);

        noteTextArea = new JTextArea(3, 20);
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        topPanel.add(noteTextArea, gbc);

        JButton addButton = new JButton("Add Investment");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addInvestment();
            }
        });
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        topPanel.add(addButton, gbc);

        add(topPanel, BorderLayout.NORTH);

        // Bottom Panel for displaying investments
        String[] columnNames = {"Date", "Index", "Investment Type", "Note", "Amount"};
        Object[][] data = {};
        investmentTable = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(investmentTable);
        add(scrollPane, BorderLayout.CENTER);
    }

    private void connectDatabase() {
        try {
            String url = "jdbc:mysql://localhost:3306/investments_db";
            String username = "root";
            String password = "";
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void addInvestment() {
        String method = (String) methodComboBox.getSelectedItem();
        double amount = Double.parseDouble(amountTextField.getText());
        Date date = dateChooser.getDate();
        String note = noteTextArea.getText();

        if (method != null && amount > 0 && date != null && note != null) {
            logInvestmentToDatabase(method, amount, date, note);
            updateInvestmentTable(method, amount, date, note);
        } else {
            JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void logInvestmentToDatabase(String method, double amount, Date date, String note) {
        String sql = "INSERT INTO investments (method, amount, date, note) VALUES (?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, method);
            preparedStatement.setDouble(2, amount);
            preparedStatement.setDate(3, new java.sql.Date(date.getTime()));
            preparedStatement.setString(4, note);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void updateInvestmentTable(String method, double amount, Date date, String note) {
        DefaultTableModel model = (DefaultTableModel) investmentTable.getModel();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = sdf.format(date);
        model.addRow(new Object[]{dateString, model.getRowCount() + 1, method, note, amount});
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Investment Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Investment());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

