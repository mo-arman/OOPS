package Packages.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton obj = new Singleton.getInstance();

        Singleton obj2 = new Singleton.getInstance();

        Singleton obj3 = new Singleton.getInstance();

        // all 3 ref variable are pointing  too just one object

        

    }
    
}
