package GOF.Lab4.Iterator;

public interface Iterator {
    public boolean hasNext();

    public Object next();
    public Object previous();
    public Object moveToFirst();
    public Object moveToLast();
}