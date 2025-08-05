public class Pattern09{

public static void main(String args []){
 int n=5;
 for(int i=n; i>=1; i--){
     
     for(int j=n; j>=i; j--){
      System.out.print((char)(i+96));

   }

System.out.println();
  }


}}