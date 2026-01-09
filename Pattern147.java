public class Pattern147{
public static void main(String args[]){
int n=5;
int count1=n*(n+1)/2;
int count2=n;

for(int i=1,i1=n; i<=n||i1>=1; i1--, i++){
 
int c1=count1;
int c2=count2;


for(int j=i  , j1=n; j<=n || j1>=i; j++ , j1--){

     System.out.print((char)(64+c1));
     System.out.print((char)(96+c2));
     System.out.print("\t");
     c1 -=j+1;
     c2 +=j1-1;
  
}
System.out.println();
count1 -=i;
count2--;



}


}}