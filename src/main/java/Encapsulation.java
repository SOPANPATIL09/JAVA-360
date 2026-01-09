class BankAccount {

    private String accountHolder;
    private double balance;   // private → data hiding

    // Getter (to view balance)
    public double getBalance() {
        return balance;
    }

    // Setter (to deposit money)
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Setter (to withdraw money)
    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    // Setter & Getter for account holder
    public void setAccountHolder(String name) {
        this.accountHolder = name;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}
