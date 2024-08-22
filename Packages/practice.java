package Packages;

public class practice {
    public static void main(String[] args) {
        practice obj = new practice();
        obj.Greeting1("Khan");
       
    }
    static void fun(){
        practice kk = new practice();
        kk.Greeting1("khan");
    }
    void Greeting1(String n){
        n = "Arman";
     fun();
    }
}
