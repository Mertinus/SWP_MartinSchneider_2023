package game.basic;

import game.strategy.MoveStrategy;
import org.newdawn.slick.Graphics;

public class Projectile implements GameObject {
    private MoveStrategy moveStrategy;

    public Projectile(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    @Override
    public void Update(float delta) {
        this.moveStrategy.Move(delta);
    }

    @Override
    public void Render(Graphics graphics) {
        graphics.drawOval(moveStrategy.getX(), moveStrategy.getY(), 5, 5);
    }
}
