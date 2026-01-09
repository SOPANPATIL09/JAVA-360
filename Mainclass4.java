interface Interface {
     void m1();

     default void m2(){
        System.out.println("default method implementation");
     }

}
class DemoIMPL implements Interface{
    @Override
    public void m1(){
        System.out.println("m1 method implementation");

    }
}
public class Mainclass4 {
    public static void main(String args[]){
        DemoIMPL obj = new DemoIMPL();
        obj.m1();
        obj.m2();
    }

}