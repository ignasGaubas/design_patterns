package ChainOfResponsibility;

public class ErrorHandler implements Handler {

    private Handler nextHandler;

    public ErrorHandler() {
        System.out.println("ErrorHandler initialized.");
    }

    @Override
    public void handle(Message message) {
        if (message.isError()) {
            System.out.println("ErrorHandler handling message.");
            System.out.println(String.format("Message: %s", message));
        } else {
            System.out.println("ErrorHandler not handling message.");
        }

        if (this.nextHandler != null) {
            this.nextHandler.handle(message);
        }
    }

    @Override
    public void setNextHandler(Handler handler) {
        System.out.println("ErrorHandler setting next handler.");
        this.nextHandler = handler;
    }
}
