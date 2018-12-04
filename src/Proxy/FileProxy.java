package Proxy;

public class FileProxy implements File {

    RealFile file;

    private final boolean read;
    private final boolean write;
    private final boolean delete;

    public FileProxy(boolean read, boolean write, boolean delete) {
        System.out.println(String.format("FileProxy initialized: read %b; write %b; delete %b.", read, write, delete));

        this.file = null;

        this.read = read;
        this.write = write;
        this.delete = delete;
    }

    private void init() {
        if (this.file == null) {
            System.out.println("FileProxy init: RealFile created.");
            this.file = new RealFile();
        } else {
            System.out.println("FileProxy init: RealFile already exists.");
        }
    }

    @Override
    public void read() {
        init();
        if (this.read) {
            System.out.println("FileProxy read.");
            this.file.read();
        } else {
            System.out.println("FileProxy read: access denied.");
        }
    }

    @Override
    public void write() {
        init();
        if (this.write) {
            System.out.println("FileProxy write.");
            this.file.write();
        } else {
            System.out.println("FileProxy write: access denied.");
        }
    }

    @Override
    public void delete() {
        init();
        if (this.delete) {
            System.out.println("FileProxy delete.");
            this.file.delete();
        } else {
            System.out.println("FileProxy delete: access denied.");
        }
    }
}
