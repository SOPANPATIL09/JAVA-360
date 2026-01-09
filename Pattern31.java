public class Pattern31{
public static void main(String args[]){
  
int n=26;
 for(int i=1; i<=n; i++){

  for(int j=i; j<n; j++){

      System.out.print(" ");

} 
 
   for(int j=i; j>=1; j--){
 

         System.out.print(j);
     }
     System.out.println();
}
  

}}