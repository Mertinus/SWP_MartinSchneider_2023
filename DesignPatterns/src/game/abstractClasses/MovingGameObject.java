package game.abstractClasses;

import game.basic.GameObject;
import game.strategy.MoveStrategy;

public abstract class MovingGameObject implements GameObject {
    protected MoveStrategy moveStrategy;

    public MovingGameObject(MoveStrategy moveStrategy) {
        super();
        this.moveStrategy = moveStrategy;
    }

    @Override
    public void Update(float delta) {
        this.moveStrategy.Move(delta);
    }
}
