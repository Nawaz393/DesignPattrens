package GOF.Lab10.TutorilsPointExample.LabWork;

import java.util.Stack;

public class EmployeeIterator implements Iterator {

    private IEmployee root;
    private Stack<IEmployee> stack;

    public EmployeeIterator(IEmployee root) {
        this.root = root;
        this.stack = new Stack<>();

    }

    @Override
    public void preOrder() {
        this.stack.clear();
        preOrderTraversal(root);
    }

    @Override
    public void postOrder() {
        this.stack.clear();
        postOrderTraversal(root);
    }

    @Override
    public void inOrder() {
        this.stack.clear();
        inOrderTraversal(root);
    }

    private void preOrderTraversal(IEmployee node) {

        if (node != null) {
            // visit(node);
            stack.push(node);

            if (node.getSubordinates() != null && node.getSubordinates().size() != 0) {
                for (IEmployee subordinate : node.getSubordinates()) {
                    preOrderTraversal(subordinate);
                }
            }
        }
    }

    private void postOrderTraversal(IEmployee node) {

        if (node != null) {

            if (node.getSubordinates() != null && node.getSubordinates().size() != 0) {
                for (IEmployee subordinate : node.getSubordinates()) {
                    postOrderTraversal(subordinate);
                }
            }
            // visit(node);
            stack.push(node);
        }
    }

    private void inOrderTraversal(IEmployee node) {
        if (node != null) {

            int size = node.getSubordinates() == null ? 0 : node.getSubordinates().size();
            if (size > 0) {
                inOrderTraversal(node.getSubordinates().get(0));
            }
            // visit(node);
            stack.push(node);
            if (node.getSubordinates() != null && node.getSubordinates().size() != 0) {
                for (int i = 1; i < size; i++) {
                    inOrderTraversal(node.getSubordinates().get(i));
                }
            }
        }
    }



    @Override
    public IEmployee next() {
        if (!hasNext()) {
            throw new IllegalStateException("No more elements to iterate");
        }

        return stack.pop();
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }
}
