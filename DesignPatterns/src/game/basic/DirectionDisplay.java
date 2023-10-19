package game.basic;

import game.observer.Observer;
import game.strategy.MoveStrategy;
import org.newdawn.slick.Graphics;

public class DirectionDisplay implements Observer {
    private String direction;

    public DirectionDisplay(String direction) {
        this.direction = direction;
    }

    public void Render(Graphics graphics) {
        graphics.drawString(this.direction, 400f, 100f);
    }

    @Override
    public void Inform() {

    }
}
