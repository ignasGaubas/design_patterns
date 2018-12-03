package Flyweight;


public class ThreadFactory {

    private Thread fastThread = null;
    private Thread mediumThread = null;
    private Thread slowThread = null;

    public ThreadFactory() {
        System.out.println("ThreadFactory initialized.");
    }

    public Thread getFastThread() {
        System.out.println("ThreadFactory getFastThread");

        if (this.fastThread != null) {
            return this.fastThread;
        } else {
            this.fastThread = new FastThread(1);
            return this.fastThread;
        }
    }

    public Thread getMediumThread() {
        System.out.println("ThreadFactory getMediumThread");

        if (this.mediumThread != null) {
            return this.mediumThread;
        } else {
            this.mediumThread = new MediumThread(1);
            return this.mediumThread;
        }
    }

    public Thread getSlowThread() {
        System.out.println("ThreadFactory getSlowThread");

        if (this.slowThread != null) {
            return this.slowThread;
        } else {
            this.slowThread = new SlowThread(1);
            return this.slowThread;
        }
    }
}