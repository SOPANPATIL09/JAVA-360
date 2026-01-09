public class Pattern154{
public static void main(String args[]){
int n=5;
int count1=n;
int count2=n;


for(int i=n; i>=1; i--){
  int c1=count1;
  int c2=count2;

for(int j=i; j>=1; j--){
        System.out.print((char)(64+c1));
        System.out.print((char)(64+c2));
        System.out.print("\t");
        c1--;
       c2 +=j-1;
      
 
}
System.out.println();
count1 +=i-1;
count2--;

}


}}