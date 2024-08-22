package Packages.StaticExample;

public class Human {
    int age;
    static String name;
    int salary;
    boolean married;

    static void message(){
        System.out.println("k");
    }
    @SuppressWarnings("static-access")
    public  Human(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
  
         

    }

    
}
