package GOF.Lab13.FactoryMethod.GithubExample;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<Shape>();

        List<Shape> shapesFromOneFactory=new ArrayList<>();


        CircleGeometry circleGeometry = new CircleGeometry();
        SquareGeometry squareGeometry = new SquareGeometry();
        TriangleGeometry triangleGeometry=new TriangleGeometry();
        ShapeGeometry factory=new ShapeGeometry();


        shapes.add(circleGeometry.createShape());
        shapes.add(squareGeometry.createShape());
        shapes.add(squareGeometry.createShape());
        shapes.add(triangleGeometry.createShape());


        shapesFromOneFactory.add(factory.create("circle"));
        shapesFromOneFactory.add(factory.create("square"));
        shapesFromOneFactory.add(factory.create("triangle"));


        for(Shape s:shapes){
            s.draw();
        }

        System.out.println("----------------display shapes from one factory------------------");

        for (Shape s:shapesFromOneFactory){
            s.draw();
        }

    }

}