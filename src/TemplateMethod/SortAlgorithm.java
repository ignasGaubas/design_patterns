package TemplateMethod;

public abstract class SortAlgorithm {

    public SortAlgorithm() {
        System.out.println("SortAlgorithm initialized.");
    }

    public void runAlgorithm() {
        System.out.println("SortAlgorithm running algorithm.");
        if (!allowDuplicates()) {
            removeDuplicates();
        }
        sort();
        System.out.println("SortAlgorithm finished algorithm.");
    }

    public void removeDuplicates() {
        System.out.println("SortAlgorithm removed duplicates.");
    }

    public abstract void sort();

    public abstract boolean allowDuplicates();
}