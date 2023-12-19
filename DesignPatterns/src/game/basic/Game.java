package game.basic;

import game.factory.Factory;
import game.singleton.Counter;
import game.strategy.MoveLeft;
import game.strategy.MoveRight;
import game.strategy.MoveStrategy;
import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.Date;

public class Game extends BasicGame {
    private ArrayList<GameObject> gameObjects;

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
        gameObjects = new ArrayList<GameObject>();

        //Strategy Pattern
        ArrayList<MoveStrategy> ms = new ArrayList<MoveStrategy>();
        ms.add(new MoveLeft(400f,10f,0.1f));
        ms.add(new MoveRight(400f,10f,0.2f));

        //Observer Pattern
        DirectionDisplay display = new DirectionDisplay("Left");
        gameObjects.add(display);

        gameObjects.add(new Player(0,0, ms, display));

        //Factory Pattern
        gameObjects.add(Factory.CreateRandom(300f, 200f, 0.5f));
        gameObjects.add(Factory.CreateRandom(300f, 220f, 0.5f));
        gameObjects.add(Factory.CreateRandom(300f, 240f, 0.5f));

        //Singleton
        Counter counter = Counter.getInstance();
        Counter counter2 = Counter.getInstance();
        counter.increment();
        System.out.println(counter.getCounter());
        counter2.increment();
        System.out.println(counter.getCounter());
        counter.increment();
        System.out.println(counter.getCounter());
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        GameObject go = Factory.CreateRandomAfterDelay();
        if (go != null) gameObjects.add(go);

        for (GameObject g : gameObjects) {
            g.Update(delta);
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (GameObject g : gameObjects) {
            g.Render(graphics);
        }
    }
}
