package Flyweight;

public class MediumThread implements Thread {

    private final int id;

    public MediumThread(int id){
        System.out.println(String.format("MediumThread initialized, id - %d.", id));
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println(String.format("MediumThread (id - %d) is running.", this.id));
    }
}
