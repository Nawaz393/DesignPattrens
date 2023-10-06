package GOF.Lab3.ChainofResponsibility.Example1;

public class DatabaseLogger extends AbstractLogger {

    public DatabaseLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Database Logger::" + message);
    }

}
