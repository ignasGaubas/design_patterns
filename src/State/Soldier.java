package State;

public class Soldier {

    SoldierState state;

    public Soldier() {
        System.out.println("Soldier initialized.");
        this.state = new HealthyState();
    }

    public void attack() {
        System.out.println("Soldier attacking.");
        this.state.attack();
    }

    public void sneak() {
        System.out.println("Soldier sneaking.");
        this.state = new SneakingState();
    }

    public void getShot(){
        System.out.println("Soldier got shot.");
        this.state = new HurtState();
    }

    public void heal(){
        System.out.println("Soldier healing.");
        this.state = new HealthyState();
    }
}
