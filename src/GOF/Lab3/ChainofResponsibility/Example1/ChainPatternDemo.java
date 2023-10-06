package GOF.Lab3.ChainofResponsibility.Example1;

public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers() {

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        AbstractLogger databaseLogger = new DatabaseLogger(AbstractLogger.Warning);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        consoleLogger.setNextLogger(databaseLogger);

        return errorLogger;
    }

    private static AbstractLogger getNewChainofLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        AbstractLogger databaseLogger = new DatabaseLogger(AbstractLogger.Warning);
        errorLogger.setNextLogger(consoleLogger);
        consoleLogger.setNextLogger(databaseLogger);
        return errorLogger;

    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getNewChainofLoggers();
        loggerChain.logMessage(AbstractLogger.INFO,
                "This is an information.");
        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is an debug level information.");
        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
        loggerChain.logMessage(AbstractLogger.Warning, "This is a warning information");
    }
}