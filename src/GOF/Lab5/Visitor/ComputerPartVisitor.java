

package GOF.Lab5.Visitor;

public interface ComputerPartVisitor {
     void visit(Computer computer);

     void visit(Mouse mouse);

     void visit(Keyboard keyboard);

     void visit(Monitor monitor);

     void visit(Multimedia multimedia);
}