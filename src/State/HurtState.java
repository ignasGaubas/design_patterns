package State;

public class HurtState implements SoldierState {

    public HurtState(){
        System.out.println("HurtState initialized.");
    }

    @Override
    public void attack() {
        System.out.println("HurtState attack slow and weak.");
    }
}
