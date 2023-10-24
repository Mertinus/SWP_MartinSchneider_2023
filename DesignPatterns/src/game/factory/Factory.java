package game.factory;

import game.basic.Canonball;
import game.basic.GameObject;
import game.basic.Projectile;
import game.strategy.MoveLeft;
import game.strategy.MoveRight;
import game.strategy.MoveStrategy;

import java.util.Date;
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

    private static long lastSpawnMilli = 0;
    private static long spawnCooldown = 1000;
    public static GameObject CreateRandomAfterDelay() {
        Date date = new Date();
        long timeMilli = date.getTime();
        if (timeMilli > lastSpawnMilli + spawnCooldown) {
            lastSpawnMilli = timeMilli;
            return Factory.CreateRandom(300f, 400f, 0.05f);
        }
        return null;
    }
}
