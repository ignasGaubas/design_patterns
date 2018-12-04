package Proxy;

public class Demo {
    public static void demo() {
        System.out.println("*** Proxy pattern ***");

        File file111 = new FileProxy(true, true, true);
        file111.read();
        file111.write();
        file111.delete();

        File file100 = new FileProxy(true, false, false);
        file100.read();
        file100.write();
        file100.delete();

        File file010 = new FileProxy(false, true, false);
        file010.read();
        file010.write();
        file010.delete();

        System.out.println();
    }
}
