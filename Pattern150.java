public class Pattern150{
public static void main(String args[])
{
 int n=5;
 int count1=n*(n+1)/2;
 int count2=n*(n+1)/2;

 for(int i=1; i<=n; i++){
 
     int c1=count1;
     int c2=count2;
   
for(int j=i,j1=n; j<=n || j1>=i; j++, j1--){
         
           System.out.print((char)(64+c1));
           System.out.print((char)(64+c2));
           System.out.print("\t");
           c1-=j;
           c2 -=j1;

 }
System.out.println();
count1 -=i+1;
count2--;
 
 }
}}