package game.basic;

import game.strategy.MoveStrategy;
import game.observer.Observer;
import org.newdawn.slick.Graphics;

public class Player {
    private MoveStrategy moveStrategy;
    private Observer observer;

    public Player(MoveStrategy ms) {
        this.moveStrategy = ms;
    }

    public void Move() {
        moveStrategy.Move();
    }

    public void Render(Graphics graphics) {
        graphics.drawRect(this.moveStrategy.GetX(), this.moveStrategy.GetY(), 10, 10);
    }

}
