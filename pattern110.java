public class pattern110{
public static void main(String args[]){
int n=5;
int count=n;
for(int i=5; i>=1;  i--){
    
      int c=count;
for(int j=i; j>=1; j--){

 System.out.print((char)(64+c)+"\t");
 c--;
 }
  System.out.println();
  count +=i-1;

}


}}