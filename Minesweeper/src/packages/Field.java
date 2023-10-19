package packages;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Line;
import org.newdawn.slick.geom.Rectangle;
import org.w3c.dom.Text;

import java.util.List;
import java.util.Random;

public class Field {
    public Field() {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                field[x][y] = new Cell(Cell.TYPE.EMPTY, 0, false);
            }
        }
    }

    public void CreateNewField(int xClicked, int yClicked) {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                if (Math.sqrt(Math.pow(x-xClicked,2) + Math.pow(y-yClicked,2)) < 3) {
                    field[x][y] = new Cell(Cell.TYPE.EMPTY, 0, true);
                }
                else {
                    field[x][y] = new Cell(Cell.TYPE.EMPTY, 0, false);
                }
            }
        }
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int mineX = random.nextInt(width);
            int mineY = random.nextInt(height);
            if (!field[mineX][mineY].GetDiscovered()) {
                field[mineX][mineY] = new Cell(Cell.TYPE.MINE, 0, false);
            }
            else
                i--;
        }
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                int n = CountNeighbours(x,y);
                field[x][y].SetNeighbours(n);
            }
        }
    }

    public void RenderField(Graphics g, short w, short h) {
        // Print all cells:
        int border = 5;
        for (int y = 0; y < this.height; y++) {
            for (int x = 0; x < this.width; x++) {
                field[x][y].Render(g,x,y,w/this.width-border*this.width,h/this.height-border*this.height,5);
            }
        }
    }

    private int CountNeighbours(int x, int y) {
        int neighbourCount = 0;
        for (int h = -1; h < 2; h++)
            neighbourCount = CheckNeighbourIncrement(neighbourCount, x-1, y+h);
        for (int h = -1; h < 2; h++)
            neighbourCount = CheckNeighbourIncrement(neighbourCount, x+1, y+h);
        neighbourCount = CheckNeighbourIncrement(neighbourCount, x, y+1);
        neighbourCount = CheckNeighbourIncrement(neighbourCount, x, y-1);
        return neighbourCount;
    }

    private int CheckNeighbourIncrement(int nCount, int x, int y)
    {
        if (x >= 0 && y >= 0 && x < width && y < height && field[x][y].GetValue() == Cell.TYPE.MINE)
            return nCount + 1;
        return nCount;
    }

    public boolean SetCell(int x, int y) {
        if (x >= 0 && x < width && y >= 0 && y < height) {
            field[x][y].SetDiscovered(true);
            if (field[x][y].GetValue() == Cell.TYPE.MINE)
                return true;
        }

        return false;
    }

    private final int width = 10;
    private final int height = 7;
    private Cell field[][] = new Cell[width][height];
}
