package GOF.Lab8.Facade;

public class Circle extends Shape {

   @Override
   public void draw(String data) {
      super.draw(data);
      System.out.println("Circle::draw()");
   }
}
