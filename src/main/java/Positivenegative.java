
import java.util.Scanner;
import java.util.Arrays;

public class Positivenegative {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of elements: ");
            int n = sc.nextInt();
            
            int[] numbers = new int[n];
            int[] evenNumbers = new int[n];
            int[] oddNumbers = new int[n];
            
            int evenCount = 0;
            int oddCount = 0;
            
            // Input numbers
            System.out.println("Enter " + n + " numbers:");
            for (int i = 0; i < n; i++) {
                numbers[i] = sc.nextInt();
            }
            
            // Separate even and odd numbers using flag
            for (int i = 0; i < n; i++) {
                boolean isEven = false; // Flag to check even or odd
                
                if (numbers[i] % 2 == 0) {
                    isEven = true; // Set flag to true for even numbers
                }
                
                if (isEven) {
                    evenNumbers[evenCount] = numbers[i];
                    evenCount++;
                } else {
                    oddNumbers[oddCount] = numbers[i];
                    oddCount++;
                }
            }
            
            // Display results
            System.out.println("\nOriginal numbers: " + Arrays.toString(numbers));
            
            System.out.print("Even numbers: [");
            for (int i = 0; i < evenCount; i++) {
                System.out.print(evenNumbers[i]);
                if (i < evenCount - 1) System.out.print(", ");
            }
            System.out.println("]");
            
            System.out.print("Odd numbers: [");
            for (int i = 0; i < oddCount; i++) {
                System.out.print(oddNumbers[i]);
                if (i < oddCount - 1) System.out.print(", ");
            }
            System.out.println("]");
            
            System.out.println("\nTotal even numbers: " + evenCount);
            System.out.println("Total odd numbers: " + oddCount);
        }
    }
}