package Iterator;

public class Array extends Collection {

    public Array(){
        System.out.println("Array initialised.");
    }

    @Override
    public Iterator getIterator() {
        System.out.println("Array getIterator.");
        return new ArrayIterator();
    }
}
