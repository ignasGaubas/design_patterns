package Mediator;

public class Plane {
    private final int id;
    private Airport airport;
    private boolean isLanding;

    public Plane(int id, Airport airport) {
        System.out.println(String.format("Plane initialized, id=%d.", id));
        this.id = id;
        this.airport = airport;
        this.isLanding = true;
    }

    public int getId() {
        System.out.println("Plane getId.");
        return id;
    }

    public void beginLand() {
        if (this.airport.canLand()) {
            System.out.println(String.format("Plane (%d) beginLand OK.", this.id));
            this.airport.beginLand(this.id);
            this.isLanding = true;
        } else {
            System.out.println(String.format("Plane (%d) beginLand REJECTED.", this.id));
        }
    }

    public void endLand() {
        System.out.println(String.format("Plane (%d) endLand.", this.id));
        this.airport.endLand(this.id);
        this.isLanding = false;
    }
}
