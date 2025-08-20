public class Pattern132{
public static void main(String args[]){
int n=5;
int count=1;

for(int i=n; i>=1; i--){
for(int j=i; j<n; j++){
System.out.print("\t");
}

   int c=count;
 for(int j=i; j>=1; j--){
       System.out.print((char)(64+c)+"\t");
       c++;

   }
  System.out.println();
   count+=i; 
 }


}}