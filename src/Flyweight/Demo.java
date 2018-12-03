package Flyweight;

public class Demo {
    public static void demo(){
        System.out.println("*** Flyweight pattern ***");

        ThreadFactory tf = new ThreadFactory();

        Thread ft1 = tf.getFastThread();
        Thread mt1 = tf.getMediumThread();
        Thread st1 = tf.getSlowThread();

        ft1.run();
        mt1.run();
        st1.run();

        Thread ft2 = tf.getFastThread();
        Thread mt2 = tf.getMediumThread();
        Thread st2 = tf.getSlowThread();

        ft2.run();
        mt2.run();
        st2.run();

        System.out.println();
    }
}
