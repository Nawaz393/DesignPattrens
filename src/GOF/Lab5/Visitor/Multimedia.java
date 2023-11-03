package GOF.Lab5.Visitor;


public class Multimedia implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

    @Override
    public void accept(ComputerPartMaintainer computerPartMaintainer) {
        computerPartMaintainer.maintain(this);
    }
}