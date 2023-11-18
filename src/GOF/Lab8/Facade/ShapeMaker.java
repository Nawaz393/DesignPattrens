package GOF.Lab8.Facade;

public class ShapeMaker {
   private Shape circle, rectangle, square, triangle, hexagone;

   public ShapeMaker() {
      circle = new Circle();
      rectangle = new Rectangle();
      square = new Square();
      triangle = new Triangle();
      hexagone = new Hexagone();

   }

   public void drawCircle(String data) {
      circle.draw(data);
   }

   public void drawRectangle(String data) {
      rectangle.draw(data);
   }

   public void drawSquare(String data) {
      square.draw(data);
   }

   public void drawTriangle(String data) {

      triangle.draw(data);
   }

   public void drawHexagone(String data) {

      hexagone.draw(data);
   }
}
