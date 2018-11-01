package Builder;

public class Demo {

    public static void demo(){
        HumanBuilder builder = new HumanBuilder();
        builder.setHands(2);
        builder.setLegs(2);
        builder.setColour("Red");

        Human h1 = builder.build();

        builder.setColour("Green");
        Human h2 = builder.build();

        builder.setHands(4);
        builder.setLegs(4);
        builder.setColour("Blue");
        Human h3 = builder.build();

        System.out.printf("Human %s is: %s\n", "h1", h1.toString());
        System.out.printf("Human %s is: %s\n", "h2", h2.toString());
        System.out.printf("Human %s is: %s\n", "h3", h3.toString());

        System.out.println();
    }
}
