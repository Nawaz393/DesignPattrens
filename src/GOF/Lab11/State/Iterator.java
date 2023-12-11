package GOF.Lab11.State;

public interface Iterator {
    public boolean hasNext();
    public boolean hasPrevious();
    public String  previous();
    public String next();

}
