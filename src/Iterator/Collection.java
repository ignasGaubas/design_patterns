package Iterator;

public abstract class Collection {

    public Collection(){
        System.out.println("Collection initialized.");
    }

    public abstract Iterator getIterator();
}
