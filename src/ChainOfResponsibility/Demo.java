package ChainOfResponsibility;

public class Demo {
    public static void demo() {
        System.out.println("*** Chain of Responsibility pattern ***");

        Handler errorHandler = new ErrorHandler();
        Handler warningHandler = new WarningHandler();
        errorHandler.setNextHandler(warningHandler);

        Handler infoHandler = new InfoHandler();
        warningHandler.setNextHandler(infoHandler);

        Message m1 = new Message(true, true, true);
        errorHandler.handle(m1);

        Message m2 = new Message(false, false, true);
        errorHandler.handle(m2);

        System.out.println();
    }
}
