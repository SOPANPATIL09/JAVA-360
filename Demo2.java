public class Demo2 {



    public void m1(int a,int b){
 
        
             System.out.println("addition: "+(a+b));

    }
    public void m1(int a,int b,int c){


        System.out.println("addition: "+(a+b+c));
    }

    public static void main(String args[]){


        Demo2 d=new Demo2();

         d.m1(10,20,30);
         d.m1(10,20);
    }

    
}
