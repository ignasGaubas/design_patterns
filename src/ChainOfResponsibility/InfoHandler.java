package ChainOfResponsibility;

public class InfoHandler implements Handler {

    private Handler nextHandler;

    public InfoHandler() {
        System.out.println("InfoHandler initialized.");
    }

    @Override
    public void handle(Message message) {
        if (message.isInfo()) {
            System.out.println("InfoHandler handling message.");
            System.out.println(String.format("Message: %s", message));
        } else {
            System.out.println("InfoHandler not handling message.");
        }

        if (this.nextHandler != null) {
            this.nextHandler.handle(message);
        }
    }

    @Override
    public void setNextHandler(Handler handler) {
        System.out.println("InfoHandler setting next handler.");
        this.nextHandler = handler;
    }
}