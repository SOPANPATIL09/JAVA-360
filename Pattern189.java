public class Pattern189{
public static void main(String args[]){
int n=5;
for(int i=1; i<=(n*2)-1; i++){

   if(i<=n){

           for(int j=i; j>1; j--)
    
                  System.out.print(" ");
           for(int j=i; j<=n; j++)
                 if(i%2 !=0)
                   System.out.print((char)(64+i));
                  else
                    System.out.print((char)(96+i));

          } 
    else{
                  for(int j=i; j<(n*2)-1; j++)
                      System.out.print(" ");
                  for(int j=(n*2)-i; j<=n; j++)
                      if(i%2==0)
                      System.out.print((char)(96+(n*2)-i));
                      else
                       System.out.print((char)(64+(n*2)-i));

     }
 
System.out.println();
}

}}