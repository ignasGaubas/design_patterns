package Observer;

public class Demo {
    public static void demo() {
        Auctioneer au = new Auctioneer(100);

        Notifyable b1 = new Bidder("b1");
        Notifyable b2 = new Bidder("b2");
        Notifyable b3 = new Bidder("b3");

        b1.setNotifyer(au);
        b2.setNotifyer(au);
        b3.setNotifyer(au);

        b1.raise(10);
        b2.raise(10);
        b3.raise(10);

        System.out.println();
    }
}
