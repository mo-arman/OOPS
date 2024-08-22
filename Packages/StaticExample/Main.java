package Packages.StaticExample;

public class Main {
    public static void main(String[] args) {
    //    Human Arman = new Human(8, "l", 9, "fasle");
    //     System.out.println(Arman.age);
       
    }
    static void fun(){
        // you can't use this beacuse it requires an instance
        // but the function you are using it in does not depend on instances

        // you can't access non static stuff without refrebcing their instances in a static context

        // hence , here I am referencing it
        Main obj = new Main();
        obj.Greeting();
    }
    void fun2(){
        Greeting();
    }
    // we know that somrthing which is not static belongs to an object
     void Greeting (){
        // fun();
        System.out.println("l");
    }
}
