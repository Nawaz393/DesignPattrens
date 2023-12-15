package GOF.Lab12.Memento;

import java.awt.Color;
import java.awt.Graphics;

public class Oval extends BaseShape {


   private int height,width;
   public  Oval(int x, int y, int width, int height, Color color) {
        super(x, y, color);
        this.width = width;
        this.height = height;
      
    }
    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawOval(x, y, getWidth() - 1, getHeight() - 1);
    }
    
}
