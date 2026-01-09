public class Pattern124{
public static void main(String args[]){
int n=5;
int count=1;
for(int i=n; i>=1; i--){

 for(int j=i; j>1; j--){
 
   System.out.print("\t");
  }
    int c=count;

for(int j=n; j>=i; j--){

       System.out.print((char)(c+64)+"\t");
       c+=j-1;
}
System.out.println();
count++;
}




}}