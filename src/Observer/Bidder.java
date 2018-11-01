package Observer;

public class Bidder implements Notifyable {

    private final String name;
    private int lastBidPrice;
    private Auctioneer auctioneer;

    public Bidder(String name){
        System.out.println("Bidder " + name + " initialized.");
        this.name = name;
        lastBidPrice = 0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setNotifyer(Auctioneer auctioneer) {
        System.out.println("Bidder " + name + " is subscribing to auctioneer.");
        this.auctioneer = auctioneer;
        this.auctioneer.subscribe(this);
    }

    @Override
    public void raise(int size) {
        System.out.println("Bidder " + name + " is raising by " + size);
        auctioneer.raise(size);
    }

    @Override
    public void notify(int price) {
        System.out.println("Bidder " + name + " was notified that new price is " + price);
        lastBidPrice = price;
    }
}
