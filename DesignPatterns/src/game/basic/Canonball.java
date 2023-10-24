package game.basic;

import game.abstractClasses.MovingGameObject;
import game.strategy.MoveStrategy;
import org.newdawn.slick.Graphics;

public class Canonball extends MovingGameObject {
    public Canonball(MoveStrategy moveStrategy) {
        super(moveStrategy);
    }

    @Override
    public void Render(Graphics graphics) {
        graphics.fillOval(moveStrategy.getX(), moveStrategy.getY(), 10, 10);
    }
}
