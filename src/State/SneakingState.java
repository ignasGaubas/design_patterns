package State;

public class SneakingState implements SoldierState {

    public SneakingState() {
        System.out.println("SneakingState initialized.");
    }

    @Override
    public void attack() {
        System.out.println("SneakingState attack slow and strong.");
    }
}
