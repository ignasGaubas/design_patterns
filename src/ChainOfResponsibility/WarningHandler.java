package ChainOfResponsibility;

public class WarningHandler implements Handler {

    private Handler nextHandler;

    public WarningHandler() {
        System.out.println("WarningHandler initialized.");
    }

    @Override
    public void handle(Message message) {
        if (message.isWarning()) {
            System.out.println("WarningHandler handling message.");
            System.out.println(String.format("Message: %s", message));
        } else {
            System.out.println("WarningHandler not handling message.");
        }

        if (this.nextHandler != null) {
            this.nextHandler.handle(message);
        }
    }

    @Override
    public void setNextHandler(Handler handler) {
        System.out.println("WarningHandler setting next handler.");
        this.nextHandler = handler;
    }
}
