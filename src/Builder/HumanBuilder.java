package Builder;

public class HumanBuilder {

    private int hands;
    private int legs;
    private String colour;

    public HumanBuilder(){
        System.out.println("HumanBuilder initialized.");
    }

    public void setHands(int number){
        this.hands = number;
    }

    public void setLegs(int number){
        this.legs = number;
    }

    public void setColour(String colour){
        this.colour = colour;
    }

    public Human build(){
        return new Human(hands, legs, colour);
    }
}
