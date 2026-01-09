public class This{
    int a;
    void display(){
        int a=100;
        System.out.println("display method of This is called");
        System.out.println(a);
        System.out.println(this.a);
     }

     This(){
      this(10);
        System.out.println("default constructor called");
     }
     This(int a){
        System.out.println("parameterized constructor called");
     }


}
