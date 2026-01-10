
class Writing extends Thread {

    public void writing() {

        for (int i = 1; i <= 10; i++) {

            System.out.println("i am writing");
        }

    }

    public void run() {

        writing();
    }

}

class Reading extends Thread {

    public void reading() {

        for (int i = 1; i <= 10; i++) {

            System.out.println("i am reading");
        }

    }

    @Override
    public void run() {

        reading();
    }

}

class Listen extends Thread {

    public void music() {

        for (int i = 1; i <= 10; i++) {

            System.out.println("music listing");
        }

    }

    public void run() {

        music();
    }

}

public class Mainclass15 {

    public static void main(String args[]) {

        Writing w = new Writing();
        Reading r = new Reading();
        Listen l = new Listen();

        w.start();
        r.start();
        l.start();

    }
}
