/*Compound Interest=principal * Math.pow((1 + rate / 100), time)-principal;
P = Principal amount
r = Annual interest rate
t = Time (in years)
*/
import java.util.Scanner;
public class Program14{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

System.out.println("Enter Principal Amount: ");
double principal=sc.nextDouble();

System.out.println("Enter Annual Interest Rate (%): ");
double rate=sc.nextDouble();

System.out.println("Enter Time (in years):");
double time=sc.nextDouble();
   
   double amount = principal * Math.pow((1 + rate / 100), time);
   double compoundInterest = amount - principal;

   System.out.printf("Compound Interest = %.2f\n", compoundInterest);
   System.out.printf("Total Amount = %.2f\n", amount);



}
}
/*D:\VIBRANTMINDS.JAVA>javac Program14.java

D:\VIBRANTMINDS.JAVA>java Program14
Enter Principal Amount:
45555
Enter Annual Interest Rate (%):
7
Enter Time (in years):
4
Compound Interest = 14158.31
Total Amount = 59713.31

D:\VIBRANTMINDS.JAVA>
*/