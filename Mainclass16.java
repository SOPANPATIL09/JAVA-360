
class Thread_Task implements Runnable {

    public void run() {

        for (int i = 1; i <= 10; i++) {
            try{
              Thread.sleep(10);}
              catch(InterruptedException e){
                System.out.println(e);
              }
            System.out.println("i am the king");
        }
    }

}

class Thread_Task2 implements Runnable {

    public void run() {
          
        for (int i = 1; i <= 10; i++) {

                     try{
              Thread.sleep(15);}
              catch(InterruptedException e){
                System.out.println(e);
              }
            System.out.println("i am the game changer");
        }

    }

}

public class Mainclass16 {

    public static void main(String[] args) {
        Thread_Task s = new Thread_Task();
        Thread_Task2 k = new Thread_Task2();
        Thread t1 = new Thread(s);
        Thread t2 = new Thread(k);

        t1.start();
        t2.start();

    }
}
