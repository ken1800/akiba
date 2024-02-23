import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AkibaMutualFund akibaMutualFund = new AkibaMutualFund();

        // Create sample objects
        Fund fund1 = new Fund("Akiba Money Market Fund", "Low-risk", "Capital preservation", 5000, 2.00);
        Fund fund2 = new Fund("Akiba Balanced Fund", "Moderate-risk", "Balanced returns", 10000, 1.75);
        Investor investor1 = new Investor("John Doe", "123456", 50000);

        // Add funds to AkibaMutualFund
        akibaMutualFund.addFund(fund1);
        akibaMutualFund.addFund(fund2);

        // Application logic
        System.out.println("Welcome to Akiba Mutual Fund!");

        // Register investor
        akibaMutualFund.registerInvestor(investor1);

        // Login investor
        boolean isAuthenticated = akibaMutualFund.loginInvestor(investor1.getID(), "password");

        if (isAuthenticated) {
            System.out.println("Login successful!");
            // Display available funds
            akibaMutualFund.displayFunds();

            // Select fund
            System.out.println("Enter the fund number you want to select: ");
            // Assume user input selects a fund
            Fund selectedFund = fund1; // For example, select fund1

            // Perform actions on selected fund
            selectedFund.invest(investor1, 1000); // Example invest action
            selectedFund.redeem(investor1, 500); // Example redeem action

            // View holdings
            selectedFund.displayHoldings();
        } else {
            System.out.println("Login failed. Invalid credentials.");
        }
    }
}
