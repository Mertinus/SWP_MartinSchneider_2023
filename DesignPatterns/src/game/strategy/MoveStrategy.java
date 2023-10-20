package game.strategy;

public interface MoveStrategy {
    void Move(float delta);
    float getX();
    float getY();
    String getDirection();
    Boolean StopCondition();
}
