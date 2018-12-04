package State;

public class HealthyState implements SoldierState {

    public HealthyState() {
        System.out.println("HealthyState initialized.");
    }

    @Override
    public void attack() {
        System.out.println("HealthyState attack quick and strong.");
    }
}
