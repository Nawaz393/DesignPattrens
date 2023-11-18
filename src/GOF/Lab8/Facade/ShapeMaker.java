package GOF.Lab8.Facade;

public class ShapeMaker {
   private Shape circle;
   private Shape rectangle;
   private Shape square;
   private Shape triangle;

   public ShapeMaker() {
      circle = new Circle();
      rectangle = new Rectangle();
      square = new Square();
      triangle = new Triangle();

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
}
