package GOF.Lab8.Facade;

public class Triangle extends Shape {

    @Override
    public void draw(String data) {
        super.draw(data);
        System.out.println("triangle::draw()");
    }

}
