public class Pattern173{
public static void main(String args[]){
 int n=5;

for(int i=1; i<=(n*2)-1; i++){
  
   if(i<=n){
           for(int j=i; j<n; j++)
               System.out.print(" ");
           for(int j=(n-i)+1; j<=n; j++)
                 System.out.print(j);
        }
    else{
             for(int j=i; j>n; j--)
                System.out.print(" ");
               for(int j=i-n+1; j<=n; j++)
                   System.out.print(j);
          }
      System.out.println();
}

}}