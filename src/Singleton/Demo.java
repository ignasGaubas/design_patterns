package Singleton;

public class Demo {
    public static void demo(){
        Singleton singletonA = Singleton.getInstance();
        Singleton singletonB = Singleton.getInstance();

        if (singletonA == singletonB) {
            System.out.println("singletonA and singletonB are same instance.");
        } else {
            System.out.println("singletonA and singletonB are different instances.");
        }

        System.out.println();
    }
}
