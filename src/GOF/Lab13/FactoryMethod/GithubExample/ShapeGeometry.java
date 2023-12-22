package GOF.Lab13.FactoryMethod.GithubExample;

public class ShapeGeometry {


    public  Shape create(String name){

        return switch (name.toLowerCase()) {
            case "circle" -> new Circle();
            case "square" -> new Square();
            case "triangle" -> new Triangle();
            default -> null;
        };
    }
}
