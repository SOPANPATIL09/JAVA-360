import java.util.Scanner;
public class Switch1{

public static void main(String args[]){

         Scanner sc=new Scanner(System.in);
        System.out.println("----- MENU -----");
        System.out.println("1. Sopan");
        System.out.println("2. Swapnil");
        System.out.println("3. Kunal");
        System.out.println("4. Rahul");
        System.out.println("----------------");
        System.out.print("Enter your choice: ");
         
           int choice=sc.nextInt();
         switch(choice){
                       
                       case 1:
                           System.out.println("sopan");
                        break;

                       case 2:
                           System.out.println("swapnil");
                        break;

                        case 3:
                           System.out.println("kunal");
                        break;

                         case 4:
                           System.out.println("rahul");
                        break;

                        default:
                            System.out.println("invalid choice");
                         break;

                    }
       




}

}