package Observer;

import java.util.ArrayList;
import java.util.List;

public class Auctioneer {

    private int lastPrice;
    private List<Notifyable> bidders;

    public Auctioneer(int startingPrice) {
        System.out.println("Auctioneer initialized.");
        lastPrice = startingPrice;
        bidders = new ArrayList<>();
    }

    public void subscribe(Notifyable subscriber) {
        System.out.println("Bidder " + subscriber.getName() + " subscribed to auctioneer.");
        bidders.add(subscriber);
    }

    public void raise(int size) {
        lastPrice += size;
        for (Notifyable b : bidders) {
            b.notify(lastPrice);
        }
    }
}
