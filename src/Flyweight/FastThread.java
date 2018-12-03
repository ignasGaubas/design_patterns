package Flyweight;

public class FastThread implements Thread {

    private final int id;

    public FastThread(int id){
        System.out.println(String.format("FastThread initialized, id - %d.", id));
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println(String.format("FastThread (id - %d) is running.", this.id));
    }
}
