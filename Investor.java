class Investor {
    private String name;
    private String ID;
    private double accountBalance;

    public Investor(String name, String ID, double accountBalance) {
        this.name = name;
        this.ID = ID;
        this.accountBalance = accountBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void viewPortfolio() {
        // Implementation to show invested funds and current value
        System.out.println(name + "'s Portfolio");
    }
}