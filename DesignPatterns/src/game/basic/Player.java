package game.basic;

import game.strategy.MoveStrategy;
import game.observer.Observer;
import org.newdawn.slick.Graphics;

import java.util.ArrayList;

public class Player implements GameObject {
    private ArrayList<MoveStrategy> moveStrategies;
    private int currentMoveStrategy;
    private Observer observer;
    private float x, y;

    public Player(float x, float y, ArrayList<MoveStrategy> moveStrategies, Observer observer) {
        this.x=x;
        this.y=y;
        this.moveStrategies = moveStrategies;
        this.currentMoveStrategy = 0;
        this.observer = observer;
    }

    @Override
    public void Update(float delta) {
        if (this.moveStrategies.get(currentMoveStrategy).StopCondition()) {
            this.currentMoveStrategy++;
            if (this.currentMoveStrategy >= this.moveStrategies.size())
                this.currentMoveStrategy = 0;
            this.observer.Inform(this.moveStrategies.get(currentMoveStrategy).getDirection());
        }
        this.moveStrategies.get(currentMoveStrategy).Move(delta);
    }

    @Override
    public void Render(Graphics graphics) {
        graphics.drawRect(this.moveStrategies.get(currentMoveStrategy).getX(),
                          this.moveStrategies.get(currentMoveStrategy).getY(), 10, 10);
    }

}
