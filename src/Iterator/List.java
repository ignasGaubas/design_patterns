package Iterator;

public class List extends Collection {

    public List(){
        System.out.println("List initialized.");
    }

    @Override
    public Iterator getIterator() {
        System.out.println("List getIterator.");
        return new ListIterator();
    }
}
