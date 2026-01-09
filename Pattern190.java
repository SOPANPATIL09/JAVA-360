public class Pattern190{
public static void main(String args[]){
int n=5;
for(int i=1; i<=(n*2)-1; i++){
      if(i<=n){ 
     for(int j=i; j>1; j--)
          System.out.print(" ");
      for(int j=1; j<=1+n-i; j++)
          if(j%2!=0)
           System.out.print((char)(64+j));
         else
            System.out.print((char)(96+j));     
          }
   else{
          for(int j=i; j<=(n*2)-2; j++)
             System.out.print(" ");
          for(int j=1; j<=1+i-n; j++)
              if(j%2!=0)
                      System.out.print((char)(64+j));
              else
                  System.out.print((char)(96+j));
       }
  
System.out.println();

 }

}}