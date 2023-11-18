package GOF.Lab8.Facade;

public class Square extends Shape {

   @Override
   public void draw(String data) {
      super.draw(data);
      System.out.println("Square::draw()");
   }
}
