//Find the largest and smallest element in an array.

public class Array1 {
    public static void main(String args[]){
 
      int a[]={20,30,10,5,50,70,2};
    
       int large=Integer.MIN_VALUE;
       int small=Integer.MAX_VALUE;
       
       for(int i=0; i<a.length; i++){
           
           if(a[i]>large){
               large=a[i];
           }
       }

       for(int i=0; i<a.length; i++){
           
           if(a[i]<small){
               small=a[i];
           }
       }

         System.out.println("Largest element is: "+large);
            System.out.println("Smallest element is: "+small);
    
}
}