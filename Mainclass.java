interface Demo{
    void m1();
}
interface Demo1 extends Demo{
    void m2();
}
class DemoImpL implements Demo1{
    @Override
    public void m1() {
        System.out.println("m1 method implementation");
    }

    @Override
    public void m2() {
        System.out.println("m2 method implementation");
    }
}
public class Mainclass {
    public static void main(String args[]){
        DemoImpL obj = new DemoImpL();
        obj.m1();
        obj.m2();
    }
    
}
