package GOF.Lab1.OopRevision;

public class Projector implements Screen {

    int Size;
    int resolution;
    String manufacturerName;
    public Projector(int size, int resolution, String manufacturerName) {
        Size = size;
        this.resolution = resolution;
        this.manufacturerName = manufacturerName;
    }

    @Override
    public void screenSize() {
        System.out.println("Screen Size is "+Size+" inch");
    }

    @Override
    public void screenResolution() {
        System.out.println("Screen Resolution is "+resolution+"p");

    }

    @Override
    public void manufacturerName() {
        System.out.println("Manufacturer Name is "+manufacturerName);
    }





}
