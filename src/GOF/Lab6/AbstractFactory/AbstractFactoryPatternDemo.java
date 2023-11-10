package GOF.Lab6.AbstractFactory;

public class AbstractFactoryPatternDemo {
   public static void main(String[] args) {
      // get shape factory
      AbstractFactory shapeFactory = FactoryProducer.getFactory("RoundShape");
      // get an object of Shape Rectangle
      Shape shape1 = shapeFactory.getShape("RECTANGLE");
      // call draw method of Shape Rectangle
      shape1.draw();
      // get an object of Shape Square
      Shape shape2 = shapeFactory.getShape("SQUARE");
      // call draw method of Shape Square
      shape2.draw();
      // get shape factory
      AbstractFactory shapeFactory1 = FactoryProducer.getFactory("");
      // get an object of Shape Rectangle
      Shape shape3 = shapeFactory1.getShape("RECTANGLE");
      // call draw method of Shape Rectangle
      shape3.draw();
      // get an object of Shape Square
      Shape shape4 = shapeFactory1.getShape("SQUARE");
      // call draw method of Shape Square
      shape4.draw();

      AbstractFactory shapeFactory2 = FactoryProducer.getFactory("DoubleBorderShape");
      // get an object of Shape Rectangle
      Shape shape5 = shapeFactory2.getShape("RECTANGLE");
      // call draw method of Shape Rectangle
      shape5.draw();
      // get an object of Shape Square
      Shape shape6 = shapeFactory2.getShape("SQUARE");
      // call draw method of Shape Square
      shape6.draw();

   }
}