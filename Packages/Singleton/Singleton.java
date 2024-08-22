package Packages.Singleton;

public class Singleton {
    private Singleton(){
     
    }
    private static Singleton instances;

    public static Singleton getInstance(){
        // check whether 1 obj is only is created or not

        if(instances== null){
            instances = new Singleton();
        }
        return instances;

    }
    
}
