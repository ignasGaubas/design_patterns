package Iterator;

public class ArrayIterator extends Iterator {

    public ArrayIterator() {
        System.out.println("ArrayIterator initialized.");
    }

    @Override
    public void first() {
        System.out.println("ArrayIterator first.");
    }

    @Override
    public void next() {
        System.out.println("ArrayIterator next.");
    }
}
