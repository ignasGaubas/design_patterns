package Flyweight;

public class SlowThread implements Thread {

    private final int id;

    public SlowThread(int id){
        System.out.println(String.format("SlowThread initialized, id - %d.", id));
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println(String.format("SlowThread (id - %d) is running.", this.id));
    }
}
