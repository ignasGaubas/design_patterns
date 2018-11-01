package Observer;

public interface Notifyable {
    public void notify(int price);
    public String getName();
    public void setNotifyer(Auctioneer auctioneer);
    public void raise(int size);
}
