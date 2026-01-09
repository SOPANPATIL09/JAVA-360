import java.util.InputMismatchException;
import java.util.Scanner;
public class Pract {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        boolean valid=false;
        int n=0;
         while(!valid)
        try {
             
                n=sc.nextInt();
               valid=true;
        } catch (InputMismatchException e) {
            System.out.println(e);
            sc.next();
        }
       int sum=0;

       for(int i=0; i<=n; i++){
        sum+=i;
        System.out.println("Sum from 0 to "+i+" is: "+sum);
       }
         
      
   
    
    }
}
