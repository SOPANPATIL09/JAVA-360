public class MainclassBank{

public static void main(String args[]){

        BanKAccount s1=new BanKAccount();
   
        s1.setAccountHolder("sopan");


        s1.Deposite(50000);
        s1.Withdrawal(12000);

        System.out.println("balance is ="+s1.getBalance());
        System.out.println("account holder ="+s1.getAccountHolder());


}
}