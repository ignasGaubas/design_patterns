package Singleton;

public class Singleton {

    private static Singleton instance = null;

    private Singleton(){
        System.out.println("Singleton initialized.");
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }

        System.out.println("Returning Singleton instance.");
        return instance;
    }
}
