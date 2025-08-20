public class Pattern115{
public static void main(String args[]){

int n=5;
int count=(n*(n-1)/2)+1;

for(int i=1; i<=n; i++){
  int c=count;

for(int j=n; j>=i; j--){

 System.out.print((char)(64+c)+"\t");
 c -=j-1;
}
System.out.println();
count++;



}

}}