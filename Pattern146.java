public class Pattern146{
public static void main(String args[]){

int n=5;
int count1=(n*(n-1)/2)+1;
int count2=n;

for(int i=n; i>=1; i--){

int c1=count1;
int c2=count2;

for(int j=n , j1=n; j>=i || j1>=i; j--,j1--){

         System.out.print((char)(96+c1));
         System.out.print((char)(64+c2));
         System.out.print("\t");
         c1 -=j;
         c2 +=j1;
}

System.out.println();
count1++;
count2--;


}


}}