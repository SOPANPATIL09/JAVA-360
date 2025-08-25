public class Pattern172{
public static void main(String args[]){
 int n=5;

for(int i=1; i<=(n*2)-1; i++){
  
   if(i<=n){
           for(int j=i; j<n; j++)
               System.out.print(" ");
           for(int j=n; j>=n-i+1; j--)
                 System.out.print(j);
        }
    else{
             for(int j=i; j>n; j--)
                System.out.print(" ");
               for(int j=n; j>i-n; j--)
                   System.out.print(j);
          }
      System.out.println();
}

}}