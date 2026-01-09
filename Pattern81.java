public class Pattern81{
public static void main(String args[]){

int n=5;
int count=n*(n+1)/2;

for(int i=n; i>=1; i--){
            int c=count;

  for(int j=1;  j<i; j++){


    System.out.print("\t");   
   }
      for(int j=i; j<=n; j++){
          
       System.out.print(c +"\t");
       c+=j;
     }       
     System.out.println();
     count -=i;
}

}
}