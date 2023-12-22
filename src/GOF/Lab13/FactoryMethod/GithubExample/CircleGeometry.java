package GOF.Lab13.FactoryMethod.GithubExample;

public class CircleGeometry extends Geometery{

    @Override
    public Shape createShape() {
        return new Circle();
    }

}
