package packages;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

public class Cell {
    public Cell() {
        value = TYPE.EMPTY;
        discovered = false;
        neighbours = 0;
    }

    public Cell(TYPE value, int neighbours, boolean discovered) {
        this.value = value;
        this.discovered = discovered;
        this.neighbours = neighbours;
    }

    public void Render(Graphics g, int x, int y, int w, int h, int border) {
        //g.fillRect(x * (w + border),y * (h + border), w, h);
        g.setColor(new Color(200,200,200));
        g.fillRect(x * 60,y * 60, 50, 50);
        g.setColor(Color.black);
        g.drawString(Integer.toString(this.neighbours),x * 60 + 19,y * 60 + 17);
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

    public enum TYPE { EMPTY,MINE}
    private TYPE value;
    private boolean discovered;
    private int neighbours;
}
