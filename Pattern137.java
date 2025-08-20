public class Pattern137{
public static void main(String args[]){
int n=5;
int count=n;

for(int i=1; i<=n; i++){

    for(int j=i; j>1; j--){

System.out.print("\t");
}
     int c=count;
for(int j=n; j>=i; j--){

        System.out.print((char)(64+c)+"\t");
        c +=j-1;
      }
      System.out.println();
      count--;
 }


}
}