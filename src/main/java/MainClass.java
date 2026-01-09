public class MainClass {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountHolder("John Doe");
        account.deposit(500);
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Balance: $" + account.getBalance());
        account.withdraw(200);
        System.out.println("Balance after withdrawal: $" + account.getBalance());
    }
    
}
