public class Pattern3 {
    public static void main(String args[]){
     int n=5;
        for(int i=1; i<=n-1; i++){
            if(i==4){
                for(int j=1; j<=(n*2)-2; j++)
                  System.out.print("*");

            }

        else{
             for(int j=i; j>=1; j--)
                   System.out.print("*");
                for(int j=1; j<=((n-i+1)*2)-4; j++)
                      System.out.print(" "); 
                for(int j=i; j>=1; j--)
                      System.out.print("*");
            }
 System.out.println();            
        } 
         for(int i=n-1; i>=1; i--){
            if(i==4){
                for(int j=1; j<=(n*2)-2; j++)
                  System.out.print("*");

            }

        else{
             for(int j=i; j>=1; j--)
                   System.out.print("*");
                for(int j=1; j<=((n-i+1)*2)-4; j++)
                      System.out.print(" "); 
                for(int j=i; j>=1; j--)
                      System.out.print("*");
            }
 System.out.println();            
        } 
             


}}