# Finance Tracker Application

This is a comprehensive finance tracker application developed using Java and Swing for the graphical user interface. The application allows users to manage incomes, expenses, investments, set financial goals, and generate reports. It also includes a settings menu for editing user account details and changing currency.

## Features

- **Dashboard**: Overview of the financial status including remainder, total income, and total expenses.
- **Incomes**: Add, view, and manage income records.
- **Expenses**: Add, view, and manage expense records.
- **Investments**: Add, view, and manage investment records.
- **Goals**: Set and track income and expense goals.
- **Reports**: Generate financial reports.
- **Calculator**: Basic calculator for financial calculations.
- **Settings**: Edit user account details and change currency.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or later
- [H2 Database](https://www.h2database.com/html/main.html)

### Setup

1. **Clone the repository**
    ```sh
    git clone https://github.com/yourusername/finance-tracker.git
    cd finance-tracker
    ```

2. **Open the project in your preferred IDE (e.g., NetBeans, IntelliJ IDEA, Eclipse)**

3. **Setup the H2 Database**
    - The application uses an embedded H2 database. The database configuration is specified in the `application.properties` file.
    - No additional setup is required for the H2 database as it runs embedded within the application.

4. **Build and Run the Application**
    - Compile and run the `Main.java` file from your IDE.

## Database Schema

The database schema includes the following tables:

- `USER_ACCOUNT`: Stores user account details.
- `INCOME`: Stores income records.
- `EXPENSE`: Stores expense records.
- `INVESTMENT`: Stores investment records.
- `INCOME_GOAL`: Stores income goals.
- `EXPENSE_GOAL`: Stores expense goals.

## Usage

- **Dashboard**: Provides an overview of the financial status.
- **Incomes**: Navigate to the Incomes section to add or manage income records.
- **Expenses**: Navigate to the Expenses section to add or manage expense records.
- **Investments**: Navigate to the Investments section to add or manage investment records.
- **Goals**: Set financial goals in the Goals section.
- **Reports**: Generate detailed financial reports from the Reports section.
- **Calculator**: Use the built-in calculator for quick financial calculations.
- **Settings**: Edit user account details and change the currency from the Settings menu.

## Contributing

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes.
4. Commit your changes (`git commit -m 'Add some feature'`).
5. Push to the branch (`git push origin feature-branch`).
6. Open a Pull Request.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.


