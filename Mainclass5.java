interface Demo{
    static void m1(){
        System.out.println("m1 static method of Demo");
    }
    static void m3(){
        System.out.println("m3 static method of Demo");
    }
}
interface Demo1{
    static void m2(){
        System.err.println("m2 method of Demo1");
    }
    static void m3(){
        System.out.println("m3 method of Demo1");
    }
}
class DemoIMPL implements Demo1, Demo{
    
        public void m1(){
            Demo.m1();
        }
        public void m2(){
            Demo1.m2();
    }     public void m3(){
            Demo.m3();
            Demo1.m3();
}}

public class Mainclass5 {
    public static void main(String[] args) {
        DemoIMPL obj = new DemoIMPL();
        Demo.m1();
        Demo1.m2();
        Demo.m3();
        obj.m1();
        obj.m2();
        obj.m3();
    }
    
}
