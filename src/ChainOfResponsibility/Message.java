package ChainOfResponsibility;

public class Message {
    private final boolean error;
    private final boolean warning;
    private final boolean info;

    public Message(boolean error, boolean warning, boolean info) {
        System.out.println(String.format("Message initialized: error %b, warning %b, info: %b.", error, warning, info));
        this.error = error;
        this.warning = warning;
        this.info = info;
    }

    public boolean isError() {
        return this.error;
    }

    public boolean isWarning() {
        return this.warning;
    }

    public boolean isInfo() {
        return this.info;
    }

    @Override
    public String toString() {
        return String.format("Message: error %b, warning %b, info: %b.", this.error, this.warning, this.info);
    }
}
