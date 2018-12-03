package Iterator;

public class Demo {
    public static void demo() {
        System.out.println("*** Iterator pattern ***");

        Collection list = new List();
        Iterator listIterator = list.getIterator();
        listIterator.first();
        listIterator.next();

        Collection array = new Array();
        Iterator arrayIterator = array.getIterator();
        arrayIterator.first();
        arrayIterator.next();

        System.out.println();
    }
}
