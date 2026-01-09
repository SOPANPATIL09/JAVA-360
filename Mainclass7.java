interface Car{
    int maxSpeed=120; 
    void color();
    void type();
    void cc();
}
class HondaCar implements Car{
    int minSpeed=40;

    public void color(){
        System.out.println("honda car available in all colors");
    }
    public void type(){
        System.out.println("honda car is available in all segments");
    }
    public void cc(){
         System.err.println("honda car engine capacity is 1500cc");
         System.out.println("max speed of honda car is "+maxSpeed+"min speed is "+minSpeed);
    } 
}
class BMWCar implements Car{
    public void color(){
        System.out.println("BMW car available in all colors");
    }
    public void type(){
        System.out.println("BMW car is available in all segments");
    }
    public void cc(){
         System.err.println("BMW car engine capacity is 3000cc");
         System.out.println("max speed of BMW car is "+maxSpeed+" min speed is not defined");
    } 
}
public class Mainclass7 {
 public static void main(String[] args) {
     Car honda=new HondaCar();
     honda.color();
     honda.type();
     honda.cc();
     
     System.out.println("***********************");
     
 }
}