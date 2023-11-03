package GOF.Lab6.Strategy;

public interface ComputationHandler {

    void setNextHandler(ComputationHandler handler);
    int doComputation(int num1, int num2);

}
