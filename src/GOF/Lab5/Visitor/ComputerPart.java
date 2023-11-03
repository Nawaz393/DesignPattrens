package GOF.Lab5.Visitor;


public interface ComputerPart {
     void accept(ComputerPartVisitor computerPartVisitor);
     void accept(ComputerPartMaintainer computerPartMaintainer);
}