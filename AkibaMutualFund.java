import java.util.ArrayList;
import java.util.List;

public class AkibaMutualFund {
    private List<Fund> funds;

    public AkibaMutualFund() {
        this.funds = new ArrayList<>();
    }

    public void registerInvestor(Investor investor) {
        System.out.println("New investor registered: " + investor.getName());
    }

    public boolean loginInvestor(String ID, String password) {
        // Implementation to authenticate and allow access to investor's account
        return true;
    }

    public void displayFunds() {
        System.out.println("Available Funds:");
        for (int i = 0; i < funds.size(); i++) {
            System.out.println((i + 1) + ". " + funds.get(i).getName());
        }
    }

    public void addFund(Fund fund) {
        funds.add(fund);
    }
}
