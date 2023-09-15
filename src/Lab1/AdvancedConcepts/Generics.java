package Lab1.AdvancedConcepts;

public class Generics<T> {
    T anytype;

    public T getAnytype() {
        return anytype;
    }

    public void setAnytype(T anytype) {
        this.anytype = anytype;
    }

    public Generics(T anytype) {
        this.anytype = anytype;
    }

    public  void print(){

        System.out.println( anytype);

    }





}
