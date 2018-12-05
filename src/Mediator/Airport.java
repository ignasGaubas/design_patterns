package Mediator;

public class Airport {

    private boolean isAirportClear;
    private int landingId;

    public Airport() {
        this.isAirportClear = true;
        this.landingId = -1;
    }

    public boolean canLand() {
        System.out.println("Airport canLand.");
        return isAirportClear;
    }

    public void beginLand(int id) {
        System.out.println("Airport beginLand.");
        this.isAirportClear = false;
        this.landingId = id;
    }

    public void endLand(int id) {
        System.out.println("Airport endLand.");
        this.isAirportClear = true;
        this.landingId = -1;
    }
}
