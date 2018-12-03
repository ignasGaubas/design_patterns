package TemplateMethod;

public class SortDesc extends SortAlgorithm {

    public SortDesc(){
        System.out.println("SortDesc initialized.");
    }

    @Override
    public void sort() {
        System.out.println("SortDesc sorting.");
    }

    @Override
    public boolean allowDuplicates() {
        System.out.println("SortDesc allow duplicates - true.");
        return true;
    }
}
