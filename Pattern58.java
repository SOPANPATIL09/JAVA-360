public class Pattern58{
public static void main(String args[]){
 int n=5;
 int count=(n*(n+1))/2;

for(int i=5; i>=1; i--){


  int c=count;

for(int j=n; j>=i; j--){

System.out.print(c+"\t");
c-=j-1;

}
System.out.println();
count--;

}


}}