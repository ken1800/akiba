import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AkibaMutualFund akibaMutualFund = new AkibaMutualFund();

        // Create sample objects
        Fund fund1 = new Fund();
        // Initialize fund1 with data

        Investor investor1 = new Investor();
        // Initialize investor1 with data

        // Application logic
        System.out.println("Welcome to Akiba Mutual Fund!");

        // Register investor
        akibaMutualFund.registerInvestor(investor1);

    }
}
