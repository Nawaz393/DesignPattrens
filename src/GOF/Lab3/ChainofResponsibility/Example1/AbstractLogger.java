package GOF.Lab3.ChainofResponsibility.Example1;

public abstract class AbstractLogger {
   public static int INFO = 1;
   public static int DEBUG = 2;
   public static int ERROR = 3;
   public static int Warning = 4;

   protected int level;

   protected AbstractLogger nextLogger;

   public void setNextLogger(AbstractLogger nextLogger) {
      this.nextLogger = nextLogger;
   }

   public void logMessage(int level, String message) {
      if (this.level == level) {
         write(message);
         
      }
      if (nextLogger != null) {
         nextLogger.logMessage(level, message);
      } else if (nextLogger == null) {

         System.out.println("this is an unsupported action");
      }

   }

   abstract protected void write(String message);

}