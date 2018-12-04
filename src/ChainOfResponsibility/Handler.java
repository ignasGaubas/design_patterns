package ChainOfResponsibility;

public interface Handler {
    void handle(Message message);

    void setNextHandler(Handler handler);
}
