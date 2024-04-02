/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finance.tracker;

/**
 *
 * @author Admin
 */
public class BudgetTracker {
    private double[][] budgets; // 2D array to store budgets

    public BudgetTracker(int numUsers, int numCategories) {
         budgets = new double[numUsers][numCategories];
    }

    // Method to set a budget for a specific category for a user
    public void setBudget(int userId, int category, double amount) {
        budgets[userId][category] = amount;
    }

    // Method to get the budget for a specific category for a user
    public double getBudget(int userId, int category) {
        return budgets[userId][category];
    }

    // Method to track spending and check against budgets
    public boolean checkBudget(int userId, int category, double spentAmount) {
        double budget = getBudget(userId, category);
        return spentAmount <= budget;
    }

    public static void main(String[] args) {
        int numUsers = 2;
        int numCategories = 3;

        BudgetTracker budgetTracker = new BudgetTracker(numUsers, numCategories);

        // Example: Set budget for user 0 in category 1
        budgetTracker.setBudget(0, 1, 500.0);

        // Example: Get budget for user 0 in category 1
        double groceriesBudget = budgetTracker.getBudget(0, 1);
        System.out.println("User 0's groceries budget: " + groceriesBudget);

        // Example: Check if user 0 has exceeded their budget for groceries
        boolean withinBudget = budgetTracker.checkBudget(0, 1, 400.0);
        System.out.println("Is user 0 within budget for groceries? " + withinBudget); // Output: true

        boolean withinBudget2 = budgetTracker.checkBudget(0, 1, 600.0);
        System.out.println("Is user 0 within budget for groceries? " + withinBudget2); // Output: false
    }
}
