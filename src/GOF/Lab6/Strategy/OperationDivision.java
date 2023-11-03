package GOF.Lab6.Strategy;

public class OperationDivision implements Strategy, ComputationHandler {

    public ComputationHandler next;

    public OperationDivision() {

        this.setNextHandler(null);
    }

    public OperationDivision(ComputationHandler handler) {

        this.setNextHandler(handler);
    }

    @Override
    public int doOperation(int num1, int num2) {

        if (num2 == 0) {
            throw new IllegalArgumentException(" num can not divid by 0");
        }
        try {
            int result = num1 / num2;
            return result;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        return 0;

    }

    @Override
    public void setNextHandler(ComputationHandler handler) {
        this.next = handler;
    }

    @Override
    public int doComputation(int num1, int num2) {

        if (num1 > 5000 && num1 <= 10000 && num2 >= 5000 && num2 <= 10000) {

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
