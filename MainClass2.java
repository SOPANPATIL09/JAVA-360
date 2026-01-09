interface Demo{
    void m1();
    void m3();

}
interface Demo1 {

    void m2();
    void  m3();
}
class DemoIMPL implements Demo1, Demo{
    @Override
    public void m1(){
        System.out.println("m1 method implementation");

    }
    @Override
    public void m2(){
        System.out.println("m2 method implementation");

    }
    @Override
    public void m3(){
        System.out.println("m3 method implementation");

    }

}


public class MainClass2 {
    public static void main(String args[]){
        DemoIMPL obj = new DemoIMPL();
        obj.m1();
        obj.m2();
        obj.m3();
    }
    
}
