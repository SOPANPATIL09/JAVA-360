public class Pattern153{
public static void main(String args[]){

int n=5;

int count1=n;
int count2=1;

for(int i=n, i2=1; i>=1||i2<=n; i--,i2++)
{
          int c1=count1;
          int c2=count2;

for(int j=i2; j<=n; j++){

            System.out.print((char)(64+c1));
              System.out.print((char)(96+c2));
                System.out.print("\t");
                   c1--;          
                  c2+=j;
      }
  System.out.println();
   count1 +=i-1;
   count2 +=i2+1;
    

}
}}