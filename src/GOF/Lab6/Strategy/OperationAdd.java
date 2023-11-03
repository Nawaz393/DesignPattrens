package GOF.Lab6.Strategy;

public class OperationAdd implements Strategy, ComputationHandler {

    public ComputationHandler next;

    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }

    public OperationAdd() {

        this.setNextHandler(null);
    }

    public OperationAdd(ComputationHandler handler) {

        this.setNextHandler(handler);

    }

    @Override
    public void setNextHandler(ComputationHandler handler) {
        this.next = handler;
    }

    @Override
    public int doComputation(int num1, int num2) {

        if (num1 >= 0 && num1 <= 100 && num2 >= 0 && num2 <= 100) {

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