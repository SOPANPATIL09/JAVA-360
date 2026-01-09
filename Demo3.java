public class Demo3{
int a,b;
void display(){

    System.out.println("a="+a+"b="+b);
}
Demo3(){
         
   a=10;
   b=20;
System.out.println("default constructor called");
}

Demo3(int a,int b){

       this.a = a;
       this.b = b;
System.out.println("parameterized constructor called");
     
}

public static void main(String args[]){

        Demo3 d1=new Demo3();
        Demo3 d2=new Demo3(30,40);
        Demo3 d3=new Demo3();

          d1.display();
          d2.display();
          d3.display();


}

}