public class Pattern151{
public static void main(String args[]){
 int n=5;
  
 int count1=n;
 int count2=n*(n+1)/2;
 
for(int i=n; i>=1; i--){
  int c1=count1;
  int c2=count2;
 
    for(int j=i; j>1; j--){

           System.out.print("\t");
      }
    for(int j=i,j1=i; j<=n|| j1<=n; j++,j1++){
            
           System.out.print((char)(64+c1));
            System.out.print((char)(64+c2));
             System.out.print("\t");
              c1 -=j+1;
               c2 +=j1;
          }
 System.out.println();
 count1 +=i-1;
 count2 -=i;    

}


}}