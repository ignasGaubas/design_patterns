package Builder;

public class Human {
    private int hands;
    private int legs;
    private String colour;

    public Human(int hands, int legs, String colour){
        System.out.println("Human initialized.");

        this.hands = hands;
        this.legs = legs;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Hands " + hands + "; Legs " + legs + "; Colour " + colour + ";";
    }
}
