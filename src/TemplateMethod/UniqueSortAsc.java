package TemplateMethod;

public class UniqueSortAsc extends SortAlgorithm {

    public UniqueSortAsc(){
        System.out.println("UniqueSortAsc initialized.");
    }

    @Override
    public void sort() {
        System.out.println("UniqueSortAsc sorting.");
    }

    @Override
    public boolean allowDuplicates() {
        System.out.println("UniqueSortAsc allow duplicates - false.");
        return false;
    }
}
