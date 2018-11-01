package Prototype;

public class Car implements Cloneable {

    private final int propertyA;
    private final int propertyB;
    private final int propertyC;
    private final int propertyD;

    public Car(int a, int b, int c, int d){
        System.out.println("Car initialized.");

        propertyA = a;
        propertyB = b;
        propertyC = c;
        propertyD = d;
    }

    @Override
    protected Object clone() {
        System.out.println("Car instance cloned.");
        return new Car(propertyA, propertyB, propertyC, propertyD);
    }

    @Override
    public String toString() {
        return String.format(
                "PropertyA = %d, PropertyB = %d, PropertyC = %d, PropertyD = %d",
                propertyA, propertyB, propertyC, propertyD);
    }
}
