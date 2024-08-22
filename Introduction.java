import java.util.Arrays;

public class Introduction{
    public static void main(String[] args) {
        int[] numbers = new int[5];

        String[] names = new String[5];

        float[] marks = new float[5];

        //just declaring
        Student[] students = new Student[5];
        Student Arman = new Student(80,"Mohammad");
        // Arman.numbers = 80;
        // Arman.names = "Arman";

        // System.out.println(Arrays.toString(Arman));
        // System.out.println(Arman.numbers);
        // System.out.println(Arman.names);

        // Student random = new Student(Arman);
        // System.out.println(random.names);
        // Student random2 = new Student();
        // System.out.println(random2.names);

        Student one = new Student();
        Student two = one;

        one.names = "Something Something";
        System.out.println(two.names);
        // Arman.chnageName("Khan");
        // Arman.greeting();
       
    } 
}
// create a class
// for every single student
class Student{
    int numbers;
    String names = "Khan";
    float marks;

    // we need a way to add the value of the above properties objext by object
    // we need one word to access everything
    void greeting() {
        System.out.println("Hello My Name is " + names);
    }
    void chnageName(String names){
        this.names = names;
    }
    Student (Student other){
        this.names = other.names;
        this.numbers = other.numbers;
    }
    // Student(){
    //     // this(90, "Sameer");

    // }
    Student(int number,String name){
        this.numbers = number;
        this.names = name;

    }
    public Student() {
        //TODO Auto-generated constructor stub
    }
}