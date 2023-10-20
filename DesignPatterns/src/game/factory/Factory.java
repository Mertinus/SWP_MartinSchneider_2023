package game.factory;

import game.basic.Canonball;
import game.basic.GameObject;
import game.basic.Projectile;
import game.strategy.MoveLeft;
import game.strategy.MoveRight;
import game.strategy.MoveStrategy;

import java.util.Random;

public class Factory {
    public static GameObject CreateRandom(float x, float y, float speed) {
        Random rnd = new Random();
        MoveStrategy moveStrategy;
        if (rnd.nextInt(2) == 0)
            moveStrategy = new MoveLeft(x, y, speed);
        else
            moveStrategy = new MoveRight(x, y, speed);

        if (rnd.nextInt(2) == 0) {
            return new Canonball(moveStrategy);
        }
        else {
            return new Projectile(moveStrategy);
        }
    }
}
