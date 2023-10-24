package game.basic;

import game.abstractClasses.MovingGameObject;
import game.strategy.MoveStrategy;
import org.newdawn.slick.Graphics;

public class Projectile extends MovingGameObject {

    public Projectile(MoveStrategy moveStrategy) {
        super(moveStrategy);
    }

    @Override
    public void Render(Graphics graphics) {
        graphics.drawOval(moveStrategy.getX(), moveStrategy.getY(), 5, 5);
    }
}
