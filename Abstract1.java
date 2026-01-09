abstract class Abstract1 {
         int a,b;
        abstract void display();
        void m1(){

            System.out.println("m1 method from class 1");
        }

        Abstract1(){
            System.out.println("default constructor called ");
        }
        Abstract1(int a){
            System.out.println("a="+a+"=parameterized constructor called");
        }   
    }
