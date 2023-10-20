package game.strategy;

public class MoveRight implements MoveStrategy {
    private float x, y, speed;
    private final String direction = "Right";

    public MoveRight(float x, float y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    @Override
    public void Move(float delta) {
        this.x += speed;
    }

    @Override
    public Boolean StopCondition() {
        if (this.x > 800)
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
