package GOF.Lab10.TutorilsPointExample.LabWork;

public interface Iterator {
    public void preOrder();

    public void postOrder();

    public void inOrder();

    public IEmployee next();

    public boolean hasNext();

}
