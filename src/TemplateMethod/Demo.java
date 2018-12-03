package TemplateMethod;

public class Demo {
    public static void demo() {
        System.out.println("*** Template Method pattern ***");

        SortAlgorithm alg1 = new UniqueSortAsc();
        alg1.runAlgorithm();

        SortAlgorithm alg2 = new SortDesc();
        alg2.runAlgorithm();

        System.out.println();
    }
}
