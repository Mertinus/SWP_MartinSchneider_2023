package game.basic;

import game.strategy.MoveStrategy;
import org.newdawn.slick.Graphics;

public class Canonball implements GameObject {
    private MoveStrategy moveStrategy;

    public Canonball(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    @Override
    public void Update(float delta) {
        this.moveStrategy.Move(delta);
    }

    @Override
    public void Render(Graphics graphics) {
        graphics.fillOval(moveStrategy.getX(), moveStrategy.getY(), 10, 10);
    }
}
