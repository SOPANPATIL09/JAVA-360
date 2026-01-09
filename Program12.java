public class Program12 {
    public static void main(String[] args) {
        // Declare and initialize variables
        double principal = 50000; // Principal amount in INR
        double rate = 7;          // Annual interest rate in percentage
        double time = 2;          // Time in years

        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Calculate total amount after interest
        double totalAmount = principal + simpleInterest;

   
        System.out.println("Principal Amount: " + principal);
        System.out.println("Annual Interest Rate: " + rate + "%");
        System.out.println("Time Period: " + time + " years");
        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Total Amount after " + time + " years: " + totalAmount);
    }
}
