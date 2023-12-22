package GOF.Lab13.FactoryMethod.GithubExample;

public class SquareGeometry extends Geometery{

    @Override
    public Shape createShape() {
        return new Square();
    }

}