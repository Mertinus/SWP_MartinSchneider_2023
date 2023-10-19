package game.basic;

import game.strategy.MoveLeft;
import game.strategy.MoveRight;
import game.strategy.MoveStrategy;
import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

public class Game extends BasicGame {
    private Player player;
    private DirectionDisplay display;

    public Game() {
        super("Animation Test");
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Game());
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        MoveStrategy ms = new MoveLeft(400f,10f,0.1f);
        player = new Player(ms);
        display = new DirectionDisplay("Left");
    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {
        player.Move();
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        player.Render(graphics);
        display.Render(graphics);
    }
}
