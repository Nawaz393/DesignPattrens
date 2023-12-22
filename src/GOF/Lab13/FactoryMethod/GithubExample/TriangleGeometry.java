package GOF.Lab13.FactoryMethod.GithubExample;

public class TriangleGeometry extends  Geometery{
    @Override
    public Shape createShape() {
        return new Triangle();
    }
}
