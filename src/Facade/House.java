package Facade;

public class House {

    private final Cat cat;
    private final Rooster rooster;
    private final Woman woman;

    public House(){
        System.out.println("House initialized.");
        this.cat = new Cat();
        this.rooster = new Rooster();
        this.woman = new Woman();
    }

    public void cleanRats() {
        System.out.println("House cleaning rats.");
        cat.catchRats();
    }

    public void setUpAlarm() {
        System.out.println("House setting up alarm.");
        rooster.waitUntilMorning();
    }

    public void prepareDinner() {
        System.out.println("House praparing dinner.");
        woman.makeFood();
    }
}
