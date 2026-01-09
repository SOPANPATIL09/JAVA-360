class BanKAccount{

  private String Account_Holder;
  private double balance;


   public double getBalance(){

                           return balance;

                             }


   public double Deposite(double amount){

                  if(amount >0){

                                balance +=amount;

                                }
                  else{
 
                              System.out.println("amount is invalid");

                           }
    return balance;

            }


    public double Withdrawal(double amount){

                                  if(amount>0 && amount<=balance){
 
                                                      balance -=amount;
                                                                }
                                   else{

                                          System.out.println("amount is invalid please enter a valid amount");

                                           }
                                       return balance;

                                         }



      public String setAccountHolder(String name){

                                     return this.Account_Holder=name;
                                      
                                     }

           public String getAccountHolder(){

                               return Account_Holder;
                        }
 
}