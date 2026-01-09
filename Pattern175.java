public class Pattern175{
public static void main(String args[]){
int n=5;

for(int i=1; i<=(n*2)-1; i++){
  if(i<=n){
                
          for(int j=i; j<n; j++)
              System.out.print(" ");

           for(int j=i; j>=1; j--)
                if(i%2 !=0)
                  System.out.print((char)(64+(n-i+1)));
                  else
                  System.out.print((char)(96+(n-i+1)));
        }
   else{
              for(int j=i; j>n; j--)
                 System.out.print(" ");
              for(int j=i; j<=(n*2)-1; j++)
                 
                  if(i%2 ==0)
                  System.out.print((char)(96+(i+1-n)));
                  else
                  System.out.print((char)(64+(i+1-n)));
         }
    
System.out.println();

}

}
}