public class Pattern101{
public static void main(String args[]){
int n=5;
int count=n;

for(int i=n; i>=1; i--){
int c=count;

for(int j=n; j>=i; j--){

   System.out.print((char)(64+c)+"\t");
  
   c +=j;
 
 }
System.out.println();
count--;
}

}}