public class Pattern33{

public static void main(String agrs[]){

  int n=26;
   
 for(int i=1; i<=n; i++){

    for(int j=n; j>i; j--)
      {
 
          System.out.print(" ");
         }

    for(int j=i; j>=1; j--){
              
       System.out.print((char)(i+64));
        
       }
 System.out.println();
  }

 }
}
