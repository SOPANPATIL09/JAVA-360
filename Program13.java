//write a program to find diagonal 
//formula dia=Math.sqrt(length * length + width * width)
import java.util.Scanner;
public class Program13{
public static void main(String args[]){
 
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a Width :");
  double width=sc.nextDouble();
  System.out.println("Enter a length:");
  double length=sc.nextDouble();

  double diagonal=Math.sqrt(length*length+width*width);
   
 System.out.println("diagonal:="+diagonal);
  
}
}
/*D:\VIBRANTMINDS.JAVA>java Program13
Enter a Width :
12
Enter a length:
32
diagonal:=34.17601498127012

D:\VIBRANTMINDS.JAVA>
*/