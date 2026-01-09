import java.util.Scanner;
class Perfect{

 
public boolean isPerfect(int number){
    int sum=0;
    for(int i=1;i<=number/2;i++){
        if(number%i==0){
            sum+=i;
        }
    }
    return sum==number;

}
}
public class Mainclass8 {
public static void main(String[] args) {
    Perfect p=new Perfect();
Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number to check perfect number:");
    int number=sc.nextInt();
    if(p.isPerfect(number)){
        System.out.println(number+" is a perfect number");
    }else{
        System.out.println(number+" is not a perfect number");
    }
}}