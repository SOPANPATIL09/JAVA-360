interface IndianMother{
    default void food(){
        System.out.println("chapati ready");
    }
}

interface BritishMother{
    default void food(){
         System.out.println("maggie ready");
    }
}
class Son implements IndianMother,BritishMother{
    public void food(){
        IndianMother.super.food();
        BritishMother.super.food();
    }
}
public class Mainclass6 {
 public static void main(String[] args) {
     Son s=new Son();
     s.food();
 }   
}
