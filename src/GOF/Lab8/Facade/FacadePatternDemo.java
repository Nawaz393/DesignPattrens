package GOF.Lab8.Facade;

public class FacadePatternDemo {
   public static void main(String[] args) {
      ShapeMaker shapeMaker = new ShapeMaker();

      shapeMaker.drawCircle("Red,Green,Blue");
      shapeMaker.drawRectangle("Red,Green,Blue");
      shapeMaker.drawSquare("Red,Green,Blue");
      shapeMaker.drawTriangle("Red,Green,Blue");
      shapeMaker.drawHexagone("Red,Green,Blue");

   }
}
