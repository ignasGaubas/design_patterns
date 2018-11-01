import singleton.Singleton;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!\n");

        demo_singleton();
    }

    private static void demo_singleton(){
        Singleton singletonA = Singleton.getInstance();
        Singleton singletonB = Singleton.getInstance();

        if(singletonA == singletonB){
            System.out.println("singletonA and singletonB are same instance.");
        }else{
            System.out.println("singletonA and singletonB are different instances.");
        }

        System.out.println();
    }
}
