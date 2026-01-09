interface Interface {
    void methodA();

}

class Implementation implements Interface {
    @Override
    public void methodA() {
        System.out.println("Method A implementation");
    }

    public static void main(String[] args) {
        Implementation impl = new Implementation();
        impl.methodA();
    }
}