 class Default {
    int a,b;
    void display(){
        System.out.println("a="+a+"b="+b);
    }
  public static void main(String args[]){
    Default s=new Default();
    s.a=10;
    s.b=20;
    s.display();
  }
}
