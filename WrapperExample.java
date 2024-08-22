public class WrapperExample {
    public static void main(String[] args) {

        Integer a = 10;
        Integer b = 20;
        swap(a, b);
        System.out.println(a + " " + b);
        // final int bonus = 3;
        // bonus = 6;
        final A Arman = new A("Arman khan");
        Arman.name = "other name";
        // when a non primitive is final , you can't reassign it.
        // Arman = new A("Arman Mo");

        // A obj;
        // for(int i=1; i<1000000000; i++){
        //     obj = new A("Random Name");
          A obj = new A("Arman");
          System.out.println(obj); 
        }
    

    static void swap(Integer a, Integer b) {
        int temp = a;
        a = b;
        b = temp;
    }
}

class A {
    final int num = 10;
    String name;

    public A(String name) {
        System.out.println("object created");
        this.name = name;
    }
    @Override
    protected void finalize() throws Throwable {
       System.out.println("object is destroyed");
    }

}