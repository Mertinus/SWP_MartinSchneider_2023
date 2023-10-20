package game.strategy;

public class MoveLeft implements MoveStrategy {
    private float x, y, speed;
    private final String direction = "Left";

    public MoveLeft(float x, float y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    @Override
    public void Move(float delta) {
        this.x -= speed * delta;
    }

    @Override
    public Boolean StopCondition() {
        if (this.x < 0)
            return true;
        return false;
    }

    @Override
    public float getX() {
        return this.x;
    }

    @Override
    public float getY() {
        return this.y;
    }

    @Override
    public String getDirection() {
        return this.direction;
    }
}
