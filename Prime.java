class Checkprime{
    public boolean isPrime(int n){
    boolean b=false;
    if(n==0||n==1){
        b=true;
    }
        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                b=true;
                break;
            }
        }
        return !b;

    }
}
public class Prime{
    public static void main(String args[]){
        Checkprime cp=new Checkprime();
        for(int i=10;i<=20;i++){
          
        
        if(cp.isPrime(i)){
            System.out.println(i+" is a prime number");
    }
    else{
            System.out.println(i+" is not a prime number");
        }
    }}
}