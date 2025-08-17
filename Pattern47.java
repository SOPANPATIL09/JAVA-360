public class Pattern47{
public static void main(String args[]){
  int n=5;
 for(int i=n; i>=1; i--){
 
   for(int j=i;  j<n;  j++){

      System.out.print(" ");
}
  for(int j=i; j>=1; j--){
       System.out.print((char)(i+96));

  }
    System.out.println();
 }

}
}