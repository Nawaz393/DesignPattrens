package GOF.Lab6.Strategy;

public class StrategyPatternDemo {
   public static void main(String[] args) {
      // Context context = new Context(new OperationAdd());		
      // System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

      // context = new Context(new OperationSubstract());		
      // System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

      // context = new Context(new OperationMultiply());		
      // System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

      Strategy power = new OperationPower();
      Context context = new Context(power);

      System.out.println("--------------Operations using chain-----------------");
      System.out.println(context.computeInRange(1000, 999));
      System.out.println(context.computeInRange(100, 100));
   

      System.out.println("-----------Operation using direct Strategy---------------");

      System.out.println(context.executeStrategy(2, 99));
   }
}