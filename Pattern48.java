public class Pattern48{
public static void main(String args[]){

     int n=5;

for(int i=n; i>=1; i--){

for(int j=i; j<n; j++){
    
System.out.print(" ");

}

for(int j=1; j<=i; j++){

   System.out.print((char)(j+64));
}
System.out.println();

}
 
}
}