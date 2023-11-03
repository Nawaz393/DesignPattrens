package GOF.Lab6.Strategy;

public class OperationPower implements Strategy, ComputationHandler {

    public ComputationHandler next;

    public OperationPower() {
        this.setNextHandler(null);
    }

    public OperationPower(ComputationHandler handler) {

        this.setNextHandler(handler);
    }

    @Override
    public int doOperation(int num1, int num2) {

        return (int) Math.pow(num1, num2);
    }

    @Override
    public void setNextHandler(ComputationHandler handler) {
        this.next = handler;
    }

    @Override
    public int doComputation(int num1, int num2) {
        if (num1 > 10000 && num1 <= 200000 && num2 >= 10000 && num2 <= 200000) {

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
