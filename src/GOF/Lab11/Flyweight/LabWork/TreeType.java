package GOF.Lab11.Flyweight.LabWork;

import java.awt.*;

public class TreeType implements ITree {
    private String name;
    private Color color;
    private String otherTreeData;
    private int countOfFruitTrees;

    private boolean isFruitTree;

    public TreeType(String name, Color color, String otherTreeData, boolean isFruitTree) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
        isFruitTree = this.isFruitTree;
    }

    @Override
    public void draw(Graphics g, int x, int y) {
        if (isFruitTree)
            countOfFruitTrees++;


        
        color = g.getColor()  == Color.ORANGE? color : g.getColor();
        System.out.println("initial color: "+g.getColor());
        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 3, 5);
 System.out.println("first color: "+g.getColor());
        g.setColor(color);
        g.fillOval(x - 5, y - 10, 10, 10);
         System.out.println("last color: "+g.getColor());

    }

    public int CountOfFruitTrees() {

        return countOfFruitTrees;
    }

    public boolean IsFruitTree() {
        return isFruitTree;

    }

}
