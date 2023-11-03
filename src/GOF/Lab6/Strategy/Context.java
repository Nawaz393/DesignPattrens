package GOF.Lab6.Strategy;

public class Context {
   private Strategy strategy;
   private Strategy chain;

   public Context(Strategy strategy) {
      this.strategy = strategy;
      this.chain = new OperationAdd(
            new OperationSubstract(new OperationMultiply(new OperationDivision(new OperationPower()))));
   }

   public int executeStrategy(int num1, int num2) {
      return strategy.doOperation(num1, num2);

   }

   public int computeInRange(int num1, int num2) {

      return chain.doComputation(num1, num2);
   }
}
