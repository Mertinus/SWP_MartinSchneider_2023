import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;
import packages.Field;
import java.util.Scanner;

public class Minesweepers extends BasicGame {
    private Field field = new Field();
    private boolean loseCondition = false;
    private boolean firstMove = true;
    private static final short WINDOW_WIDTH = 800;
    private static final short WINDOW_HEIGHT = 600;

    public Minesweepers() {
        super("Minesweepers");
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Minesweepers());
            container.setDisplayMode(WINDOW_WIDTH,WINDOW_HEIGHT,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

    public void init(GameContainer gameContainer) throws SlickException {
        field = new Field();
    }

    public void update(GameContainer gameContainer, int i) throws SlickException {
        Input input = gameContainer.getInput();
        if (loseCondition) {
            System.out.println("You lost");
            gameContainer.exit();
        }
        else {
            if (Mouse.isButtonDown(0)) {
                if (firstMove) {
                    field.CreateNewField(input.getMouseX(), input.getMouseY());
                    firstMove = false;
                }
                else {
                    loseCondition = field.SetCell(input.getMouseX(), input.getMouseY());
                }
            }
        }
    }

    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        field.RenderField(graphics, WINDOW_WIDTH, WINDOW_HEIGHT);
    }
}