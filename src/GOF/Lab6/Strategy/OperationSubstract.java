package GOF.Lab6.Strategy;

public class OperationSubstract implements Strategy, ComputationHandler {

   public ComputationHandler next;

   public OperationSubstract() {

      this.setNextHandler(null);
   }

   public OperationSubstract(ComputationHandler handler) {

      this.setNextHandler(handler);
   }

   @Override
   public int doOperation(int num1, int num2) {
      return num1 - num2;
   }

   @Override
   public void setNextHandler(ComputationHandler handler) {
      this.next = handler;
   }

   @Override
   public int doComputation(int num1, int num2) {
      if (num1 > 100 && num1 <= 1000 && num2 >= 100 && num2 <= 1000) {

         return doOperation(num1, num2);
      }

      else if (next != null) {

         return next.doComputation(num1, num2);
      } else {
         System.out.println("operation Not Supported  ");
         return -1;
      }
   }
}