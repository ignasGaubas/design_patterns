package Proxy;

public class RealFile implements File {

    public RealFile() {
        System.out.println("RealFile initialized.");
    }

    @Override
    public void read() {
        System.out.println("RealFile read.");
    }

    @Override
    public void write() {
        System.out.println("ReallFile write.");
    }

    @Override
    public void delete() {
        System.out.println("RealFile delete.");
    }
}
