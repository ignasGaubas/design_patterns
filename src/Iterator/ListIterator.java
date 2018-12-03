package Iterator;

public class ListIterator extends Iterator{

    public ListIterator(){
        System.out.println("ListIterator initialized.");
    }

    @Override
    public void first() {
        System.out.println("ListIterator first.");
    }

    @Override
    public void next() {
        System.out.println("ListIterator next.");
    }
}
