public class Pattern183{
public static void main(String args[]){
int n=5;
for(int i=1; i<=(n*2)-1; i++){

   if(i<=n){

           for(int j=i; j>1; j--)
    
                  System.out.print(" ");
           for(int j=1; j<=1+n-i; j++)
                   System.out.print(j);
          
          } 
    else{
                  for(int j=i; j<(n*2)-1; j++)
                      System.out.print(" ");
                  for(int j=1; j<=1+i-n; j++)
                      System.out.print(j);
               
     }
 
System.out.println();
}

}}