public class Pattern148{
public static void main(String args[]){
int n=5;
int count1=n*(n+1)/2;
int count2=n;
for(int i=1 ,i1=n; i<=n||i1>=1; i++,i1--){
 int c1=count1;
 int c2=count2;

for(int j=i; j<=n; j++){

  System.out.print((char)(64+c1));
  System.out.print((char)(96+c2));
  System.out.print("\t");
  c1 -=j;
  c2--;
  
 }
System.out.println();

count1 -=i+1;
count2 +=i1-1;

}


}}