package packages;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

public class Cell {
    public Cell() {
        value = TYPE.EMPTY;
        discovered = false;
        neighbours = 0;
        this.pixelXPos = 0;
        this.pixelYPos = 0;
    }

    public Cell(TYPE value, int neighbours, boolean discovered, int x, int y) {
        this.value = value;
        this.discovered = discovered;
        this.neighbours = neighbours;
        this.xPos = x;
        this.yPos = y;
        this.pixelXPos = x * SIZE + x * MARGIN;
        this.pixelYPos = y * SIZE + y * MARGIN;
    }

    public void Render(Graphics g, int x, int y, int w, int h, int border) {
        //g.fillRect(x * (w + border),y * (h + border), w, h);
        if (this.discovered) {
            g.setColor(new Color(200, 200, 200));
            g.fillRect(pixelXPos, pixelYPos, SIZE, SIZE);
            g.setColor(Color.black);
            g.drawString(Integer.toString(this.neighbours), x * (SIZE+MARGIN) + 19, y * (SIZE+MARGIN) + 17);
        }
        else {
            g.setColor(new Color(50, 50, 50));
            g.fillRect(pixelXPos, pixelYPos, SIZE, SIZE);
            g.setColor(Color.black);
        }
    }

    public boolean IsPointInCell(int x, int y) {
        if (x >= pixelXPos && x <= pixelXPos + SIZE && y >= pixelYPos && y <= pixelYPos + SIZE) {
            return true;
        }
        return false;
    }

    public void SetNeighbours(int n) {
        neighbours = n;
    }
    public int GetNeighbours() {
        return neighbours;
    }

    public TYPE GetValue() {
        return value;
    }

    public void SetDiscovered(boolean state) {
        discovered = state;
    }
    public boolean GetDiscovered() {
        return discovered;
    }

    public int GetXPos() {
        return xPos;
    }
    public int GetYPos() {
        return yPos;
    }
    public int GetPixelXPos() {
        return pixelXPos;
    }
    public int GetPixelYPos() {
        return pixelYPos;
    }

    public static final int SIZE = 50; //pixel
    public static final int MARGIN = 10; //pixel
    public enum TYPE { EMPTY,MINE}
    private TYPE value;
    private int pixelXPos;
    private int pixelYPos;
    private int xPos;
    private int yPos;
    private boolean discovered;
    private int neighbours;
}
