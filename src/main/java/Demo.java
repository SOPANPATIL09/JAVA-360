class Demo{
 int a,b;

 //no argument no return type method
   // void main(){

        //   System.out.println(a+b);

   // }

   //with argument no return type method
  // void main(int a,int b){


       //  System.out.println(a+b);
 //  }


 //no argument with return type method
 //public int main(){


   // return a+b;
// }

    //with argument with return type method
    public String main(String s){
        return s;


    }
    public static void main(String args[]){
        String s1="Hello World";
        Demo d=new Demo();
       System.out.println(d.main(s1));
     
      

    }
}