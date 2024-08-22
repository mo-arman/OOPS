package Packages.StaticExample;

public class StaticInt {
    // this is demo show initialization of static variables
    static int a = 4;
    static int b;

    // will only run once , when the first obj is create when the class is loaded for 
    static{
        System.out.println("I am in Static block");
        b= a*5;
    }
    public static void main(String[] args) {
        StaticInt obj = new StaticInt();
        System.out.println(StaticInt.a+" "+StaticInt.b);

        StaticInt.b +=3;
        StaticInt obj2 = new StaticInt();
        System.out.println(StaticInt.a+""+StaticInt.b);
    }
}
