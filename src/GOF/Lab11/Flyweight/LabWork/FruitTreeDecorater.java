package GOF.Lab11.Flyweight.LabWork;

import java.awt.Color;
import java.awt.Graphics;

public class FruitTreeDecorater implements ITree {

    TreeType tree;
    Color color = Color.BLUE;

    public FruitTreeDecorater(TreeType tree) {

        this.tree = tree;

    }

    @Override
    public void draw(Graphics g, int x, int y) {
        g.setColor(color);
        tree.draw(g, x, y);
    }

}
