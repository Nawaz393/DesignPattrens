package GOF.Lab8.Facade;

public class Hexagone extends Shape {
    
    @Override
    public void draw(String data) {
       super.draw(data);
       System.out.println("Hexagone::draw()");
 
    }
}
